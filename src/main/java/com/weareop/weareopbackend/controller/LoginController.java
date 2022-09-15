package com.weareop.weareopbackend.controller;


import com.weareop.weareopbackend.entity.Up;
import com.weareop.weareopbackend.service.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {

    @Resource
    LoginService loginService;


    @PostMapping("/login")
    public Up loginByUpName(String upName,String password){
        return loginService.loginByUpName(upName,password);
    }

    @GetMapping("/logout")
    public void logout(String token){
        loginService.logOut(token);
    }

    @PostMapping("/tokenlogin")
    public String loginByToken(String token){
        return loginService.loginByToken(token);
    }

}
