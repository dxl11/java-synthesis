package com.dxl.designpatterns.factoryPattern.simpleFactory;

import com.dxl.designpatterns.factoryPattern.methodFactory.BenzCreate;

public class BenzS implements BenzCreate {
    @Override
    public void create() {
        System.out.println("建造奔驰S");
    }
}
