package com.dxl.designpatterns.factoryPattern.AbstractFactory;

public class EngineS implements Engine{
    @Override
    public void creat() {
        System.out.println("生产奔驰S的发动机");
    }
}
