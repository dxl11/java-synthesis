package com.dxl.core.response;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: lydms
 * @Date: 2023/6/5
 */
public enum ResponseEnum {

    /**
     * ok
     */
    OK("00000", "ok"),

    /**
     * 用于直接显示提示用户的错误，内容由输入内容决定
     */
    SHOW_FAIL("A00001", ""),

    /**
     * 方法参数没有校验，内容由输入内容决定
     */
    METHOD_ARGUMENT_NOT_VALID("A00002", ""),

    /**
     * 无法读取获取请求参数
     */
    HTTP_MESSAGE_NOT_READABLE("A00003", "请求参数格式有误"),

    /**
     * 未授权
     */
    UNAUTHORIZED("A00004", "Unauthorized"),


    /**
     * 服务器出了点小差
     */
    EXCEPTION("A00005", "服务器出了点小差"),

    /**
     * 接口限流了
     */
    INTERFACELIMIT("100", "接口限流了"),

    /**
     * 接口限流了
     */
    SERVICEDEGRADATION("101", "服务降级了"),

    /**
     * 热点参数限流了
     */
    HOTKEYLIMIT("102", "热点参数限流了"),
    /**
     * 触发系统保护规则了
     */
    TOUCHOFFPROTECTRULE("103", "触发系统保护规则了"),
    /**
     * 授权规则不通过
     */
    AUTHORIZATIONRULEREFUSE("104", "授权规则不通过");




    private final String code;

    private final String msg;

    public String value() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ResponseEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResponseEnum{" + "code='" + code + '\'' + ", msg='" + msg + '\'' + "} " + super.toString();
    }

}
