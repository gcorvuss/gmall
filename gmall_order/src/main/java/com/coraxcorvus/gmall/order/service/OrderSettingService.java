package com.coraxcorvus.gmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * @auth gcorvus
 * @date 2024-07-19 11:08:18
 * @desc 订单配置信息
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

