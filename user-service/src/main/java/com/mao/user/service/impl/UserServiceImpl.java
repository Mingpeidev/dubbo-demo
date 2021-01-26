package com.mao.user.service.impl;

import com.mao.user.service.UserService;

/**
 * @Author 799608 maomingpei
 * @Date 2019/12/30 15:03
 * @Description xml配置方式 注解去掉 名字去掉注解
 */
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello() {
        /*try {
            Thread.sleep(5000);//超时重试
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "hello first dubbo!";
    }
}
