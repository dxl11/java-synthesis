package com.dxl.designpatterns.chainOfResponsibilityPattern;

public class Client {
    public static void main(String[] args) {
        Leader instructor = new Instructor("陈毅");
        Leader departmentHead = new DepartmentHead("王明");
        Leader dean = new Dean("张强");
        Leader president = new President("王晗");

        instructor.setSuccessor(departmentHead);
        departmentHead.setSuccessor(dean);
        dean.setSuccessor(president);

        LeaveNode leaveNode = new LeaveNode("哈哈",1);

        LeaveNode leaveNode1 = new LeaveNode("哈哈",5);

        LeaveNode leaveNode2 = new LeaveNode("哈哈",7);

        LeaveNode leaveNode3= new LeaveNode("哈哈",9);

        instructor.handleRequest(leaveNode);

        instructor.handleRequest(leaveNode1);

        instructor.handleRequest(leaveNode2);

        instructor.handleRequest(leaveNode3);
    }
}
