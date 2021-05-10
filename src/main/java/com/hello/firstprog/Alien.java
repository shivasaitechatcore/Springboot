package com.hello.firstprog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	@Autowired
	Laptop lap;
	
	public void sys(){
//		System.out.println("im a coding");
		lap.compile();
	}

}
