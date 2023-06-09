package com.dxl.designpatterns.factoryPattern.AbstractFactory;

public class EngineE implements Engine{
    @Override
    public void creat() {
        System.out.println("生产奔驰E的发动机");
    }
}
