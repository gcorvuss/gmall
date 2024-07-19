package com.coraxcorvus.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * @auth gcorvus
 * @date 2024-07-19 11:01:31
 * @desc 会员等级
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

