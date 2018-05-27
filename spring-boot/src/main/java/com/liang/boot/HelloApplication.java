package com.liang.boot;

import com.liang.boot.Initializer.ContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * create by liang on 2018/5/26.
 */
@SpringBootApplication
@ComponentScan
public class HelloApplication {

    public static void main(String[] args) {

        //SpringApplication.run(HelloApplication.class, args);

        //创建SpringApplication的实例
        SpringApplication springApplication = new SpringApplication(HelloApplication.class);

        // // 添加定制的初始化器
        springApplication.addInitializers(new ContextInitializer());

        // 执行SpringApplication实例的run方法
        springApplication.run(args);

    }


}



