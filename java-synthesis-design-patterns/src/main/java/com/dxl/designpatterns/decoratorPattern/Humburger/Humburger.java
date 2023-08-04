package com.dxl.designpatterns.decoratorPattern.Humburger;

public abstract class Humburger {
    String name;

    public String getName(){
        return name;
    }

    public abstract double getPrice();
}
