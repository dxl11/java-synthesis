package com.dxl.javasynthesisuser.exception;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import com.dxl.core.response.ResponseEnum;
import com.dxl.core.response.ServerResponseEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: lydms
 * @Date: 2023/6/26
 */
@Component
@Slf4j
public class MyBlockExceptionHandler implements BlockExceptionHandler {

    public void handle(
            HttpServletRequest request,
            HttpServletResponse response,
            BlockException e) throws Exception {


        log.info("BlockExceptionHandlerBlockException================" + e.getRule());

        Map<String, String> map = new HashMap<>();

        if (e instanceof FlowException) {
            map.put("code", ResponseEnum.INTERFACELIMIT.value());
            map.put("msg", ResponseEnum.INTERFACELIMIT.getMsg());
        } else if (e instanceof DegradeException) {
            map.put("code", ResponseEnum.SERVICEDEGRADATION.value());
            map.put("msg", ResponseEnum.SERVICEDEGRADATION.getMsg());
        } else if (e instanceof ParamFlowException) {
            map.put("code", ResponseEnum.HOTKEYLIMIT.value());
            map.put("msg", ResponseEnum.HOTKEYLIMIT.getMsg());
        } else if (e instanceof SystemBlockException) {
            map.put("code", ResponseEnum.TOUCHOFFPROTECTRULE.value());
            map.put("msg", ResponseEnum.TOUCHOFFPROTECTRULE.getMsg());
        } else if (e instanceof AuthorityException) {
            map.put("code", ResponseEnum.AUTHORIZATIONRULEREFUSE.value());
            map.put("msg", ResponseEnum.AUTHORIZATIONRULEREFUSE.getMsg());
        }

        //返回json数据
        response.setStatus(500);
        response.setCharacterEncoding("utf8");
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        new ObjectMapper().writeValue(response.getWriter(), map);
    }

}
