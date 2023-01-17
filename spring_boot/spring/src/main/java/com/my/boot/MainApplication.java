package com.my.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.my.boot.dao")
public class MainApplication {
    public static void main(String[] args_) throws Exception {
        SpringApplication.run(MainApplication.class, args_);
    }
}