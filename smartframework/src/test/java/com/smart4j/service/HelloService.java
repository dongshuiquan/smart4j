package com.smart4j.service;

import com.smart4j.framework.annotation.Service;

/**
 * Created by DELL on 2018/4/1.
 */

@Service
public class HelloService {

    public String sayHello(String name) {
        return "Hello " + name;
    }
}
