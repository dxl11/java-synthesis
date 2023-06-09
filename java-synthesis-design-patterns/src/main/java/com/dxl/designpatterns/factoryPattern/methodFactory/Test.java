package com.dxl.designpatterns.factoryPattern.methodFactory;

public class Test {
    public static void main(String[] args) {
        BenzSFactory benzSFactory = new BenzSFactory();
        benzSFactory.benzCreate().create();

        BenzEFactory benzEFactory = new BenzEFactory();
        benzEFactory.benzCreate().create();
    }
}
