package com.dxl.designpatterns.decoratorPattern;

public class client {
    public static void main(String[] args) {
        Human person = new Person();
        Decorator decorator = new Decorator_two(new Decorator_first(new Decorator_zero(person)));
        decorator.wearClothes();
    }

}
