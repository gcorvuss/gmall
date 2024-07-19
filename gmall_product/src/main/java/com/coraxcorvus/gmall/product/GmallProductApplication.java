package com.coraxcorvus.gmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.coraxcorvus.gmall.product.mapper")
@SpringBootApplication
public class GmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallProductApplication.class, args);
    }

}
