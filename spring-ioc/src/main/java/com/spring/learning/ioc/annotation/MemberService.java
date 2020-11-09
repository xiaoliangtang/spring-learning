package com.spring.learning.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberLoginService memberLoginService;

    public String getMemberInfo(Integer userId) {
        return "isLogin:" + memberLoginService.isLogin(userId) + ";memberInfo:" + userId;
    }

    public Boolean login(Integer userId) {
        return userId > 0;
    }
}
