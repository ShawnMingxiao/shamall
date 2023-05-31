package com.lmx.shamall.coupon.dao;

import com.lmx.shamall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lmx
 * @email lmx@gmail.com
 * @date 2023-04-22 16:09:48
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
