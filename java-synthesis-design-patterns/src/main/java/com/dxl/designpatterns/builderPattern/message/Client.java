package com.dxl.designpatterns.builderPattern.message;

public class Client {
    public static void main(String[] args) {
        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);
        director.construct("saasa","assa");
    }
}
