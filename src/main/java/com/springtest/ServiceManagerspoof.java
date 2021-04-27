package com.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServiceManagerspoof {
    public SingletonBean accesssingleton(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class,AppConfig.class);
        SingletonBean singletonBean = context.getBean(SingletonBean.class);
        return singletonBean;

    }
}
