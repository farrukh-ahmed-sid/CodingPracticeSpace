package com.example.tasks.designPatterns.abstractFactoryPattern;

import com.example.tasks.designPatterns.abstractFactoryPattern.interfaces.CarFactory;

public class Run {

    public static void runIt(){

        CarFactory carFactory = new ToyotaMiddleEastFactory();
        carFactory.createCar();
        carFactory.createSpec();


    }
}
