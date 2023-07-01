package com.dxl.javasynthesisapiuser.feign;

import com.dxl.core.response.ServerResponseEntity;
import com.dxl.core.vo.AreaVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "java-user",url = "http://localhost:9092")
public interface AreaClient {

    @RequestMapping("/area/list")
    ServerResponseEntity<List<AreaVO>> list();
}
