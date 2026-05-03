package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeluskoController
{
	@GetMapping("/home")
	public String showHome()
	{	
		return "home";
	}
	
	@GetMapping("/response")
	public String showCourses(Model model)
	{	
		String books[]=new String[] {"Java", "DevOps","AWS", "AI Engineering"};
		model.addAttribute("books", books);
//		for(String booksName:books)
//		{
//			System.out.println(booksName);
//		}
		return "response";
	}

}
