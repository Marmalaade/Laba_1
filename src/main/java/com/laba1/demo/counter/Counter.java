package com.laba1.demo.counter;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    private static final AtomicInteger hitsCounter = new AtomicInteger();

    public static Integer get() {
        return hitsCounter.get();
    }

    public static void add() {
        hitsCounter.incrementAndGet();
    }
}
