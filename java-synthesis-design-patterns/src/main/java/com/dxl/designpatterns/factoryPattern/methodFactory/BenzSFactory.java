package com.dxl.designpatterns.factoryPattern.methodFactory;

public class BenzSFactory implements BenzFactory {
    @Override
    public BenzCreate benzCreate() {
        return new BenzS();
    }
}
