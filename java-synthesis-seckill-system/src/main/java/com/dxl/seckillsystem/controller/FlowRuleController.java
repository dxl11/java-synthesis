package com.dxl.seckillsystem.controller;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.Tracer;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.dxl.seckillsystem.mapper.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Description 演示流控规则（一般放在服务消费端）
 * @Date 2022-04-13 9:10
 * @Author xie
 */
@RestController
@Slf4j
@RequestMapping("/flowRule")
public class FlowRuleController {

    /**
     * resource name 需要跟接口地址相同（通过接口地址定义资源名称）
     * 资源名可使用任意有业务语义的字符串，比如方法名、接口名或其它可唯一标识的字符串。
     */
    private static final String RESOURCE_NAME = "hello";
    private static final String USER_RESOURCE_NAME = "user";
    private static final String DEGRADE_RESOURCE_NAME = "degrade";

    /**
     * sentinel进行流控（硬编码形式）
     * @return java.lang.String
     */
    @RequestMapping("/hello")
    public String hello() {

        Entry entry = null;
        // sentinel针对资源进行限制
        try {
            entry = SphU.entry(RESOURCE_NAME);
            // 被保护的业务逻辑
            String str = "hello sentinel";
            log.info("=====" + str + "=====");
            return str;
        } catch (BlockException e) {
            e.printStackTrace();
            // 资源访问阻止，被限流或者被降级
            // 进行相应的业务处理
            log.info("被限流了。。。");
            return "被限流了。。。";
        } catch (Exception e) {
            // 若需要配置降级规则，需要用这种方式记录业务异常
            Tracer.traceEntry(e, entry);
        } finally {
            if (Objects.nonNull(entry)) {
                entry.exit();
            }
        }
        return null;
    }


    /**
     * 定义流控规则
     *
     * @date 2022/4/13 9:34
     */
    @PostConstruct // 相当于bean的 init-method
    private void initFlowRules() {

        // 流控规则集合
        // 还有其他规则道理相同，比如：熔断降级规则 (DegradeRule)、系统保护规则 (SystemRule)、访问控制规则 (AuthorityRule)、热点规则 (ParamFlowRule)
        List<FlowRule> flowRuleList = new ArrayList();

        // 定义流控规则
        FlowRule flowRule1 = new FlowRule();
        // 设置受保护的资源
        flowRule1.setResource(RESOURCE_NAME);
        // 设置流控规则 限流阈值类型，QPS 模式（1）或并发线程数模式（0）
        flowRule1.setGrade(RuleConstant.FLOW_GRADE_QPS);
        // 设置保护限流阈值（整合起来就是1s 只能访问一次）
        flowRule1.setCount(1);
        flowRuleList.add(flowRule1);


        // 通过@SentinelResource来定义资源的流控和降级规则
        FlowRule flowRule2 = new FlowRule();
        // 设置受保护的资源
        flowRule2.setResource(USER_RESOURCE_NAME);
        // 设置流控规则 限流阈值类型，QPS 模式（1）或并发线程数模式（0）
        flowRule2.setGrade(RuleConstant.FLOW_GRADE_QPS);
        // 设置保护限流阈值（整合起来就是1s 只能访问一次）
        flowRule2.setCount(1);
        flowRuleList.add(flowRule2);


        // 加载配置好的规则
        FlowRuleManager.loadRules(flowRuleList);

    }

    /********************************* 使用@SentinelResource改善硬编码格式 ****************************/

    /**
     * @SentinelResource 改善接口中资源定义和被流控降级后的处理方法
     * 使用：
     * 1. 添加依赖：<artifactId>sentinel-annotation-aspectj</artifactId>
     * 2. 配置bean SentinelResourceAspect（单独使用的话必须注入bean，这个切面没有定义@Component）
     *    value：定义资源
     *    blockHandler：设置流控降级后的处理方法（默认该方法必须跟流控接口声明在同一个类中）
     *      如果不想在同一个类中可以用blockHandlerClass来指定，但是方法必须是public static修饰
     *    fallback：当接口出现了异常，就可以交给fallback执行的方法进行处理
     *      如果不想在同一个类中可以用fallbackClass来指定，但是方法必须是public static修饰
     *    优先级：blockHandler > fallback
     *    exceptionsToIgnore：要排除的异常
     *
     * @param id
     * @return com.xiexie.sentinel.Entry.User
     */
    @RequestMapping("/user")
    @SentinelResource(value = USER_RESOURCE_NAME
            , blockHandler = "blockHandlerForGetUser"
            , blockHandlerClass = {User.class}
            , fallback = "fallbackForGetUser"
            , exceptionsToIgnore = {ArithmeticException.class}
    )
    public User getUser(String id) {
        //int a = 1/0;
        return new User("xiexie");
    }

    /**
     * 注意：
     * 1. 一定要是public修饰
     * 2. 返回值一定要跟源方法一致，包含源方法参数（顺序也要一致）
     * 3. 可以在参数中加BlockException异常处理，可以区分是什么类型的规则，对症下药。
     * @param id
     * @param e
     * @return com.xiexie.sentinel.Entry.User
     */
    public User blockHandlerForGetUser(String id, BlockException e) {
        e.printStackTrace();
        return new User("被流控");
    }

    public User fallbackForGetUser(String id, Throwable throwable) {
        throwable.printStackTrace();
        return new User("异常处理");
    }


}
