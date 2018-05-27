package com.liang.boot.service;

/**
 * create by liang on 2018/5/27.
 */

import com.liang.boot.HelloApplication;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.liang.com
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HelloApplication.class)
@Slf4j
public class ApplicationTests {

    //private static final Log log = LogFactory.getLog(ApplicationTests.class);

    @Autowired
    private BlogProperties blogProperties;


    @Test
    public void test1() throws Exception {
        log.info("梁世伟" + blogProperties.getName());
        log.info("Spring Boot教程" + blogProperties.getTitle());
        log.info("程序猿DD正在努力学习《Spring Boot教程》" + blogProperties.getDesc());

        log.info("随机数测试输出：");
        log.info("随机字符串 : " + blogProperties.getValue());
        log.info("随机int : " + blogProperties.getNumber());
        log.info("随机long : " + blogProperties.getBignumber());
        log.info("随机10以下 : " + blogProperties.getTest1());
        log.info("随机10-20 : " + blogProperties.getTest2());

    }

}


