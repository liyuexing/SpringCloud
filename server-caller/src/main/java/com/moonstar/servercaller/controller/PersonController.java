package com.moonstar.servercaller.controller;


import com.moonstar.servercaller.feignclient.SayHelloCalller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonController {
    @Autowired
    private SayHelloCalller caller;
    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        System.out.println("---------------");
        return caller.sayHello();
    }
}
