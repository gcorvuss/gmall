package com.coraxcorvus.gmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * @auth gcorvus
 * @date 2024-07-18 17:00:54
 * @desc 品牌
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

