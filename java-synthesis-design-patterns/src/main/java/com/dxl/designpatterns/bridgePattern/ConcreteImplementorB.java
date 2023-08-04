package com.dxl.designpatterns.bridgePattern;

public class ConcreteImplementorB extends Implementor {
    @Override
    public void operationImpl() {
        //具体操作
        System.out.println("我是具体化实现操作B");
    }
}
