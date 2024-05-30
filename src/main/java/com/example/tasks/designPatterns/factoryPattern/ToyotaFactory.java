package com.example.tasks.designPatterns.factoryPattern;

public class ToyotaFactory implements Factory{
    @Override
    public Car createCar() {
        System.out.println("creating toyota car");
        return new ToyotaCar();
    }
}
