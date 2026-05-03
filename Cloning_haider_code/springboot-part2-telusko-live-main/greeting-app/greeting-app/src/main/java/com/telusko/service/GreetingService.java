package com.telusko.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreeting
{
	@Autowired
	private LocalDateTime dateTime;

	@Override
	public String generateGreetings(String name)
	{
		
		int hour=dateTime.getHour();
		if(hour<12)
			return "Good Morning "+ name;
		else if(hour<16)
			return "Good Afternoon "+name;
		else if(hour <20)
			return "Good Evening "+name;
		else
			return "Good Night "+name;
	}

}
