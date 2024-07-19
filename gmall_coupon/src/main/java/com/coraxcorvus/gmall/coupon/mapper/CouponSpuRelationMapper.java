package com.coraxcorvus.gmall.coupon.mapper;

import com.coraxcorvus.gmall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @auth gcorvus
 * @date 2024-07-19 10:52:31
 * @desc 优惠券与产品关联
 */
@Mapper
public interface CouponSpuRelationMapper extends BaseMapper<CouponSpuRelationEntity> {
	
}
