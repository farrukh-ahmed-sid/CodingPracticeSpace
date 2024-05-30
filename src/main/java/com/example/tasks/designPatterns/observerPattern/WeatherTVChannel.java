package com.example.tasks.designPatterns.observerPattern;

public class WeatherTVChannel implements WeatherObserver {


    @Override
    public void update(String update) {
        System.out.println("TV: " + update);

    }
}
