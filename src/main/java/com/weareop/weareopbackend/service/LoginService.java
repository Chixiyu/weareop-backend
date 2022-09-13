package com.weareop.weareopbackend.service;

import com.alibaba.fastjson2.JSONObject;
import com.sun.tools.jconsole.JConsoleContext;
import com.weareop.weareopbackend.entity.Up;
import com.weareop.weareopbackend.mapper.LoginMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class LoginService {
    @Resource
    private RedisTemplate<String,String> redisTemplate;
    @Resource
    LoginMapper loginMapper;

    private static final Logger LOG= LoggerFactory.getLogger(LoginService.class);

    public Up loginByUpName(String upName,String password){
        Up up=loginMapper.loginByUpName(upName,password);
        System.out.println("upname: "+upName+" password"+password);
        if(up==null){
            return null;
        }
        else if(up.getPassword().equals(password)){
            String newToken= UUID.randomUUID().toString();
            up.setToken(newToken);
            redisTemplate.opsForValue().set(newToken, JSONObject.toJSONString(up),60, TimeUnit.SECONDS);
            LOG.info("Added new token: {}",newToken);
            return up;
        }
        else{
            return null;
        }
    }

    public void logOut(String token){
        try{
            redisTemplate.delete(token);
            LOG.info("Deleted token from redis: {}",token);
        }
        catch (Exception e){
            e.printStackTrace();
            LOG.error("Delete token failed:{}",token);
        }
    }
}
