package com.lmx.shamall.product;

import com.lmx.shamall.product.entity.BrandEntity;
import com.lmx.shamall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShamallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("dummy");
//        brandEntity.setName("lmx");
//        brandService.save(brandEntity);
//        System.out.println("save successfully");
    }

}
