package com.lmx.shamall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lmx.shamall.common.utils.PageUtils;
import com.lmx.shamall.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author lmx
 * @email lmx@gmail.com
 * @date 2023-04-22 16:32:31
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

