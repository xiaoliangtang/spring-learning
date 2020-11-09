package com.spring.learning.aop.annotation;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    @LogAnnotation("hello")
    public void getUserInfo(Integer userId) {
        System.out.println("userInfo:" + userId);
    }
}
