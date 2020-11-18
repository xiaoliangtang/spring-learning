package com.spring.learning.ioc.annotation;

import com.spring.learning.ioc.annotation.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AppIocAnnotation
 *
 */
public class AppIocAnnotation
{
    public static void main( String[] args )
    {
        // 创建Spring容器
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // 获取Bean
        MemberService memberService = context.getBean(MemberService.class);
        //User user = (User) context.getBean("user");// 通过bean名称获取bean
        User user = context.getBean(User.class);
        User user2 = (User) context.getBean("user");

        String memberInfo = memberService.getMemberInfo(1);
        System.out.println(memberInfo);
        System.out.println("userId:" + user.getId() + ";userName:" + user.getName());
        System.out.println("is same bean:" + (user == user2));
    }
}
