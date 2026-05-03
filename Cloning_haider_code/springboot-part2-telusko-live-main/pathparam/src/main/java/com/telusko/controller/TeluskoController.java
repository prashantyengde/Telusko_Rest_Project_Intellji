package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TeluskoController
{
	//http://localhost:8484/telusko/info2/Shiva
	@GetMapping("/info1/{name}")
	public String getData(@PathVariable("name")String name, Model model)
	{
		model.addAttribute("name", name);
		return "index";
	}
	
	//http://localhost:8484/telusko/info2/Madhu/SpringAI
		@GetMapping("/info2/{name}/{course}")
		public String getData2(@PathVariable("name")String name,
				@PathVariable("course")String course,Model model)
		{
			model.addAttribute("name", "Hello "+name+ " I hope youre learning " + course+ " happily");
	
			return "index";
		}

}
