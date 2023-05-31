package com.lmx.shamall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lmx.shamall.common.utils.PageUtils;
import com.lmx.shamall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author lmx
 * @email lmx@gmail.com
 * @date 2023-04-22 15:00:56
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

