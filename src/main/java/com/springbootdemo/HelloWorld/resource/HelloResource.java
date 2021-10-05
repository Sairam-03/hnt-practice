package com.springbootdemo.HelloWorld.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello!!!";
    }
}
