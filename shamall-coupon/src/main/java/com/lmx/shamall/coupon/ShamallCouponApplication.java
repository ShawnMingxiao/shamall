package com.lmx.shamall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com/lmx/shamall/coupon/dao")
@EnableDiscoveryClient
@SpringBootApplication
public class ShamallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShamallCouponApplication.class, args);
    }

}
