package com.spring.learning.aop.execution;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    public void getUserInfo(Integer userId) {
        System.out.println("userInfo:" + userId);
    }
}
