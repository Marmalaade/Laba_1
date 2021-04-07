package com.laba1.demo.controller;


import com.laba1.demo.counter.Counter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CounterController {
    @GetMapping("/count")
    public  int getCount() {
        return Counter.get();
    }
}
