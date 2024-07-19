package com.coraxcorvus.gmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.common.utils.Query;

import com.coraxcorvus.gmall.order.mapper.OrderReturnReasonMapper;
import com.coraxcorvus.gmall.order.entity.OrderReturnReasonEntity;
import com.coraxcorvus.gmall.order.service.OrderReturnReasonService;


@Service("orderReturnReasonService")
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonMapper, OrderReturnReasonEntity> implements OrderReturnReasonService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderReturnReasonEntity> page = this.page(
                new Query<OrderReturnReasonEntity>().getPage(params),
                new QueryWrapper<OrderReturnReasonEntity>()
        );

        return new PageUtils(page);
    }

}