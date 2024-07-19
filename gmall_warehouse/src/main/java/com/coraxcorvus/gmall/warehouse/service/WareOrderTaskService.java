package com.coraxcorvus.gmall.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.warehouse.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * @auth gcorvus
 * @date 2024-07-19 11:10:16
 * @desc 库存工作单
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

