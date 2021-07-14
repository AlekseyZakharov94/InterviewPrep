package com.Alzakhar.Lesson1.task3;

public class Square extends Figure{

    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public Square setA(int a) {
        this.a = a;
        return this;
    }

    @Override
    void calculateArea() {
        System.out.println("Square area is calculated");
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Square perimeter is calculated");
    }
}
