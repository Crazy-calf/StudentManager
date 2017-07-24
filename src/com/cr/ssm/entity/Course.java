package com.cr.ssm.entity;

public class Course {
	private Integer id;
	private String name;
	private Integer credit;
	
	private Clazz clazz;
	
	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	public Course(int id, String name, int credit) {
		super();
		this.id = id;
		this.name = name;
		this.credit = credit;
	}

	public Course(String name, int credit) {
		super();
		this.name = name;
		this.credit = credit;
	}

	public Course() {
		super();
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

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", credit=" + credit
				+ "]";
	}
	
	
	
}
