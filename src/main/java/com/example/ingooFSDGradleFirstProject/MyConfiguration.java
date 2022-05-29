package com.example.ingooFSDGradleFirstProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public MyChildService myChildService1 (){
        return new MyChildService("Say Hello 1 ");
    }

    @Bean
    public MyChildService myChildService2 (){
        return new MyChildService("Say Hello 2");
    }

}
