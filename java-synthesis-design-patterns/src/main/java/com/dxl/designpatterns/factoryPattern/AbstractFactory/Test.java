package com.dxl.designpatterns.factoryPattern.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        /**
         * 生产奔驰S的空调和发动机
         */
        BenzSFactory benzSFactory = new BenzSFactory();
        benzSFactory.createAircontion().creat();
        benzSFactory.createEngine().creat();
        /**
         * 生产奔驰E的空调和发动机
         */
        BenzEFactory benzEFactory = new BenzEFactory();
        benzEFactory.createAircontion().creat();
        benzEFactory.createEngine().creat();
    }
}
