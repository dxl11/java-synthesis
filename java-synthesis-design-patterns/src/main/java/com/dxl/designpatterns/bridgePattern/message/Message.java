package com.dxl.designpatterns.bridgePattern.message;

/**
 * 统一的消息接口
 */
public interface Message {
    /**
     * 发送消息
     * @param message 发送消息的内容
     * @param toUser 接收人
     */
    void send (String message, String toUser);
}
