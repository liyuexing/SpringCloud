package com.moonstar.servercaller.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "client-server-surport")
public interface SayHelloCalller {

    @RequestMapping("/sayHello")
    public String sayHello();
}
