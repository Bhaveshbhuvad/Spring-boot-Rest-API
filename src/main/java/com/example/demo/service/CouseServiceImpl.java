package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

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

}
