package com.dxl.seckillsystem.controller;

import com.dxl.seckillsystem.mapper.User;
import com.alibaba.csp.sentinel.EntryType;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 演示熔断降级规则（一般放在服务提供端）
 * @Date 2022-04-13 11:21
 * @Author xie
 */
@RestController
public class DegradeRuleController {

    private static final String DEGRADE_RESOURCE_NAME = "degrade";


    @RequestMapping("/degrade")
    @SentinelResource(value = DEGRADE_RESOURCE_NAME, entryType = EntryType.IN, blockHandler = "blockHandlerForDegrade")
    public User degrade(String id) {
        // 异常数 比例
        throw new RuntimeException("异常了");
    }

    public User blockHandlerForDegrade(String id, BlockException e) {
        e.printStackTrace();
        return new User("触发熔断, 开始降级操作");
    }

    /**
     * 初始化熔断降级规则
     * @date 2022/4/13 11:22
     */
    @PostConstruct
    public void initDegradeRule() {

        // 降级规则异常
        List<DegradeRule> degradeRuleList = new ArrayList();

        DegradeRule degradeRule = new DegradeRule();
        degradeRule.setResource(DEGRADE_RESOURCE_NAME);
        // 熔断降级策略 支持慢调用比例/异常比例/异常数策略（默认值慢调用比例）
        degradeRule.setGrade(RuleConstant.DEGRADE_GRADE_EXCEPTION_COUNT);
        // 触发熔断异常数 2个
        degradeRule.setCount(2);
        // 触发熔断最小请求数 2次
        degradeRule.setMinRequestAmount(2);
        // 统计时长 （时间太短不好测试）1分钟 单位ms   默认1s
        degradeRule.setStatIntervalMs(60 * 1000);

        // --- 上述条件就是：一分钟内 请求了两次+  出现了两次异常 就会触发熔断

        // 熔断时长 单位s
        // 具体说明：一旦触发了熔断，再次请求接口就会直接调用降级方法，而不是接口本身
        //         10s过后进入半开状态，恢复接口本身调用，如果第一次请求就出现了异常，再次熔断，不会根据设置的条件进行判定
        //         然后继续重复上述操作。
        degradeRule.setTimeWindow(10);

        degradeRuleList.add(degradeRule);
        DegradeRuleManager.loadRules(degradeRuleList);
    }
}
