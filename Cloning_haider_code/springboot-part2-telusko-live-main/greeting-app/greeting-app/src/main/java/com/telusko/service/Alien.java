package com.telusko.service;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Alien
{
	static 
	{
		System.out.println("Static init block");
	}
	
	{
		System.out.println("Java init block");
	}
	
	public Alien()
	{
		System.out.println("Alien bean created (constructor)");
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("init method post bean construct");
	}
	
	public static void disp()
	{
		System.out.println("static method of alien");
	}
	public void show()
	{
		System.out.println("show method of alien(instance");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Before bean destroyed");
	}
}
