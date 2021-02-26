package com.laba1.demo.Service;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

public class ZService
{

    private final int afterCollisionAnswer;

    private final int weight1;
    private final int speed1;

    private final int weight2;

    private final int speed2;

    public int getAfterCollisionAnswer() {
        return afterCollisionAnswer;
    }

    public int getWeight1() {
        return weight1;
    }

    public int getSpeed1() {
        return speed1;
    }

    public int getWeight2() {
        return weight2;
    }

    public int getSpeed2() {
        return speed2;
    }

    public ZService(int weight1, int speed1, int weight2, int speed2) {
        this.weight1 = weight1;
        this.speed1 = speed1;
        this.weight2 = weight2;
        this.speed2 = speed2;
        this.afterCollisionAnswer= Calculation(weight1,speed1,weight2,speed2);
    }

    public int Calculation (int weight1, int speed1, int weight2, int speed2)
    {
        int answer = (weight1 * speed1) - (weight2 * speed2);
        return answer;
    }
}
