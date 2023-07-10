package com.dxl.designpatterns.adapterPattern.adapterInterface;

public class Client {
    public static void main(String[] args) {
        WrapperSub wrapperSub = new WrapperSub();
        wrapperSub.method1();

        WrapperSub1 wrapperSub1 = new WrapperSub1();
        wrapperSub1.method2();
    }
}
