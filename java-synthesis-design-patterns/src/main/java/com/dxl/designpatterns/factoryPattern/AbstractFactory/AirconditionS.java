package com.dxl.designpatterns.factoryPattern.AbstractFactory;

public class AirconditionS implements Aircondition{
    @Override
    public void creat() {
        System.out.println("生产奔驰S的空调");
    }
}
