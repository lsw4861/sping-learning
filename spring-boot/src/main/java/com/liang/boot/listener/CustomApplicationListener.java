package com.liang.boot.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.*;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * create by liang on 2018/5/27.
 */
@Slf4j
public class CustomApplicationListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        // 监听ApplicationStartingEvent
        if (event instanceof ApplicationStartedEvent) {
            log.info("spring boot启动开始时执行的事件=======ApplicationStartedEvent listened===========");
        }

        // 监听ApplicationEnvironmentPreparedEvent
        else if (event instanceof ApplicationEnvironmentPreparedEvent) {
            log.info("spring boot 对应Enviroment已经准备完毕，但此时上下文context还没有创建======ApplicationEnvironmentPreparedEvent listened");
        }

        // 监听ApplicationPreparedEvent
        else if (event instanceof ApplicationPreparedEvent) {
            log.info("spring boot上下文context创建完成=======ApplicationPreparedEvent listened");
        }

        // 监听ApplicationReadyEvent
        else if (event instanceof ApplicationReadyEvent) {
            log.info("spring boot启动完成时执行事件=======ApplicationReadyEvent listened");
        }

        // ApplicationStartingEvent
        else if (event instanceof ApplicationStartingEvent) {
            log.info("spring boot正在启动时执行事件======ApplicationStartingEvent listened");
        }

        // 监听ApplicationFailedEvent
        else if (event instanceof ApplicationFailedEvent) {
            log.info("spring boot启动异常时执行事件======ApplicationFailedEvent listened");
        }
    }

}
