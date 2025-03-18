package com.devyujin.mission.service;

public class FruitCutter<T extends Cuttable> {
    private T fruit;
    public FruitCutter(T fruit) {
        this.fruit = fruit;
    }

    public String cut() {
        return fruit.cut();
    }
}
