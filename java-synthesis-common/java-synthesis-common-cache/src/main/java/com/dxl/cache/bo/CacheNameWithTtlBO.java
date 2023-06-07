package com.dxl.cache.bo;

/**
* @Description: 通过 cacheName 配置 和 时间告诉缓存多久清楚一遍
* @Param:
* @return:
* @Author: lydms
* @Date: 2023/6/6
*/
public class CacheNameWithTtlBO {

	private String cacheName;

	/**生存时间*/
	private Integer ttl;

	public CacheNameWithTtlBO(String cacheName, Integer ttl) {
		this.cacheName = cacheName;
		this.ttl = ttl;
	}

	public String getCacheName() {
		return cacheName;
	}

	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
	}

	public Integer getTtl() {
		return ttl;
	}

	public void setTtl(Integer ttl) {
		this.ttl = ttl;
	}

	@Override
	public String toString() {
		return "CacheNameWithTtlBO{" + "cacheName='" + cacheName + '\'' + ", ttl=" + ttl + '}';
	}

}