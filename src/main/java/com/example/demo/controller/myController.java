package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourses(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
	}
	
	 @PutMapping("/courses/{courseId}")
	 public Course updateCourse(@RequestBody Course course, @PathVariable Long courseId) 
	 {
	    return this.courseService.updateCourse(course, courseId);
	    
	  }
	
	  @DeleteMapping("/courses/{courseId}")
	  public Course deleteCourse(@PathVariable Long courseId) 
	  {
	    return this.courseService.deleteCourse(courseId);
	  } 
	
	
}
