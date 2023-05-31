package com.lmx.shamall.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.lmx.shamall.member.feign.CouponFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lmx.shamall.member.entity.MemberEntity;
import com.lmx.shamall.member.service.MemberService;
import com.lmx.shamall.common.utils.PageUtils;
import com.lmx.shamall.common.utils.R;



/**
 * 会员
 *
 * @author lmx
 * @email lmx@gmail.com
 * @date 2023-04-22 16:12:58
 *
 */

/**
 *  使用nacos作为配置中心
 * 1, 引入依赖 spring-cloud-starter-alibaba-nacos-config
 * 2, 创建bootstrap.properties
 *   spring.application.name=shamall-member
 *   spring.cloud.nacos.config.serverAddr=127.0.0.1:8848
 * 3, 给配置中心添加数据集 (应用名.properties)
 * 4, 获取动态配置信息：
 * @RefreshScope 动态获取并刷新
 * @Value("${}")
 */
@RefreshScope
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    CouponFeignClient couponFeignClient;

    @Value("${name}")
    String name;
    @Value("${age}")
    int age;

    @RequestMapping("test")
    public R test(){
//        MemberEntity member = new MemberEntity();
//        member.setNickname("lmx");
//
//        R membercoupons = couponFeignClient.membercoupons();
//
//        return R.ok().put("member", member).put("coupons", membercoupons.get("coupons"));
        return R.ok().put("name", name).put("age", age);

    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
