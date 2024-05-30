package com.example.tasks.designPatterns.abstractFactoryPattern;

import com.example.tasks.designPatterns.abstractFactoryPattern.interfaces.Car;

public class HondaCar implements Car {
    @Override
    public void printCar() {
        System.out.println("Honda Car");
    }
}
