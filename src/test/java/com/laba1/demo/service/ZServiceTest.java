package com.laba1.demo.service;

import com.laba1.demo.collision.ZCollisionField;
import com.laba1.demo.queryCfg.QueryCfg;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZServiceTest {

    @Test
    public void onlyCalculateTesting() {
        ZService zService = new ZService();
        ZCollisionField trueAnswer=zService.onlyCalculateTesting(2,4,5,1);
        Assert.assertEquals(3, trueAnswer.getAfterColisionanswer());
    }
}