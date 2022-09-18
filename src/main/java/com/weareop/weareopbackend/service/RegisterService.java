package com.weareop.weareopbackend.service;

import com.weareop.weareopbackend.mapper.RegisterMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RegisterService {
    @Resource
    RegisterMapper registerMapper;

    private static final Logger LOG= LoggerFactory.getLogger(LoginService.class);

    public static final String code="WeAreAllOp";

    public boolean register(String upName, String upTagColor,String upTagText,String password, String secretCode){
        if(secretCode==null){
            return false;
        }
        else if(!secretCode.equals(code)){
            return false;
        }
        else{
            try{
                registerMapper.register(upName,upTagColor,upTagText,password);
                return true;
            }
            catch (Exception e){
                LOG.error(e.getMessage());
                return false;
            }
        }
    }
}
