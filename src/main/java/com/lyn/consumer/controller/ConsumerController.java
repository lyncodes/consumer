package com.lyn.consumer.controller;


import com.lyn.consumer.call.MyFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private MyFeignClient myFeignClient;


    @RequestMapping("/hello")
    public String hello() {
        System.out.println("choose one to call");

        return myFeignClient.hello();

    }

}
