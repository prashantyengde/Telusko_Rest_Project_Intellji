package com.telusko.hateoasappdemo.controller;

import com.telusko.hateoasappdemo.model.Course;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController
{
    @GetMapping("/course")
    public ResponseEntity<Course> getCourseInfo()
    {
        Course course = new Course(1, "Java", "Telusko", 1000);
//        Link link=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CourseController.class).getAiInfo())
//                .withRel("get-java");

        Link link= WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CourseController.class).getMoreInfo())
        .withRel("get-more-info");
        course.add(link);
        return new ResponseEntity<Course>(course, HttpStatus.OK);
      //  return RequestEntity.ok(course);
    }
    @GetMapping("/get-java")
    public ResponseEntity<List> getAiInfo()
    {
        List<Course> courses= List.of(new Course(3, "DevOps", "Telusko", 1000), new Course(2, "AI Engineering", "Telusko", 10000));
        return new ResponseEntity<List>(courses, HttpStatus.OK);
    }

    @GetMapping("/get-more-info")
    public ResponseEntity<List> getMoreInfo()
    {
        List<Course> courses= List.of(new Course(5, "System design", "Telusko", 1000), new Course(6, "AI Engineering", "Telusko", 10000));
        return new ResponseEntity<List>(courses, HttpStatus.OK);
    }
}
