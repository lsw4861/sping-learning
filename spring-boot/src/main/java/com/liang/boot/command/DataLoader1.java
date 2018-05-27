package com.liang.boot.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * create by liang on 2018/5/27.
 */
@Slf4j
@Component
@Order(1)
public class DataLoader1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
      log.info("服务启动执行，执行加载数据等操作===========one===========");
    }
}
