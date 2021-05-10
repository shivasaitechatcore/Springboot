package com.hello.firstprog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstprogApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(FirstprogApplication.class, args);
		
		Alien obj = context.getBean(Alien.class);
		
		obj.sys();
	}

}
