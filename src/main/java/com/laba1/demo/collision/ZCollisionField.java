package com.laba1.demo.collision;


import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class ZCollisionField {

    private  int weight1;
    private  int speed1;
    private  int weight2;
    private  int speed2;
    private  Integer afterColisionanswer;

    public ZCollisionField(int weight1, int speed1, int weight2, int speed2, Integer afterColisionanswer) {
        this.weight1 = weight1;
        this.speed1 = speed1;
        this.weight2 = weight2;
        this.speed2 = speed2;
        this.afterColisionanswer = afterColisionanswer;
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

    public int getAfterColisionanswer() {
        return afterColisionanswer.intValue();
    }

    public void setAfterColisionanswer(int afterColisionanswer) {
        this.afterColisionanswer = afterColisionanswer;
    }
}
