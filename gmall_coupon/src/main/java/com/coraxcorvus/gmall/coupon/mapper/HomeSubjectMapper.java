package com.coraxcorvus.gmall.coupon.mapper;

import com.coraxcorvus.gmall.coupon.entity.HomeSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @auth gcorvus
 * @date 2024-07-19 10:52:31
 * @desc 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 */
@Mapper
public interface HomeSubjectMapper extends BaseMapper<HomeSubjectEntity> {
	
}
