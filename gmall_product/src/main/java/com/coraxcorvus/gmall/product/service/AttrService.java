package com.coraxcorvus.gmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * @auth gcorvus
 * @date 2024-07-18 17:00:54
 * @desc 商品属性
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

