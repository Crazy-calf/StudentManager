package com.cr.vo;

public class SearchByStudentCondition {
	private String name;
	private String age;
	private String gender;
	private String address;
//	private Integer class_idInteger;
	
	
	private Integer pageIndex;
	//当前页显示条数
	private Integer pageSize;//让搜索支持分页
	
	
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
//	public Integer getClass_idInteger() {
//		return class_idInteger;
//	}
//	public void setClass_idInteger(Integer class_idInteger) {
//		this.class_idInteger = class_idInteger;
//	}
	public SearchByStudentCondition() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SearchByStudentCondition(String name, String age, String gender,
			String address, Integer pageIndex, Integer pageSize) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
	}
	@Override
	public String toString() {
		return "SearchByStudentCondition [name=" + name + ", age=" + age
				+ ", gender=" + gender + ", address=" + address
				+ ", pageIndex=" + pageIndex + ", pageSize=" + pageSize + "]";
	}
	
	
	
	
}
