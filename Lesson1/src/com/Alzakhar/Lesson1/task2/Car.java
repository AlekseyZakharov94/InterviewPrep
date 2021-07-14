package com.Alzakhar.Lesson1.task2;

public class Car implements Openable, Moveable, Stopable {
    private Engine engine;
    private String color;
    private String name;


    protected void start() {
        System.out.println("Car starting");
    }

    @Override
    public void open() {
        System.out.println("The car is open");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car is stop");
    }
}
