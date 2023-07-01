package com.dxl.javasynthesisuser.controller.app;

import com.dxl.core.response.ServerResponseEntity;
import com.dxl.core.vo.AreaVO;
import com.dxl.javasynthesisapiuser.feign.AreaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController()
@RequestMapping("/aa")
public class qweqweqwe {
    @Resource
    private AreaClient areaClient;

    @GetMapping("/asd")
    public ServerResponseEntity<List<AreaVO>> aaa() {
        return areaClient.list();
    }
}
