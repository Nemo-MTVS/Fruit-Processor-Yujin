package com.devyujin.mission.service;

import com.devyujin.mission.interfaces.Cuttable;

public class FruitCutter<T extends Cuttable> {
    private T fruit;
    public FruitCutter(T fruit) {
        this.fruit = fruit;
    }

    public String cut() {
        return fruit.cut();
    }
}
