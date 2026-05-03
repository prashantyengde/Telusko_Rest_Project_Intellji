package com.telusko.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telusko.entity.Course;

@Repository
public interface ICourseRepo extends CrudRepository<Course, Integer> 
{

}
