package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Alien;
import com.telusko.service.IGreeting;

//@Controller + @ResponseBody ==> @RestController
@RestController
public class GreetingController
{

	@Autowired
	private IGreeting greet;
	
//	@GetMapping("/wish/{name}")
//	@ResponseBody
//	public String getGreetings(@PathVariable("name")String name)
//	{
//		String wish=greet.generateGreetings(name);
//		return wish;
//	}
	
	@GetMapping("/wish/{name}")
	public String getGreetings(@PathVariable("name")String name)
	{
		String wish=greet.generateGreetings(name);//Mockito, PowerMock ......
		return wish;
	}
	
	@GetMapping("/wish2/{name}")
	public ResponseEntity<String> getGreetings2(@PathVariable("name")String name)
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
	public String addAlienInfo(@RequestBody Alien alien)
	{
		System.out.println(alien);
		return "Alien Object added";
	}
	// log4j , Junit5 // CRM app  //revision core java SpringBoot 
	//================================
	
	
}
