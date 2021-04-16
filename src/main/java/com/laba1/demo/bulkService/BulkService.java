package com.laba1.demo.bulkService;

import com.laba1.demo.collision.ZCollisionField;
import com.laba1.demo.queryCfg.QueryCfg;
import com.laba1.demo.service.ZService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BulkService {

    @Autowired
    ZService zService;

    public List<ZCollisionField> bulkCalculation(List<QueryCfg> queryCfgList) {
        return queryCfgList
                .stream()
                .map(x -> zService.calculate(x.getWeight1(), x.getSpeed1(), x.getWeight2(), x.getSpeed2()))
                .collect(Collectors.toList());
    }

    public IntSummaryStatistics bulkAggregation(List<QueryCfg> queryCfgList) {
        return bulkCalculation(queryCfgList)
                .stream()
                .collect(Collectors.summarizingInt(ZCollisionField::getAfterColisionanswer));
    }

}

