package com.mao.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author 799608 maomingpei
 * @Date 2019/12/30 15:15
 * @Description provider 启动
 */
@EnableAutoConfiguration
@ImportResource("classpath:dubbo/dubbo.xml")
public class DubboProviderDemo {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderDemo.class);
    }
}
