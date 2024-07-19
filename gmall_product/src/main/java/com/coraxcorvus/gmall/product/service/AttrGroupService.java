package com.coraxcorvus.gmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * @auth gcorvus
 * @date 2024-07-18 17:00:54
 * @desc 属性分组
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

