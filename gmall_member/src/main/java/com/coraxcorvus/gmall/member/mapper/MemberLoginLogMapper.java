package com.coraxcorvus.gmall.member.mapper;

import com.coraxcorvus.gmall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @auth gcorvus
 * @date 2024-07-19 11:01:31
 * @desc 会员登录记录
 */
@Mapper
public interface MemberLoginLogMapper extends BaseMapper<MemberLoginLogEntity> {
	
}
