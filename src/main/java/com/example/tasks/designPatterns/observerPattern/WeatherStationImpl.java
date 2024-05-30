package com.example.tasks.designPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationImpl implements WeatherStation {

    List<WeatherObserver> observerList = new ArrayList<>();

    @Override
    public void addStation(WeatherObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeStation(WeatherObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyStation(String condition) {

        for (WeatherObserver observer : observerList) {
            observer.update(condition);
        }
    }
}
