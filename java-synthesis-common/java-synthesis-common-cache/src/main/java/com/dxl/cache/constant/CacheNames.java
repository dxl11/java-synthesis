package com.dxl.cache.constant;

/**
 * @Description:缓存名字
 * @Param:
 * @return:
 * @Author: lydms
 * @Date: 2023/6/6
 */
public interface CacheNames extends RbacCacheNames,OauthCacheNames,ProductCacheNames,MultishopCacheNames,PlatformCacheNames,BizCacheNames, UserCacheNames {
    /**
     *
     * 参考CacheKeyPrefix
     * cacheNames 与 key 之间的默认连接字符
     */
    String UNION = "::";

    /**
     * key内部的连接字符（自定义）
     */
    String UNION_KEY = ":";

}
