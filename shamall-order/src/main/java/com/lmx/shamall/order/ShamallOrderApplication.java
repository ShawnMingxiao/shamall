package com.lmx.shamall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com/lmx/shamall/order/dao")
@EnableDiscoveryClient
@SpringBootApplication
public class ShamallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShamallOrderApplication.class, args);
    }

}
