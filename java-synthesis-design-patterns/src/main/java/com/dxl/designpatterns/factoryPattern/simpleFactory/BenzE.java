package com.dxl.designpatterns.factoryPattern.simpleFactory;

public class BenzE implements BenzCreate {
    @Override
    public void create() {
        System.out.println("建造奔驰E");
    }
}
