package com.dxl.designpatterns.bridgePattern.message.bridgePattern;

public class SmsMessage implements MessageImplementor{
    @Override
    public void send(String message, String toUser) {
        System.out.println("发送Sms");
    }
}
