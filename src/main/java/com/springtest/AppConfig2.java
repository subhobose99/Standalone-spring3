package com.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {

    @Bean
    public SingletonBean singletonBean() {
        return new SingletonBean();
    }
}
