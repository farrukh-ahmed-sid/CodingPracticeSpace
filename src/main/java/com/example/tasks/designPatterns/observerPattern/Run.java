package com.example.tasks.designPatterns.observerPattern;

public class Run {

    public static void runIt(){

        WeatherObserver weatherObserverPhone = new WeatherPhoneApp();
        WeatherObserver weatherObserverTV = new WeatherTVChannel();


        WeatherStation weatherStation = new WeatherStationImpl();
        weatherStation.addStation(weatherObserverPhone);
        weatherStation.addStation(weatherObserverTV);

        weatherStation.notifyStation("storm");

    }
}
