package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("first")
public class FirstController 
{
	@RequestMapping("/telusko1")
	public ModelAndView displayInfo()
	{
		ModelAndView mav=new ModelAndView();	
		mav.addObject("message", "This is my First Web App of SpringBoot Journey 1 and tomorrow there is no class\r\n"
				+ "");
		mav.setViewName("index");
		
		return mav;
	}
	
	@PostMapping("/course-info")
	public ModelAndView displayInfo2()
	{
		ModelAndView mav=new ModelAndView();	
		mav.addObject("message", "for new courses visit learn.telusko.com");
		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/course-info")
	public ModelAndView displayInfo24()
	{
		ModelAndView mav=new ModelAndView();	
		mav.addObject("message", "for new courses visit learn.telusko.com");
		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/telusko3")
	public String displayInfo3(Model model)
	{
	
		System.out.println("Implementing class of model "+model.getClass().getName());
		model.addAttribute("message", "IPL Match KKR vs LSG");
		
		return "index";
	}
	
	@GetMapping("/telusko4")
	public String displayInfo4(Map map)
	{
		
		map.put("message", "This is leanring during IPL match");
		
		return "index";
	}
	
	//GET POST PUT DELETE PATCH
	// GetMapping PostMapping PatchMapping PutMapping DeleteMapping
}
