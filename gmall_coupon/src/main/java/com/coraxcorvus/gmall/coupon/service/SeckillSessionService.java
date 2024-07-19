package com.coraxcorvus.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * @auth gcorvus
 * @date 2024-07-19 10:52:31
 * @desc 秒杀活动场次
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

