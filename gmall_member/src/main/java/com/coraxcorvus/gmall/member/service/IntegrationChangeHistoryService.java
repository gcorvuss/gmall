package com.coraxcorvus.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * @auth gcorvus
 * @date 2024-07-19 11:01:31
 * @desc 积分变化历史记录
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

