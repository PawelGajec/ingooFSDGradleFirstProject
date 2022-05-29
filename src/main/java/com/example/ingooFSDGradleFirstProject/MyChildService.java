package com.example.ingooFSDGradleFirstProject;

public class MyChildService {
    String name;
    public MyChildService(String name) {
        this.name = name;
    }

    public void sayHello (){
        System.out.println(name);
    }
}
