package com.mao.user.service.impl;

import com.mao.user.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author 799608 maomingpei
 * @Date 2019/12/30 15:03
 * @Description 注解配置方式 注解改为dubbo注解 名字去掉注解
 */
@Service(version = "1.0.0")
public class zhujie_UserServiceImpl implements UserService {

    @Override
    public String sayHello() {
        return "hello first dubbo!";
    }
}
