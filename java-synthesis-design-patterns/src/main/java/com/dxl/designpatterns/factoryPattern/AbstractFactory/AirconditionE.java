package com.dxl.designpatterns.factoryPattern.AbstractFactory;

public class AirconditionE implements Aircondition {
    @Override
    public void creat() {
        System.out.println("生产奔驰E的空调");
    }
}
