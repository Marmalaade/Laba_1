package com.laba1.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Laba1restApplication
{
    public static void main(String[] args) {
        SpringApplication.run(Laba1restApplication.class, args);
    }
}
