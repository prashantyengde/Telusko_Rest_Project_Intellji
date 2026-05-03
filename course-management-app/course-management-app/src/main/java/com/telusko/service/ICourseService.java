package com.telusko.service;

import java.util.List;

import com.telusko.entity.Course;

public interface ICourseService 
{
	public List<Course> getAllCourses();
	public void registerCourse(Course course);
	public void deleteCourse(Integer id);

}
