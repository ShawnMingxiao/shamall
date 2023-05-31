package com.lmx.shamall.ware.dao;

import com.lmx.shamall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author lmx
 * @email lmx@gmail.com
 * @date 2023-04-22 16:36:38
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
