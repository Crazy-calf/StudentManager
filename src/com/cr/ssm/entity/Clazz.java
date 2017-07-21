package com.cr.ssm.entity;

import java.util.List;

public class Clazz {
	private int id;
	private String name;
	
	private List<Student> studentList;
	private List<Course> coursesList;
	
	
	
	public List<Student> getStudentList() {
		return studentList;
	}


	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}


	public List<Course> getCoursesList() {
		return coursesList;
	}


	public void setCoursesList(List<Course> coursesList) {
		this.coursesList = coursesList;
	}


	public Clazz(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	public Clazz(String name) {
		super();
		this.name = name;
	}


	public Clazz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Class [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
