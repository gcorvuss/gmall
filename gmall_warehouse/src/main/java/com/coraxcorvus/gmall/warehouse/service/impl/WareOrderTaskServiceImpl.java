package com.coraxcorvus.gmall.warehouse.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.common.utils.Query;

import com.coraxcorvus.gmall.warehouse.mapper.WareOrderTaskMapper;
import com.coraxcorvus.gmall.warehouse.entity.WareOrderTaskEntity;
import com.coraxcorvus.gmall.warehouse.service.WareOrderTaskService;


@Service("wareOrderTaskService")
public class WareOrderTaskServiceImpl extends ServiceImpl<WareOrderTaskMapper, WareOrderTaskEntity> implements WareOrderTaskService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareOrderTaskEntity> page = this.page(
                new Query<WareOrderTaskEntity>().getPage(params),
                new QueryWrapper<WareOrderTaskEntity>()
        );

        return new PageUtils(page);
    }

}