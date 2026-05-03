package com.telusko.main;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.telusko.model.Alien;

public class LaunchMainApp 
{
	public static void main(String[] args) throws JsonProcessingException
	{
		Alien alien1=new Alien(1, "Rohan","Bengaluru");
		Alien alien2=new Alien(2, "Rohit","Bengaluru");

		Alien alien3=new Alien(4, "Ramesh","Chennai");

		
		List<Alien> aliens=Arrays.asList(alien1, alien2,alien3);
		ObjectMapper mapper =new ObjectMapper();
		//String json=mapper.writeValueAsString(alien1);
		
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(aliens);
		System.out.println(json);
		
		
	}

}
