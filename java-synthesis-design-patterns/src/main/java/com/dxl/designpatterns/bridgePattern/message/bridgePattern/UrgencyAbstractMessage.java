package com.dxl.designpatterns.bridgePattern.message.bridgePattern;

import java.lang.invoke.TypeDescriptor;

public class UrgencyAbstractMessage extends CommonAbstractMessage{
    public UrgencyAbstractMessage(MessageImplementor implementor) {
        super(implementor);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);
    }

    public void UrgencyMessage(){
        System.out.println("我要加急");
    }
}
