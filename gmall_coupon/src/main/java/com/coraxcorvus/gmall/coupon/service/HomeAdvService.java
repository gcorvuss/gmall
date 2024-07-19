package com.coraxcorvus.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * @auth gcorvus
 * @date 2024-07-19 10:52:31
 * @desc 首页轮播广告
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

