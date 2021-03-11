package com.stolaine.strategyPattern.quackFeatures;

import com.stolaine.strategyPattern.data.Duck;

public class SimpleQuack implements Duck.IQuackBehaviour {

    public void quack() {
        System.out.println("Simple Quack.");
    }
}
