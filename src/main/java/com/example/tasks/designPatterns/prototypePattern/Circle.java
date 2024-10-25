package com.example.tasks.designPatterns.prototypePattern;

public class Circle extends Shape {

    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle (Circle circle) {
        super(circle.color);
        this.radius = circle.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public void display() {
        System.out.println("Circle shape with " + radius + " radius and color " + color);
    }
}
