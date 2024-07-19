package com.coraxcorvus.gmall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coraxcorvus.gmall.common.utils.PageUtils;
import com.coraxcorvus.gmall.common.utils.Query;

import com.coraxcorvus.gmall.coupon.mapper.MemberPriceMapper;
import com.coraxcorvus.gmall.coupon.entity.MemberPriceEntity;
import com.coraxcorvus.gmall.coupon.service.MemberPriceService;


@Service("memberPriceService")
public class MemberPriceServiceImpl extends ServiceImpl<MemberPriceMapper, MemberPriceEntity> implements MemberPriceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberPriceEntity> page = this.page(
                new Query<MemberPriceEntity>().getPage(params),
                new QueryWrapper<MemberPriceEntity>()
        );

        return new PageUtils(page);
    }

}