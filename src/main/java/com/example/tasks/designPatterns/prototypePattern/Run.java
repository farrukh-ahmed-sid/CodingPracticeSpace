package com.example.tasks.designPatterns.prototypePattern;

public class Run {

    public static void main(String[] args) {
        Shape shape = new Circle("red", 2);
        shape.display();

        Shape shapeClone = shape.clone();
        shapeClone.display();
    }

}
