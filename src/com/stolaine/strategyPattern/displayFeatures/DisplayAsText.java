package com.stolaine.strategyPattern.displayFeatures;

import com.stolaine.strategyPattern.data.Duck;

public class DisplayAsText implements Duck.IDisplayBehaviour {

    public void display() {
        System.out.println("Display as Text.");
    }
}
