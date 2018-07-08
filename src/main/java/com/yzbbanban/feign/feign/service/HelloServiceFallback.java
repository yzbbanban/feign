package com.yzbbanban.feign.feign.service;

import com.yzbbanban.feign.feign.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by brander on 2018/7/8
 */
@Component
public class HelloServiceFallback implements HelloService {
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello1(@RequestParam("name") String name) {
        return "error";
    }

    @Override
    public User hello2(@RequestHeader("name") String name, @RequestHeader("name") Integer age) {
        return new User("未知", 0);
    }

    @Override
    public String hello3(@RequestBody User user) {
        return "error";
    }
}
