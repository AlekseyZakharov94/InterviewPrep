package com.Alzakhar.Lesson1.task3;

public class Triangle extends Figure{

    private int a;
    private int b;
    private  int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    void calculateArea() {
        System.out.println("Triangle area is calculated");
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Triangle perimeter is calculated");
    }
}
