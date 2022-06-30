package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);

	public Course updateCourse(Course course, Long courseId);

	public Course deleteCourse(Long courseId);
	
}
