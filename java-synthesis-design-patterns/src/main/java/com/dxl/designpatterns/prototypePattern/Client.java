package com.dxl.designpatterns.prototypePattern;

public class Client {
    public static void main(String[] args) {
        ShallowClone cp = new ShallowClone();
        ShallowClone clonecp = (ShallowClone) cp.clone();
        clonecp.show();
        System.out.println(clonecp.list == cp.list);

        DeepClone cp2 = new DeepClone();
        DeepClone clonecp2 = (DeepClone) cp2.clone();
        clonecp2.show();
        System.out.println(clonecp2.list == cp2.list);
    }
}
