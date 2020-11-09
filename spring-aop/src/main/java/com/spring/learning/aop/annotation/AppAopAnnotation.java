package com.spring.learning.aop.annotation;

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
public class AppAopAnnotation
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppAopAnnotation.class);
        UserService userService = context.getBean(UserService.class);

        userService.getUserInfo(1);
    }
}
