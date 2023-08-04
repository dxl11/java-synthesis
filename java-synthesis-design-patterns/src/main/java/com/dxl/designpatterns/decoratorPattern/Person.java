package com.dxl.designpatterns.decoratorPattern;


public class Person implements Human {

    @Override
    public void wearClothes() {
        System.out.println("穿什么呢。。");
    }
}
