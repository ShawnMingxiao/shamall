package com.lmx.shamall.member.feign;

import com.lmx.shamall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 调用远程服务：
 *  1， 引入open-feign <artifactId>spring-cloud-starter-openfeign</artifactId>
 *  2， 编写接口去请求远程服务， 接口名字跟远程接口方法名子一样， @RequestMapping里面的路径是远程接口全路径
 *  3, autowired 该接口并调用方法
 */

@FeignClient("shamall-coupon")
public interface CouponFeignClient {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();

}
