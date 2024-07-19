package com.coraxcorvus.gmall.coupon.service.impl;

import com.coraxcorvus.gmall.coupon.mapper.CouponMapper;
import com.coraxcorvus.gmall.coupon.entity.CouponEntity;
import com.coraxcorvus.gmall.coupon.service.CouponService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.common.utils.Query;


@Service("couponService")
public class CouponServiceImpl extends ServiceImpl<CouponMapper, CouponEntity> implements CouponService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponEntity> page = this.page(
                new Query<CouponEntity>().getPage(params),
                new QueryWrapper<CouponEntity>()
        );

        return new PageUtils(page);
    }

}