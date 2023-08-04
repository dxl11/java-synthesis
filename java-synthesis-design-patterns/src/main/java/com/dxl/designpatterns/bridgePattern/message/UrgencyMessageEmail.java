package com.dxl.designpatterns.bridgePattern.message;

public class UrgencyMessageEmail implements UrgencyMessage {
    @Override
    public void send(String message, String toUser) {
        message = "加急：" + message;
        System.out.println(String.format("使用邮件短消息的方法，发送消息 %s 给 %s", message, toUser));
    }

    @Override
    public Object watch(String messageId) {
        //根据消息编码获取消息的状态，组成监控的数据对象，然后返回
        return null;
    }
}
