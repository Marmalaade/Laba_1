package com.laba1.demo.cache;

import com.laba1.demo.controller.ZController;
import com.laba1.demo.queryCfg.QueryCfg;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;


@Component
public class Cache {
    private static final Logger logger = Logger.getLogger(String.valueOf(ZController.class));
    private final Map<QueryCfg, Integer> answMap = new HashMap<>();

    public Integer getAnsw(QueryCfg queryCfg) {
        Integer answer = answMap.get(queryCfg);
        if (answer != null) {
            logger.info("Received result from cache" + " " + answer);
        }
        return answer;
    }

    public void clear() {
        answMap.clear();
    }

    public Set<QueryCfg> getQueries() {
        return answMap.keySet();
    }

    public void putAnsw(QueryCfg queryCfg, Integer answer) {
        logger.info("Put in cache " + " " + answer);
        answMap.put(queryCfg, answer);

    }

}
