package com.spring.learning.ioc.annotation;

import com.spring.learning.ioc.annotation.pojo.User;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean(name = {"user"})
    //@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public User getUser()
    {
        User user = new User();
        user.setId(1);
        user.setName("Curry");
        return user;
    }
}
