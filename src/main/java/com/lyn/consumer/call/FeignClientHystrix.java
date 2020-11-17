package com.lyn.consumer.call;

import org.springframework.stereotype.Component;

@Component
public class FeignClientHystrix implements MyFeignClient {
    @Override
    public String hello() {
        return "the server is down, this is a fallback method";
    }
}
