/*
package com.mao.user.control;

import com.mao.user.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

*/
/**
 * @Author 799608 maomingpei
 * @Date 2019/12/30 15:23
 * @Description
 *//*

@RestController
public class zhujie_UserControl {

    */
/*@Reference(version = "1.0.0",url = "dubbo://127.0.0.1:12345")//无zookeeper时，直连获取
    private UserService userService;*//*


    @Reference(version = "1.0.0")//有zookeeper，不用加url
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello1() {
        return userService.sayHello();
    }
}
*/
