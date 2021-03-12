package com.stolaine.decoratorPattern.beverages;

import com.stolaine.decoratorPattern.data.Beverage;

public class Espresso extends Beverage {

    private double cost;

    public Espresso() {
        this.cost = 10.0;
    }
    public double cost() {
        return this.cost;
    }
}
