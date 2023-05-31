package com.lmx.shamall.coupon.dao;

import com.lmx.shamall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author lmx
 * @email lmx@gmail.com
 * @date 2023-04-22 16:09:48
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
