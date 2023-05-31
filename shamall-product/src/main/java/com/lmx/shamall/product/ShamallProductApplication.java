package com.lmx.shamall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com/lmx/shamall/product/dao")
@EnableDiscoveryClient
@SpringBootApplication
public class ShamallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShamallProductApplication.class, args);
    }

}
