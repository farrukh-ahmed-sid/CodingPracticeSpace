package com.example.tasks.designPatterns.decoratorPattern;

public abstract class BorderColorShape implements Shape{

    protected Shape shape;

    BorderColorShape (Shape s) {
        shape = s;
    }
    public abstract void draw();
}
