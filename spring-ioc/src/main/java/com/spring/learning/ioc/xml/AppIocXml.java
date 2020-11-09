package com.spring.learning.ioc.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * AppIocXml
 *
 */
public class AppIocXml
{
    public static void main( String[] args )
    {
        // 创建Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // 获取bean
        UserService userService = applicationContext.getBean(UserService.class);
        String userInfo = userService.getUserInfo(1);
        System.out.println(userInfo);

        // 创建Spring容器
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        // 获取bean
        UserService userService02 = beanFactory.getBean(UserService.class);
        String userInfo02 = userService02.getUserInfo(10);
        System.out.println(userInfo02);

    }
}
