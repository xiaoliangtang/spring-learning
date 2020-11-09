package com.spring.learning.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Around("@annotation(logAnnotation)")
    public void log(ProceedingJoinPoint joinPoint, LogAnnotation logAnnotation) throws Throwable {
        System.out.println("log2 is start.");
        joinPoint.proceed();
        System.out.println("log2 is end.");
    }

//    @Before("@annotation(com.spring.learning.aop.annotation.LogAnnotation)")
//    public void log(JoinPoint joinPoint) {
//        System.out.println("log2 is start.Class is " + joinPoint.getTarget().getClass());
//    }
}
