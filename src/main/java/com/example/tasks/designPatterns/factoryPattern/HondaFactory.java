package com.example.tasks.designPatterns.factoryPattern;

public class HondaFactory implements Factory{
    @Override
    public Car createCar() {
        System.out.println("creating honda car");
        return new HondaCar();
    }
}
