package com.coraxcorvus.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * @auth gcorvus
 * @date 2024-07-19 10:52:31
 * @desc 优惠券信息
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

