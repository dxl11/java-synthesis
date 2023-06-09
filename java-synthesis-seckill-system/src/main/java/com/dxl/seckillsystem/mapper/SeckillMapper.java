package com.dxl.seckillsystem.mapper;

import com.dxl.seckillsystem.entity.Seckill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SeckillMapper {
    /**
     * 减库存
     * @param seckillId
     */
    void reduceNumber(@Param("seckillId") int seckillId);

    /**
     *
     */
    Seckill queryById(@Param("seckillId") Long seckillId);


}
