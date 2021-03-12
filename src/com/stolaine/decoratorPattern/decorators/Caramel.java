package com.stolaine.decoratorPattern.decorators;

import com.stolaine.decoratorPattern.data.AddOnDecorator;
import com.stolaine.decoratorPattern.data.Beverage;

public class Caramel extends AddOnDecorator {

    private Beverage beverage;
    private double cost;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
        this.cost = 1.0;
    }

    public double cost() {
        return (this.beverage.cost() + this.cost);
    }
}
