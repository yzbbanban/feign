package com.yzbbanban.feign.feign.service;


import com.yzbbanban.feign.feign.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by brander on 2018/7/8
 */
@FeignClient(name = "UUABB-SERVICE",fallback = HelloServiceFallback.class)
public interface HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello1(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello2(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello3(@RequestBody User user);
}
