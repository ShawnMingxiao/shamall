package com.lmx.shamall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lmx.shamall.common.utils.PageUtils;
import com.lmx.shamall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author lmx
 * @email lmx@gmail.com
 * @date 2023-04-22 16:09:48
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

