package com.telusko.main;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telusko.model.Alien;

public class LaunchMainApp 
{
	public static void main(String[] args) throws IOException
	{
		
		ObjectMapper mapper =new ObjectMapper();
		
		Alien alien=mapper.readValue(new File("json/sample.json"), Alien.class);
		System.out.println(alien);
		
		
	}

}
