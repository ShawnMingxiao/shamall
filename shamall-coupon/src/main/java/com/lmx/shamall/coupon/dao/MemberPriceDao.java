package com.lmx.shamall.coupon.dao;

import com.lmx.shamall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author lmx
 * @email lmx@gmail.com
 * @date 2023-04-22 16:09:48
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
