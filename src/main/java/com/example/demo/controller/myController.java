package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.service.CourseService;


@RestController
public class myController {
	
	@Autowired
	public CourseService courseService;
	
	@GetMapping("/home")
	public String home()
	{
		return "this is my home page";
	}

	//get all courses
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		System.out.println(courseService.getCourses());
		return this.courseService.getCourses();
	}
}
