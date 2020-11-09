package com.moonstar.servercaller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CallerServer {
    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        return "我是来自caller的服务端，你好呀！";
    }
}
