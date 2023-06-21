package com.dxl.security.utils;

import com.alibaba.fastjson.JSONObject;
import com.dxl.core.response.ResponseEnum;
import com.dxl.core.response.ServerResponseEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
* @Description: 授权处理器，用于处理无权访问
* @Param:
* @return:
* @Author: lydms
* @Date: 2023/6/19
*/
@Component
@RequiredArgsConstructor
@Slf4j
public class AccessFailure implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e) throws IOException {
        log.info("拒绝访问，无权限");
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write(JSONObject.toJSONString(ServerResponseEntity.fail(ResponseEnum.UNAUTHORIZED)));
    }
}
