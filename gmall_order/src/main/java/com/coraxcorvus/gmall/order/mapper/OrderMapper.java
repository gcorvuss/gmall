package com.coraxcorvus.gmall.order.mapper;

import com.coraxcorvus.gmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @auth gcorvus
 * @date 2024-07-19 11:08:18
 * @desc 订单
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
