package com.laba1.demo.service;

import com.laba1.demo.cache.Cache;
import com.laba1.demo.collision.ZCollisionField;
import com.laba1.demo.controller.ZController;

import com.laba1.demo.queryCfg.QueryCfg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.stereotype.Service;

import java.util.Queue;
import java.util.logging.Logger;

@Service
public class ZService {
    private static final Logger logger = Logger.getLogger(String.valueOf(ZController.class));
    @Autowired
    private Cache cache;

    public ZService() {
    }


    public ZCollisionField calculate(int weight1, int speed1, int weight2, int speed2) {

        Integer answer;
        QueryCfg queryCfg = new QueryCfg(weight1, speed1, weight2, speed2);
        if (cache.getAnsw(queryCfg) != null) {
            answer = cache.getAnsw(queryCfg);
        } else {
            logger.info("Calculating collision...");
            answer = Math.abs(weight1 * speed1) - Math.abs(weight2 * speed2);
            cache.putAnsw(queryCfg, answer);
        }
        ZCollisionField zCollisionField = new ZCollisionField(weight1, speed1, weight2, speed2, answer);
        logger.info(String.format("Collision result: %d", zCollisionField.getAfterColisionanswer()));
        return zCollisionField;
    }


}
