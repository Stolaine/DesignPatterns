package com.stolaine.strategyPattern.quackFeatures;

import com.stolaine.strategyPattern.data.Duck;

public class NoQuack implements Duck.IQuackBehaviour {

    public void quack() {
        System.out.println("No Quack.");
    }
}
