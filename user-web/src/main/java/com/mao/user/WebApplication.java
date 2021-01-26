package com.mao.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author 799608 maomingpei
 * @Date 2019/12/30 17:44
 * @Description consumer 启动
 */
@SpringBootApplication
@ImportResource("dubbo/dubbo.xml")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class);
    }

}
