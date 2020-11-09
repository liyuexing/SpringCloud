package com.moonstar.gatewayzuul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClientServer {

    @RequestMapping("/say")
    @ResponseBody
    public String sayHello(){
        return "我是来自client服务端，你好呀！";
    }
}
