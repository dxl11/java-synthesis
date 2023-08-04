package com.dxl.designpatterns.bridgePattern.message.bridgePattern;

public class Client {
    public static void main(String[] args) {
        MessageImplementor implementor = new EmailMessage();
        CommonAbstractMessage commonAbstractMessage = new CommonAbstractMessage(implementor);
        commonAbstractMessage.sendMessage("aa", "aaa");

        implementor = new EmailMessage();
        UrgencyAbstractMessage urgencyAbstractMessage = new UrgencyAbstractMessage(implementor);
        urgencyAbstractMessage.UrgencyMessage();
        urgencyAbstractMessage.sendMessage("aaa", "aaaa");
    }
}
