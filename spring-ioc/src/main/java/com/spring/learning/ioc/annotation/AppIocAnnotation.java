package com.spring.learning.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * AppIocAnnotation
 *
 */
@Configuration
@ComponentScan
public class AppIocAnnotation
{
    public static void main( String[] args )
    {
        // 创建Spring容器
        ApplicationContext context = new AnnotationConfigApplicationContext(AppIocAnnotation.class);
        // 获取Bean
        MemberService memberService = context.getBean(MemberService.class);

        String memberInfo = memberService.getMemberInfo(1);
        System.out.println(memberInfo);
    }
}
