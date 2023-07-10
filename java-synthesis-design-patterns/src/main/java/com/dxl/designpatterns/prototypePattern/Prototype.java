package com.dxl.designpatterns.prototypePattern;

import java.util.ArrayList;

public abstract class Prototype implements Cloneable {
    protected ArrayList<String> list = new ArrayList<String>();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract void show();
}
