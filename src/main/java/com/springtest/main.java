package com.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.springframework.util.Assert.isTrue;

public class main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        ServiceManagerspoof managerspoof = context.getBean(ServiceManagerspoof.class);
        SingletonBean singletonBean = managerspoof.accesssingleton();
        singletonBean.getPrototypeBean();
//        SingletonBean firstSingleton = context.getBean(SingletonBean.class);
//        PrototypeBean firstPrototype = firstSingleton.getPrototypeBean();
        System.out.println("created first");

        SingletonBean singletonBean1 = managerspoof.accesssingleton();
        singletonBean1.getPrototypeBean();
        // get singleton bean instance one more time
//        SingletonBean secondSingleton = context.getBean(SingletonBean.class);
//        PrototypeBean secondPrototype = secondSingleton.getPrototypeBean();
        System.out.println("created second");

    }
}
