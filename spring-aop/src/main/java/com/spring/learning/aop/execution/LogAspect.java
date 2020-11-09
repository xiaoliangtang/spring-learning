package com.spring.learning.aop.execution;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @After("execution(public * com.spring.learning.aop.execution.UserService.*(..))")
    public void log() {
        System.out.println("log is start.");
    }
}
