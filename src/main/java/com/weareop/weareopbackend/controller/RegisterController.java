package com.weareop.weareopbackend.controller;

import com.weareop.weareopbackend.service.RegisterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RegisterController {

    @Resource
    RegisterService registerService;
    @PostMapping("/register")
    public boolean register(String upName, String upTagColor,String upTagText,String password, String secretCode){
        return registerService.register(upName,upTagColor,upTagText,password,secretCode);
    }
}
