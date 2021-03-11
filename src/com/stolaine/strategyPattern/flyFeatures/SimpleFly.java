package com.stolaine.strategyPattern.flyFeatures;

import com.stolaine.strategyPattern.data.Duck;

public class SimpleFly implements Duck.IFlyBehaviour {
    public void fly() {
        System.out.println("Simple Fly.");
    }
}
