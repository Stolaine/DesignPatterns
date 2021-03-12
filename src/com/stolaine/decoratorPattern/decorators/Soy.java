package com.stolaine.decoratorPattern.decorators;

import com.stolaine.decoratorPattern.data.AddOnDecorator;
import com.stolaine.decoratorPattern.data.Beverage;

public class Soy extends AddOnDecorator {

    private Beverage beverage;
    private double cost;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        this.cost = 1.5;
    }

    @Override
    public double cost() {
        return (this.beverage.cost() + this.cost);
    }
}
