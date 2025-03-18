package com.devyujin.mission;

import com.devyujin.mission.model.Apple;
import com.devyujin.mission.model.Banana;
import com.devyujin.mission.service.FruitCutter;
import com.devyujin.mission.service.FruitProcessor;

public class FruitMain {
    public static void main(String[] args) {
        Banana banana = new Banana("바나나", 9, 3000.0);
        Apple apple = new Apple("사과", "빨간색", 5000.0);

        FruitProcessor<Banana> processor = new FruitProcessor<>(banana);
        FruitCutter<Apple> cutter = new FruitCutter<>(apple);

        System.out.println(processor.process());
        System.out.println(cutter.cut());
    }
}
