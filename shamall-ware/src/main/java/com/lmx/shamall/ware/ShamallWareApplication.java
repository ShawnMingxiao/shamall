package com.lmx.shamall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com/lmx/shamall/ware/dao")
@EnableDiscoveryClient
@SpringBootApplication
public class ShamallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShamallWareApplication.class, args);
    }

}
