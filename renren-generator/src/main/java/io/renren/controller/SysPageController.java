package io.renren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SysPageController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/main.html")
    public String main() {
        return "main";
    }

    @RequestMapping("/generator.html")
    public String generator() {
        return "generator";
    }
}
