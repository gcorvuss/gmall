package com.coraxcorvus.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * @auth gcorvus
 * @date 2024-07-19 11:01:31
 * @desc 会员统计信息
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

