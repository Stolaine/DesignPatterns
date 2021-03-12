package com.stolaine.observerPattern.observables;

import com.stolaine.observerPattern.data.IObservable;
import com.stolaine.observerPattern.data.IObserver;

import java.util.ArrayList;

public class WeatherStation implements IObservable {
    private double temperature;
    private ArrayList<IObserver> observers;

    public WeatherStation() {
        this.observers = new ArrayList<>();
        temperature = 0.0;
    }

    @Override
    public void register(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void unRegister(IObserver observer) {
        if (this.observers.contains(observer)) {
            this.observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for(IObserver observer : this.observers) {
            observer.update();
        }
    }

    public double getTemperature() {
        return this.temperature;
    }
}
