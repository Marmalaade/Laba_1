package com.laba1.demo.controller;


import com.laba1.demo.bulkService.BulkService;
import com.laba1.demo.cache.Cache;
import com.laba1.demo.collision.ZCollisionField;
import com.laba1.demo.entityes.AnswerEntity;
import com.laba1.demo.exceptions.DataValidationException;
import com.laba1.demo.service.ZService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;


@RestController

public class ZController {
    private static final String FAKE_UNCHECKED_EXCEPTION = "Fake unchecked exception";
    private static final Logger logger = Logger.getLogger(String.valueOf(ZController.class));
    private static final String WEIGHT_ERROR = "Weight must be greater than zero";

    @Autowired
    ZService zService;
    @Autowired
    BulkService bulkService;

    @Autowired
    AnswersRepository answersRepository;

    @GetMapping("/getAnswers")
    public List<AnswerEntity> getEmployee(){
        return answersRepository.findAll();

    }

    @PostMapping("/putAnswers")
    public void createEmployee() {
        int id = 0;
        Cache cache = zService.getCache();
        for (QueryCfg cfg : cache.getQueries()) {
            AnswerEntity entity = new AnswerEntity();
            entity.setAnswerId(id++);
            entity.setAsnwer_value(cache.getAnsw(cfg));
            answersRepository.save(entity);
        }
        cache.clear();
    }


    @PostMapping("/postFirst")
    public ResponseEntity bulkAnswer(@RequestBody List<QueryCfg> queryCfgList) {
        return ResponseEntity.ok(bulkService.bulkCalculation(queryCfgList));
    }

    @PostMapping("/postSecond")
    public ResponseEntity bulkAggregation(@RequestBody List<QueryCfg> queryCfgList) {
        return ResponseEntity.ok(bulkService.bulkAggregation(queryCfgList));
    }

    @GetMapping("/calculation")

    public ResponseEntity calculate(
            @RequestParam(name = "x1") int weight1,
            @RequestParam(name = "y1") int speed1,
            @RequestParam(name = "x2") int weight2,
            @RequestParam(name = "y2") int speed2
    ) throws DataValidationException {

        ZCollisionField zCollisionField = zService.calculate(weight1, speed1, weight2, speed2);

        if (weight1 <= 0 || weight2 <= 0) {
            logger.info(WEIGHT_ERROR);
            throw new DataValidationException();
        }
        if (speed1 > 100 || speed2 > 100) {
            logger.info(FAKE_UNCHECKED_EXCEPTION);
            throw new RuntimeException();
        }
        return ResponseEntity.ok(zCollisionField);

    }
}
