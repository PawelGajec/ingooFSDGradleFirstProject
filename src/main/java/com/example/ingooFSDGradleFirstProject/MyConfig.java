package com.example.ingooFSDGradleFirstProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    MyClass1 myClass1(){
        return new MyClass1();
    }


}
