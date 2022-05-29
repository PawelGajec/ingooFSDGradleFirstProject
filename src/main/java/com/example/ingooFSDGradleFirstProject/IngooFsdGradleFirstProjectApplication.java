package com.example.ingooFSDGradleFirstProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class IngooFsdGradleFirstProjectApplication  implements CommandLineRunner {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(IngooFsdGradleFirstProjectApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		MyChildService myChildService = (MyChildService) applicationContext.getBean("myChildService1");
		myChildService.sayHello();
		MyChildService myChildService2 = (MyChildService) applicationContext.getBean("myChildService2");
		myChildService2.sayHello();


	}
}


