package com.stolaine.decoratorPattern.beverages;

import com.stolaine.decoratorPattern.data.Beverage;

public class Decaf extends Beverage {

    private double cost;

    public Decaf() {
        this.cost = 20.0;
    }

    @Override
    public double cost() {
        return this.cost;
    }
}
