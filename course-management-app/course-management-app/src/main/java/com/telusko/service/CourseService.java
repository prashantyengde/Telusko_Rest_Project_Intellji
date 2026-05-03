package com.telusko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.entity.Course;
import com.telusko.repo.ICourseRepo;

@Service
public class CourseService implements ICourseService
{
	private ICourseRepo repo;
	
	@Autowired
	public void setRepo(ICourseRepo repo) 
	{
		this.repo = repo;
	}

	@Override
	public List<Course> getAllCourses()
	{
		return (List<Course>) repo.findAll();
	}

	@Override
	public void registerCourse(Course course)
	{
		repo.save(course);
	}

	@Override
	public void deleteCourse(Integer id) 
	{
		repo.deleteById(id);
	}

}
