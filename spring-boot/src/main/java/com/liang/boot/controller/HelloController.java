package com.liang.boot.controller;

import com.liang.boot.service.BlogProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by liang on 2018/5/26.
 */
@RestController
public class HelloController {

    @Autowired
    private BlogProperties blogProperties;

    @GetMapping("/")
    public String home(){
        return "Hello World!";
    }

    @RequestMapping("/hello/{world}")
    String index(@PathVariable String world) {
        return "Hello "+world+"!!!"+ blogProperties.toString() ;
    }

}
