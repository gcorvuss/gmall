package com.coraxcorvus.gmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * @auth gcorvus
 * @date 2024-07-19 11:08:18
 * @desc 退货原因
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

