package com.stolaine.strategyPattern.flyFeatures;

import com.stolaine.strategyPattern.data.Duck;

public class JetFly implements Duck.IFlyBehaviour {

    public void fly() {
        System.out.println("Jet Fly.");
    }
}
