package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.service.Alien;

@SpringBootApplication
public class GreetingAppApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext container =
				SpringApplication.run(GreetingAppApplication.class, args);
//		
//		IGreeting greet = container.getBean(IGreeting.class);
//		
//		System.out.println(greet.generateGreetings("Kapil"));
		
		Alien alien = container.getBean(Alien.class);
		
		Alien.disp();
		alien.show();
		
	}

}
