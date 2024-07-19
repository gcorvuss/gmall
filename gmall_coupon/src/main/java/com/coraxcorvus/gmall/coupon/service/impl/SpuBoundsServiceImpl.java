package com.coraxcorvus.gmall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.common.utils.Query;

import com.coraxcorvus.gmall.coupon.mapper.SpuBoundsMapper;
import com.coraxcorvus.gmall.coupon.entity.SpuBoundsEntity;
import com.coraxcorvus.gmall.coupon.service.SpuBoundsService;


@Service("spuBoundsService")
public class SpuBoundsServiceImpl extends ServiceImpl<SpuBoundsMapper, SpuBoundsEntity> implements SpuBoundsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuBoundsEntity> page = this.page(
                new Query<SpuBoundsEntity>().getPage(params),
                new QueryWrapper<SpuBoundsEntity>()
        );

        return new PageUtils(page);
    }

}