package com.dxl.designpatterns.adapterPattern.adapterClass;

public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("我是普通类，实现普通功能");
    }
}
