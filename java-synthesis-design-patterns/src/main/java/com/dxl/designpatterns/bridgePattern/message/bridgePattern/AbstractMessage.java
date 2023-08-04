package com.dxl.designpatterns.bridgePattern.message.bridgePattern;

public abstract class AbstractMessage {

    private MessageImplementor implementor;

    public AbstractMessage(MessageImplementor implementor) {
        this.implementor = implementor;
    }

    public void sendMessage(String message, String toUser) {
        implementor.send(message, toUser);
    }
}
