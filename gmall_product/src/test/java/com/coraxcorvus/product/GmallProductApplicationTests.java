package com.coraxcorvus.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.coraxcorvus.gmall.product.GmallProductApplication;
import com.coraxcorvus.gmall.product.entity.BrandEntity;
import com.coraxcorvus.gmall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GmallProductApplication.class)
public class GmallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        /*brandEntity.setName("三星");
        brandService.save(brandEntity);
        System.out.println("保存成功...");*/


        /*brandEntity.setName("华为");
        brandEntity.setBrandId(1L);
        brandService.updateById(brandEntity);*/

        /*List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));*/
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>());
        list.forEach((item) -> {
            System.out.println(item);
        });

    }

}
