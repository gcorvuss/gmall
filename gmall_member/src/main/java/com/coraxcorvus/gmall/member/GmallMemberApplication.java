package com.coraxcorvus.gmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.coraxcorvus.gmall.member.mapper")
@SpringBootApplication
public class GmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallMemberApplication.class, args);
    }

}
