package com.example.tasks.designPatterns.abstractFactoryPattern;

import com.example.tasks.designPatterns.abstractFactoryPattern.interfaces.Car;
import com.example.tasks.designPatterns.abstractFactoryPattern.interfaces.CarFactory;
import com.example.tasks.designPatterns.abstractFactoryPattern.interfaces.Spec;

public class HondaAmericanFactory implements CarFactory {
    @Override
    public Car createCar() {
        System.out.println("creating honda car");
        return new HondaCar();
    }

    @Override
    public Spec createSpec() {
        System.out.println("creating American Spec");
        return new AmericanSpec();
    }
}
