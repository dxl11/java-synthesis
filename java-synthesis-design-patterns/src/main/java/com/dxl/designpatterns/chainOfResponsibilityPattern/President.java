package com.dxl.designpatterns.chainOfResponsibilityPattern;

public class President extends Leader{

    public President(String name) {
        super(name);
    }

    public void handleRequest(LeaveNode LeaveNode) {
        if(LeaveNode.getNumber() <= 15){
            System.out.println("校长" + name + "审批" +LeaveNode.getPerson() + "同学的请假条,请假天数为" + LeaveNode.getNumber() + "天。");
        }
        else{     //否则不允批准
            System.out.println("请假天天超过15天,不批准...");
        }
    }

}
