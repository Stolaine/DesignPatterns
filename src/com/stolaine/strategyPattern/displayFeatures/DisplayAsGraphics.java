package com.stolaine.strategyPattern.displayFeatures;

import com.stolaine.strategyPattern.data.Duck;

public class DisplayAsGraphics implements Duck.IDisplayBehaviour {

    public void display() {
        System.out.println("Display as Graphics.");
    }
}
