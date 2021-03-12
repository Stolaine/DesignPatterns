package com.stolaine.observerPattern.observers;

import com.stolaine.observerPattern.data.IDisplay;
import com.stolaine.observerPattern.data.IObservable;
import com.stolaine.observerPattern.data.IObserver;
import com.stolaine.observerPattern.observables.WeatherStation;

public class PhoneDisplay implements IObserver, IDisplay {

    private WeatherStation weatherStation;
    private double temperature;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.temperature = weatherStation.getTemperature();
    }
    @Override
    public void update() {
        this.temperature = weatherStation.getTemperature();
    }

    @Override
    public void display() {
        System.out.println("The temperature at PhoneDisplay is " + this.temperature);
    }
}
