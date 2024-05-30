package com.example.tasks.designPatterns.decoratorPattern;

public class RedBorderShape extends BorderColorShape{

    public RedBorderShape(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("red color border");
    }
}
