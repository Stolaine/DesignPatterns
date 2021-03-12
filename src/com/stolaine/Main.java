package com.stolaine;

import com.stolaine.strategyPattern.data.Duck;
import com.stolaine.strategyPattern.displayFeatures.DisplayAsText;
import com.stolaine.strategyPattern.flyFeatures.SimpleFly;
import com.stolaine.strategyPattern.quackFeatures.SimpleQuack;

public class Main {

    public static void main(String[] args) {
        Duck duck = new Duck(new SimpleQuack(), new DisplayAsText(), new SimpleFly());
        duck.quack();
        duck.display();
    }
}
