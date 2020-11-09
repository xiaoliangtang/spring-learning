package com.spring.learning.ioc.annotation;

import org.springframework.stereotype.Service;

@Service
public class MemberLoginService {

    public Boolean isLogin(Integer userId) {
        return userId > 0;
    }
}
