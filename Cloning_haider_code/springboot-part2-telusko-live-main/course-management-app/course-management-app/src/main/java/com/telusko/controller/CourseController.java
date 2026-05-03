package com.telusko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.entity.Course;
import com.telusko.service.ICourseService;

@Controller
public class CourseController 
{

	private ICourseService service;

	@Autowired
	public void setService(ICourseService service)
	{
		this.service = service;
	}
	
	//==List Courses ==
	@GetMapping("/courselist")
	public String getAllCourses(Model model)
	{
		List<Course> courses = service.getAllCourses();
		model.addAttribute("courses", courses);
		courses.forEach(c->System.out.println(c));
		
		return "courselist";
	}
	
	//===show Form ==
	@GetMapping("/showCourseForm")
	public String showForm(@ModelAttribute("course") Course course)
	{
		return "courseform";
	}
	
	//== update form ==
	@GetMapping("/updateCourseForm")
	public String updateForm(@ModelAttribute("course") Course course)
	{
		return "courseform";
	}
	
	// == register course ==
	@PostMapping("/registerCourse")
	public String registerCourse(@ModelAttribute("course")Course course)
	{
		service.registerCourse(course);
		return "redirect:/courselist";
	}
	
	@GetMapping("/deleteCourse")
	public String deleteCourseById(@RequestParam("id") Integer id)
	{
		service.deleteCourse(id);
		return "redirect:/courselist";
	}
	
	
	
	
	
	
}
