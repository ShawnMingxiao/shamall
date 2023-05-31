package com.lmx.shamall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lmx.shamall.common.utils.PageUtils;
import com.lmx.shamall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author lmx
 * @email lmx@gmail.com
 * @date 2023-04-22 15:00:55
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

