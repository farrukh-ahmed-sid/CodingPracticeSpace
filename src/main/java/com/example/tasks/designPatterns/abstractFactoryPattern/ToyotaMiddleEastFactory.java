package com.example.tasks.designPatterns.abstractFactoryPattern;

import com.example.tasks.designPatterns.abstractFactoryPattern.interfaces.Car;
import com.example.tasks.designPatterns.abstractFactoryPattern.interfaces.CarFactory;
import com.example.tasks.designPatterns.abstractFactoryPattern.interfaces.Spec;

public class ToyotaMiddleEastFactory implements CarFactory {
    @Override
    public Car createCar() {
        System.out.println("creating toyota car");
        return new ToyotaCar();
    }

    @Override
    public Spec createSpec() {
        System.out.println("creating ME spec");
        return new MiddleEastSpec();
    }
}
