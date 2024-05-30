package com.example.tasks.designPatterns.decoratorPattern;

public class Run {

    public static void runIt(){

        Shape shape = new Circle();
        BorderColorShape borderColorShape = new RedBorderShape(shape);
        borderColorShape.draw();

    }
}
