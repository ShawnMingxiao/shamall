package com.lmx.shamall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com/lmx/shamall/member/dao")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.lmx.shamall.member.feign")
@SpringBootApplication
public class ShamallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShamallMemberApplication.class, args);
    }

}
