package com.dxl.designpatterns.factoryPattern.methodFactory;

public class BenzS implements BenzCreate {
    @Override
    public void create() {
        System.out.println("建造奔驰S");
    }
}
