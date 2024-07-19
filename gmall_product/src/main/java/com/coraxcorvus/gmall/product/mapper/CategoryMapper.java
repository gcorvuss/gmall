package com.coraxcorvus.gmall.product.mapper;

import com.coraxcorvus.gmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @auth gcorvus
 * @date 2024-07-18 17:00:54
 * @desc 商品三级分类
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {
	
}
