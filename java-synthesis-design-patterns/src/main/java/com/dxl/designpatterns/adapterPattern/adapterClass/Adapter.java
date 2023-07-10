package com.dxl.designpatterns.adapterPattern.adapterClass;

public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.specificRequest();
    }
}
