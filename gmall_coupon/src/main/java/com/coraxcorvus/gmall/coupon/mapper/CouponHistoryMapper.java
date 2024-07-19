package com.coraxcorvus.gmall.coupon.mapper;

import com.coraxcorvus.gmall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @auth gcorvus
 * @date 2024-07-19 10:52:31
 * @desc 优惠券领取历史记录
 */
@Mapper
public interface CouponHistoryMapper extends BaseMapper<CouponHistoryEntity> {
	
}
