package com.example.tasks.designPatterns.observerPattern;

public interface WeatherStation {

    void addStation(WeatherObserver observer);
    void removeStation(WeatherObserver observer);
    void notifyStation(String condition);
}
