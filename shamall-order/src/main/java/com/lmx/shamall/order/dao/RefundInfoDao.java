package com.lmx.shamall.order.dao;

import com.lmx.shamall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author lmx
 * @email lmx@gmail.com
 * @date 2023-04-22 16:32:31
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
