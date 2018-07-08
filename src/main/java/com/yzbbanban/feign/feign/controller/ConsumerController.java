package com.yzbbanban.feign.feign.controller;

import com.yzbbanban.feign.feign.domain.User;
import com.yzbbanban.feign.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by brander on 2018/7/8
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello() + ",");
        sb.append(helloService.hello1("banban") + ",");
        sb.append(helloService.hello2("yy", 13) + ",");
        sb.append(helloService.hello3(new User("cc", 12)));

        return sb.toString();
    }
}
