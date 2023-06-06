package com.dxl.core.exception;


import com.dxl.core.response.ResponseEnum;

/**
 * @Description: 自定义异常处理
 * @Param:
 * @return:
 * @Author: lydms
 * @Date: 2023/6/5
 */
public class JavaSynthesisException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private Object object;

    private ResponseEnum responseEnum;

    public JavaSynthesisException(String msg) {
        super(msg);
    }

    public JavaSynthesisException(String msg, Object object) {
        super(msg);
        this.object = object;
    }

    public JavaSynthesisException(String msg, Throwable cause) {
        super(msg, cause);
    }


    public JavaSynthesisException(ResponseEnum responseEnum) {
        super(responseEnum.getMsg());
        this.responseEnum = responseEnum;
    }

    public JavaSynthesisException(ResponseEnum responseEnum, Object object) {
        super(responseEnum.getMsg());
        this.responseEnum = responseEnum;
        this.object = object;
    }


    public Object getObject() {
        return object;
    }

    public ResponseEnum getResponseEnum() {
        return responseEnum;
    }

}
