package com.example.demo.entities;

public class Course {

	private long id;
	private String title;
	private String descrription;
	
	public Course(long id, String title, String descrription) {
		super();
		this.id = id;
		this.title = title;
		this.descrription = descrription;
	}
	
	

	public Course() {
		super();
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescrription() {
		return descrription;
	}

	public void setDescrription(String descrription) {
		this.descrription = descrription;
	}



	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", descrription=" + descrription + "]";
	}
	
	
	
}
