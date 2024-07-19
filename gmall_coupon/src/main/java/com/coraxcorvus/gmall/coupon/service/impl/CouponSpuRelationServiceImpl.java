package com.coraxcorvus.gmall.coupon.service.impl;

import com.coraxcorvus.gmall.coupon.mapper.CouponSpuRelationMapper;
import com.coraxcorvus.gmall.coupon.entity.CouponSpuRelationEntity;
import com.coraxcorvus.gmall.coupon.service.CouponSpuRelationService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.common.utils.Query;


@Service("couponSpuRelationService")
public class CouponSpuRelationServiceImpl extends ServiceImpl<CouponSpuRelationMapper, CouponSpuRelationEntity> implements CouponSpuRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponSpuRelationEntity> page = this.page(
                new Query<CouponSpuRelationEntity>().getPage(params),
                new QueryWrapper<CouponSpuRelationEntity>()
        );

        return new PageUtils(page);
    }

}