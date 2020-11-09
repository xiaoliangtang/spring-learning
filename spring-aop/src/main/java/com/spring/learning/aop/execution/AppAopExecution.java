package com.spring.learning.aop.execution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * AppAopExecution!
 *
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AppAopExecution
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppAopExecution.class);
        UserService userService = context.getBean(UserService.class);

        userService.getUserInfo(1);
    }
}
