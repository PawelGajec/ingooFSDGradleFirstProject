package com.example.ingooFSDGradleFirstProject;

import inqooPackage.MyClass3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    MyClass1 myClass1(){
        return new MyClass1();
    }

    @Bean
    MyClass3 myClass3(){
        return new MyClass3();
    }


}
