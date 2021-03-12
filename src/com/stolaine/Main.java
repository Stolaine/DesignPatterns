package com.stolaine;

import com.stolaine.decoratorPattern.beverages.Decaf;
import com.stolaine.decoratorPattern.data.Beverage;
import com.stolaine.decoratorPattern.decorators.Caramel;
import com.stolaine.decoratorPattern.decorators.Soy;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Decaf();
        beverage = new Caramel(beverage);
        beverage = new Soy(beverage);
        System.out.println(beverage.cost());
    }
}
