package com.example.tasks.designPatterns.factoryPattern;

public class Run {

    public static void main(String[] args){
        Factory factory = new HondaFactory();
        Car car = factory.createCar();
        car.printCar();
    }

}
