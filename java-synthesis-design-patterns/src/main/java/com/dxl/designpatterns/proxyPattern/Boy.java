package com.dxl.designpatterns.proxyPattern;

public class Boy implements GiveGift {

    BeautifulGirl beautifulGirl;

    @Override
    public void giveFlowers() {
        System.out.println(beautifulGirl.getName());
    }

    @Override
    public void giveChocolate() {
        System.out.println(beautifulGirl.getName());
    }

    @Override
    public void giveBook() {
        System.out.println(beautifulGirl.getName());
    }
}
