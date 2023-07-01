package com.dxl.javasynthesisuser.controller.app;

import com.dxl.core.response.ServerResponseEntity;
import com.dxl.core.vo.AreaVO;
import com.dxl.javasynthesisapiuser.feign.AreaClient;
import com.dxl.javasynthesisuser.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 省市区地区信息
 *
 * @author YXF
 * @date 2020-11-25 14:48:52
 */
@RestController("appAreaController")
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private AreaService areaService;
    @Resource
    private AreaClient areaClient;

    @GetMapping("/list")
    public ServerResponseEntity<List<AreaVO>> list() {
        List<AreaVO> list = areaService.getAreaListInfo();
        return ServerResponseEntity.success(list);
    }

    @GetMapping("/asd")
    public ServerResponseEntity<List<AreaVO>> aaa() {
        return areaClient.list();
    }

    @GetMapping("/list_by_pid")
    public ServerResponseEntity<List<AreaVO>> listByPid(Long pid) {
        List<AreaVO> list = areaService.listByPid(pid);
        return ServerResponseEntity.success(list);
    }

    @GetMapping("/getUserFir")
    public ServerResponseEntity<List<AreaVO>> getUserFir(Long pid) {
        List<AreaVO> list = areaService.listByPid(pid);
        return ServerResponseEntity.success(list);
    }

    @GetMapping("/getUserSec")
    public ServerResponseEntity<List<AreaVO>> getUserSec(Long pid) {
        List<AreaVO> list = areaService.listByPid(pid);
        return ServerResponseEntity.success(list);
    }
}
