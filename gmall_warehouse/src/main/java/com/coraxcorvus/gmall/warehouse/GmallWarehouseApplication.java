package com.coraxcorvus.gmall.warehouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.coraxcorvus.gmall.warehouse.mapper")
@SpringBootApplication
public class GmallWarehouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallWarehouseApplication.class, args);
    }

}
