package com.dxl.security.utils;

import com.alibaba.fastjson.JSONObject;
import com.dxl.core.response.ResponseEnum;
import com.dxl.core.response.ServerResponseEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
* @Description: JWT认证处理器，处理认证失败
* @Param:
* @return:
* @Author: lydms
* @Date: 2023/6/19
*/
@Component
@Slf4j
public class JwtAuthFailure implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        log.info("认证失败，token不存在或已失效");
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write(JSONObject.toJSONString(ServerResponseEntity.fail(ResponseEnum.UNAUTHORIZED)));
    }
}

