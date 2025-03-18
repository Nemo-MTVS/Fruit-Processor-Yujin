package com.devyujin.mission.model;

import com.devyujin.mission.service.Cuttable;

public class Apple implements Cuttable {
    private String name;
    private String color;
    private double price;

    public Apple(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String cut() {
        if (color.equals("red")) {
            return "익은 " + name + " 껍질을 깎습니다.";
        } else {
            return "덜 익은 " + name + " 껍질을 깎습니다.";
        }
    }
}
