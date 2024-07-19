package com.coraxcorvus.gmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * @auth gcorvus
 * @date 2024-07-19 11:08:18
 * @desc 订单项信息
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

