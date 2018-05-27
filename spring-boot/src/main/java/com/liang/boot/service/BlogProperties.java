package com.liang.boot.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * create by liang on 2018/5/27.
 */

@Component
@Setter
@Getter
@ToString
public class BlogProperties {

    @Value("${com.liang.blog.name}")
    private String name;
    @Value("${com.liang.blog.title}")
    private String title;
    @Value("${com.liang.blog.desc}")
    private String desc;

    @Value("${com.liang.blog.value}")
    private String value;
    @Value("${com.liang.blog.number}")
    private Integer number;
    @Value("${com.liang.blog.bignumber}")
    private Long bignumber;
    @Value("${com.liang.blog.test1}")
    private Integer test1;
    @Value("${com.liang.blog.test2}")
    private Integer test2;
}

