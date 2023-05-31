package com.lmx.shamall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lmx.shamall.common.utils.PageUtils;
import com.lmx.shamall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author lmx
 * @email lmx@gmail.com
 * @date 2023-04-22 15:00:56
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

