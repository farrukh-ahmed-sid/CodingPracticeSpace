package com.example.tasks.designPatterns.prototypePattern;

public abstract class Shape {

    protected String color;

    protected Shape(String color) {
        this.color = color;
    }

    protected abstract Shape clone();
    protected abstract void display();
}
