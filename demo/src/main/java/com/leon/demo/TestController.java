package com.leon.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author helong
 * @date 2020/9/11
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("helloWorld")
    public String helloWorld(){
        return "hello world";
    }
}
