package com.smart4j.controller;

import com.smart4j.framework.annotation.Aspect;
import com.smart4j.framework.annotation.Controller;
import com.smart4j.framework.annotation.Inject;
import com.smart4j.framework.annotation.Transaction;
import com.smart4j.service.HelloService;

/**
 * Created by DELL on 2018/4/1.
 */

@Controller
public class HelloController {

    @Inject
    private HelloService helloService;

    public String sayHello(String name) {
        return helloService.sayHello(name);
    }

    public void swap() {
        helloService.swap();
    }
}
