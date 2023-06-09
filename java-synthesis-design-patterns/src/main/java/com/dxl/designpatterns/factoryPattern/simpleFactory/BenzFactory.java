package com.dxl.designpatterns.factoryPattern.simpleFactory;

import com.dxl.designpatterns.factoryPattern.methodFactory.BenzCreate;
import com.dxl.designpatterns.factoryPattern.methodFactory.BenzE;

public class BenzFactory {
    public static BenzCreate benzCreate(String type) {
        switch (type) {
            case "S":
                return new BenzS();
            case "E":
                return new BenzE();
            default:
                break;
        }
        return null;
    }
}
