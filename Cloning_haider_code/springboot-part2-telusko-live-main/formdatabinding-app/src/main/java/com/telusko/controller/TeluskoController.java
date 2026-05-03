package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.telusko.model.Cricketer;

@Controller
public class TeluskoController
{
	@GetMapping("/register")
	public String register(@ModelAttribute("cricketer") Cricketer cricketer)
	{
		return "register";
	}
	
//	@PostMapping("/register")
//	public String register(Map<String, Object> map, HttpServletRequest request)
//	{
//		String id=request.getParameter("id");
//		request.getParameter("name");
//		request.getParameter("city");
//
//		return "response";
//	}
	
	@PostMapping("/register")
	public String register(Map<String, Object> map,@ModelAttribute("cricketer") Cricketer cricketer)
	{
		System.out.println(cricketer);
	
		map.put("cricketer", cricketer);
		return "response";
	}
}
