package com.lyn.consumer.call;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


// name 即是注册到eureka的spring.application.name的值
@FeignClient(name = "provider")
public interface MyFeignClient {

    @RequestMapping(value = "/hello")
    String hello();

}
