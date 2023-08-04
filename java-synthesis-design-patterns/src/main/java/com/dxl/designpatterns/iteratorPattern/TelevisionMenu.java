package com.dxl.designpatterns.iteratorPattern;

public interface TelevisionMenu {
    public void addItem(int channe,String name,String description);
    public Iterator createIrerator();
}
