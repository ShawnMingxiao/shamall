package com.lmx.shamall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lmx.shamall.common.utils.PageUtils;
import com.lmx.shamall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author lmx
 * @email lmx@gmail.com
 * @date 2023-04-22 16:12:58
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

