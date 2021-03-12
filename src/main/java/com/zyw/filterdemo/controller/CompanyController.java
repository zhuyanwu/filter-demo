package com.zyw.filterdemo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CompanyController {


    @PostMapping("/test")
    public String test(){
        log.info("test 方法...");
        return "test";
    }
}
