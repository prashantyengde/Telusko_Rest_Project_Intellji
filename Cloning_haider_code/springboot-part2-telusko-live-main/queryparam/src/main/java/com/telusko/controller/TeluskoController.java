package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TeluskoController
{
	
	//http://localhost:8484/telusko/info1?name=appu
	@GetMapping("/info1")
	public String getData(@RequestParam("name")String name, Model model)
	{
		model.addAttribute("name", name);
		return "index";
	}
	
	//http://localhost:8484/telusko/info2?name=appu&course=ai
		@GetMapping("/info2")
		public String getData2(@RequestParam("name")String name,@RequestParam("course")String course
				,Model model)
		{
			model.addAttribute("name", "Hello "+name+ " I hope youre learning " + course+ " happily");
	
			return "index";
		}

}
