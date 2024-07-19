package com.coraxcorvus.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * @auth gcorvus
 * @date 2024-07-19 10:52:31
 * @desc 商品阶梯价格
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

