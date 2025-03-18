package com.devyujin.mission.model;

import com.devyujin.mission.service.Peelable;

public class Banana implements Peelable {
    private String name;
    private int ripeness;
    private double price;

    public Banana(String name, int ripeness, double price) {
        this.name = name;
        this.ripeness = ripeness;
        this.price = price;
    }

    @Override
    public String peel() {
        if (ripeness < 4) {
            return "덜 익은 " + name + " 껍질을 조심히 벗깁니다";
        } else if (ripeness > 8) {
            return "많이 익은 " + name + " 껍질을 쉽게 벗깁니다";
        } else {
            return name + " 껍질을 벗깁니다";
        }
    }
}
