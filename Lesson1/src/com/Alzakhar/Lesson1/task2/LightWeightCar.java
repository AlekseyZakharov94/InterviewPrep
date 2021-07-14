package com.Alzakhar.Lesson1.task2;

public class LightWeightCar extends Car {

    @Override
    public void open() {
        System.out.println("LightWeightCar is open");
    }

    @Override
    public void move() {
        System.out.println("LightWeightCar is moving");
    }
}
