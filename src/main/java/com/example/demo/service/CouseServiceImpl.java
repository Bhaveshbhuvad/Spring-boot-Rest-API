package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;

@Service
public class CouseServiceImpl implements CourseService{
	
	List<Course> list;
	
	public CouseServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new Course(145,"java Core Course","This course contain basic knowledge of java"));
		list.add(new Course(4343,"Spring Boot Course","This course contain basic knowledge of Spring Boot"));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {

		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId) 
			{
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course, Long courseId) {
		list=list.stream().map(b->{
			if(b.getId()==courseId)
			{
				b.setTitle(course.getTitle());
				b.setDescrription(course.getDescrription());
			}
			return b;
		}).collect(Collectors.toList());
		return null;
	}

	@Override
	public Course deleteCourse(Long courseId) {
		list=list.stream().filter(course ->course.getId()!=courseId).collect(Collectors.toList());
		return null;
		
	}

	
	

}
