package com.laba1.demo.queryCfg;

import java.util.Objects;

public class QueryCfg {

    private int weight1;
    private int speed1;
    private int weight2;
    private int speed2;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QueryCfg queryCfg = (QueryCfg) o;
        return weight1 == queryCfg.weight1 && speed1 == queryCfg.speed1 && weight2 == queryCfg.weight2 && speed2 == queryCfg.speed2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight1, speed1, weight2, speed2);
    }


    public int getWeight1() {
        return weight1;
    }

    public void setWeight1(int weight1) {
        this.weight1 = weight1;
    }

    public int getSpeed1() {
        return speed1;
    }

    public void setSpeed1(int speed1) {
        this.speed1 = speed1;
    }

    public int getWeight2() {
        return weight2;
    }

    public void setWeight2(int weight2) {
        this.weight2 = weight2;
    }

    public int getSpeed2() {
        return speed2;
    }

    public void setSpeed2(int speed2) {
        this.speed2 = speed2;
    }

    public QueryCfg(int weight1, int speed1, int weight2, int speed2) {
        this.weight1 = weight1;
        this.speed1 = speed1;
        this.weight2 = weight2;
        this.speed2 = speed2;
    }

}

