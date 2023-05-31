package com.lmx.shamall.member.dao;

import com.lmx.shamall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lmx
 * @email lmx@gmail.com
 * @date 2023-04-22 16:12:58
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
