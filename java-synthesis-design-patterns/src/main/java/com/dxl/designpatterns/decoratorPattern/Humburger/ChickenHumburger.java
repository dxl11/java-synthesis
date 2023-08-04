package com.dxl.designpatterns.decoratorPattern.Humburger;

public class ChickenHumburger extends Humburger{
    @Override
    public String getName() {
        return "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 20;
    }
}
