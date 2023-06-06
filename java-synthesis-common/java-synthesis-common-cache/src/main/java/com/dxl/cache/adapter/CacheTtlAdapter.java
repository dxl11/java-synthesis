package com.dxl.cache.adapter;


import com.dxl.cache.bo.CacheNameWithTtlBO;

import java.util.List;

/**
* @Description: 实现该接口之后，根据缓存的cacheName和ttl将缓存进行过期
* @Param:
* @return:
* @Author: lydms
* @Date: 2023/6/6
*/
public interface CacheTtlAdapter {

	/**
	 * 根据缓存的cacheName和ttl将缓存进行过期
	 * @return 需要独立设置过期时间的缓存列表
	 */
	List<CacheNameWithTtlBO> listCacheNameWithTtl();

}
