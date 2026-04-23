package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Alien;
import com.telusko.service.IGreeting;

@RestController
//@Scope("prototype")
//@Scope("request")
//@Scope("session")
public class GreetingController
{

	@Autowired
	private IGreeting greet;
	
	public GreetingController()
	{
		System.out.println("GreetingController Bean created");
	}

	@GetMapping("/wish/{name}")
	public String getGreetings(@PathVariable("name")String name)
	{
		String wish=greet.generateGreetings(name);//Mockito, PowerMock ......
		return wish;
	}
	
	@GetMapping("/wish2")
	public ResponseEntity<String> getGreetings2(String name)
	{
		String wish=greet.generateGreetings(name);
		return new ResponseEntity<String>(wish, HttpStatus.OK);
	}
	
//	@GetMapping("/get-alien")
//	public ResponseEntity<Alien> getAlienInfo()
//	{
//		Alien alien=new Alien(1, "Saketh", "Mubai");
//		return new ResponseEntity<Alien>(alien, HttpStatus.OK);
//	}
	
	@GetMapping("/get-alien")
	public Alien getAlienInfo()
	{
		Alien alien=new Alien(1, "Saketh", "Mubai");
		return alien;
	}
	
	@PostMapping("/add-alien")
	public ResponseEntity<Alien> addAlienInfo(@RequestBody Alien alien)
	{
		System.out.println(alien);
		Boolean status=greet.addAlienInfo(alien);
		return new ResponseEntity<Alien>(alien, HttpStatus.CREATED);
	}
	// log4j , Junit5 // CRM app  //revision core java SpringBoot 
	//================================
	
	
}
