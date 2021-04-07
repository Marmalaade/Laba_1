package com.laba1.demo.cache;

import com.laba1.demo.controller.ZController;
import com.laba1.demo.queryCfg.QueryCfg;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;


@Component
public class Cache {
    private static final Logger logger = Logger.getLogger(String.valueOf(ZController.class));
    Map<QueryCfg, Integer> answMap = new HashMap<>();

    public Integer getAnsw(QueryCfg queryCfg) {
        Integer answer = answMap.get(queryCfg);
        if (answer == null) {
            return answer;
        } else {
            logger.info("Received result from cache" + " " + answer);
            return answer;
        }
    }

    public void putAnsw(QueryCfg queryCfg, Integer answer) {
        logger.info("Put in cache " + " " + answer);
        answMap.put(queryCfg, answer);

    }

}
