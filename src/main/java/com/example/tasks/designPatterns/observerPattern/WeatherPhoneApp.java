package com.example.tasks.designPatterns.observerPattern;

public class WeatherPhoneApp implements WeatherObserver {


    @Override
    public void update(String update) {
        System.out.println("Phone:" + update);
    }
}
