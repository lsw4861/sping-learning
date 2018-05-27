package com.liang.boot.Initializer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * create by liang on 2018/5/27.
 */
@Component
@Slf4j
public class ContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
      log.info("自定义的初始化器的initialize方法被执行了 ============ ");
        //throw new RuntimeException("人为创造的运行时异常");
    }
}
