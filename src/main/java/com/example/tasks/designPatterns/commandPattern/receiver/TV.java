package com.example.tasks.designPatterns.commandPattern.receiver;

public class TV implements Device{
    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }
}
