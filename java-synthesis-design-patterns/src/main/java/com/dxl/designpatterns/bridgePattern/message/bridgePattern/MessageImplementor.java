package com.dxl.designpatterns.bridgePattern.message.bridgePattern;

public interface MessageImplementor {
    void send(String message, String toUser);
}
