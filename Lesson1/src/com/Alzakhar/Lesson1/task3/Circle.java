package com.Alzakhar.Lesson1.task3;

public class Circle extends Figure{

    private int dia;

    public int getDia() {
        return dia;
    }

    public Circle setDia(int dia) {
        this.dia = dia;
        return this;
    }

    public Circle(int dia) {
        this.dia = dia;
    }

    @Override
    void calculateArea() {
        System.out.println("Circle area is calculated");
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Circle perimeter is calculated");
    }
}
