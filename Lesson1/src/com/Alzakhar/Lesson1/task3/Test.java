package com.Alzakhar.Lesson1.task3;

public class Test {
    public static void main(String[] args) {
        Figure circle = new Circle(5);
        Figure square = new Square(20);
        Figure triangle = new Triangle(1, 2, 30);

        circle.calculateArea();
        square.calculatePerimeter();
        triangle.calculatePerimeter();
        triangle.calculateArea();
    }
}
