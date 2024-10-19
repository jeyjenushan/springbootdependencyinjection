package com.jenushan.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoappApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext= SpringApplication.run(DemoappApplication.class, args);
		dev obj=applicationContext.getBean(dev.class);
		obj.build();
	}

}
