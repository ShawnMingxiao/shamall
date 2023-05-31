package com.lmx.shamall.product.dao;

import com.lmx.shamall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lmx
 * @email lmx@gmail.com
 * @date 2023-04-22 15:00:56
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
