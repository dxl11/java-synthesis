package com.dxl.designpatterns.factoryPattern.simpleFactory;

import com.dxl.designpatterns.factoryPattern.methodFactory.BenzCreate;

public class Test {
    public static void main(String[] args) {
        //建造奔驰S
        BenzCreate S = BenzFactory.benzCreate("S");
        S.create();
        //建造奔驰E
        BenzCreate E = BenzFactory.benzCreate("E");
        E.create();

    }
}
