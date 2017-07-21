package com.cr.ssm.entity;

import java.util.Date;

public class Student {
	private Integer id;
	private String name;
	private String password;
	private String age;
	private String gender;
	private String address;
	private Date birthday;
	private Clazz clazz;
	
	
	
	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Student(int id, String name, String password, String age,
			String gender, String address, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.birthday = birthday;
	}

	public Student(String name, String password, String age, String gender,
			String address, Date birthday) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.birthday = birthday;
	}

	public Student() {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password="
				+ password + ", age=" + age + ", gender=" + gender
				+ ", address=" + address + ", birthday=" + birthday + "]";
	}
	
	
	

}
