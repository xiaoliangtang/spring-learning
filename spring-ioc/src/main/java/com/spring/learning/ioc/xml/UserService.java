package com.spring.learning.ioc.xml;

public class UserService {

    public String getUserInfo(Integer userId) {
        return "userInfo:" + userId;
    }

    public Boolean login(Integer userId) {
        return userId > 0;
    }
}
