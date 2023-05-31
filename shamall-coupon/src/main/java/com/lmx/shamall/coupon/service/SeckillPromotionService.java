package com.lmx.shamall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lmx.shamall.common.utils.PageUtils;
import com.lmx.shamall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author lmx
 * @email lmx@gmail.com
 * @date 2023-04-22 16:09:48
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

