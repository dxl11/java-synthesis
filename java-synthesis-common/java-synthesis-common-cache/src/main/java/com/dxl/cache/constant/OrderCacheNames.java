package com.dxl.cache.constant;

/**
 * @Description:缓存名字
 * @Param:
 * @return:
 * @Author: lydms
 * @Date: 2023/6/6
 */
public interface OrderCacheNames {

    /**
     * 前缀
     */
    String ORDER_PREFIX = "mall4cloud_order:";

    /**
     * 确认订单信息缓存
     */
    String ORDER_CONFIRM_KEY = ORDER_PREFIX + "order:confirm";

    /**
     * 订单uuid
     */
    String ORDER_CONFIRM_UUID_KEY = ORDER_PREFIX + "order:uuid_confirm";
}
