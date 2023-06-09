package com.dxl.designpatterns.factoryPattern.methodFactory;

public class BenzEFactory implements BenzFactory {
    @Override
    public BenzCreate benzCreate() {
        return new BenzE();
    }
}
