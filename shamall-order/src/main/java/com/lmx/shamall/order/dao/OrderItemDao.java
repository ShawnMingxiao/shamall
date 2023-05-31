package com.lmx.shamall.order.dao;

import com.lmx.shamall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author lmx
 * @email lmx@gmail.com
 * @date 2023-04-22 16:32:31
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
