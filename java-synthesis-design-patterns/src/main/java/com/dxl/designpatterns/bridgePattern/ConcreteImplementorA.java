package com.dxl.designpatterns.bridgePattern;

/**
 * 具体实现化操作
 */
public class ConcreteImplementorA extends Implementor {
    @Override
    public void operationImpl() {
        //具体操作
        System.out.println("我是具体操作A");
    }
}
