package com.stolaine;

import com.stolaine.observerPattern.observables.WeatherStation;
import com.stolaine.observerPattern.observers.PhoneDisplay;
import com.stolaine.observerPattern.observers.WindowDisplay;

public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay display1 = new PhoneDisplay(weatherStation);
        PhoneDisplay display2 = new PhoneDisplay(weatherStation);
        WindowDisplay display3 = new WindowDisplay(weatherStation);

        weatherStation.register(display1);
        weatherStation.register(display2);
        weatherStation.register(display3);
    }
}
