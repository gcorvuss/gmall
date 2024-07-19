package com.coraxcorvus.gmall.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.warehouse.entity.WareSkuEntity;

import java.util.Map;

/**
 * @auth gcorvus
 * @date 2024-07-19 11:10:16
 * @desc 商品库存
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

