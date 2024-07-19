package com.coraxcorvus.gmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.common.utils.Query;

import com.coraxcorvus.gmall.order.mapper.OrderMapper;
import com.coraxcorvus.gmall.order.entity.OrderEntity;
import com.coraxcorvus.gmall.order.service.OrderService;


@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderEntity> implements OrderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderEntity> page = this.page(
                new Query<OrderEntity>().getPage(params),
                new QueryWrapper<OrderEntity>()
        );

        return new PageUtils(page);
    }

}