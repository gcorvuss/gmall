package com.coraxcorvus.gmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * @auth gcorvus
 * @date 2024-07-19 11:08:18
 * @desc 支付信息表
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

