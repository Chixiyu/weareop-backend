package com.weareop.weareopbackend.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Resource
    private RedisTemplate<String, String> redisTemplate;

    private static final Logger LOG = LoggerFactory.getLogger(LoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LOG.info("mvc Interceptor: {}", request.getHeader("token"));
        if (request.getMethod().equalsIgnoreCase("OPTIONS")) {
            LOG.info("Returned OPTIONS");
            return true;
        }
        String path = request.getRequestURL().toString();
        LOG.info("Login interface intercepted, path: {}", path);

        String token = request.getHeader("token");
        LOG.info("Starting login verification: token{}", token);
        if (token == null || token.isEmpty()) {
            LOG.info("Token is empty, request denied");
            return false;
        }
        String s = redisTemplate.opsForValue().get(token);
        if (s == null || s.isEmpty()) {
            LOG.warn("Token is invalid, request denied");
            response.setStatus(HttpStatus.UNAUTHORIZED.value());// 401
            return false;
        } else {
            LOG.info("Successfully logged in: {}", s);
            return true;
        }
    }
}
