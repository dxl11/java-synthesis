package com.dxl.designpatterns.bridgePattern.message.bridgePattern;

public class CommonAbstractMessage extends AbstractMessage{
    public CommonAbstractMessage(MessageImplementor implementor) {
        super(implementor);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);
    }
}
