package com.stolaine.strategyPattern.flyFeatures;

import com.stolaine.strategyPattern.data.Duck;

public class NoFly implements Duck.IFlyBehaviour {

    public void fly() {
        System.out.println("No Fly.");
    }
}
