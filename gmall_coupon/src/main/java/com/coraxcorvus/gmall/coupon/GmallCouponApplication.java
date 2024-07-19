package com.coraxcorvus.gmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.coraxcorvus.gmall.coupon.mapper")
@SpringBootApplication
public class GmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallCouponApplication.class, args);
    }

}
