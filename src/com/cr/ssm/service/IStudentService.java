package com.cr.ssm.service;

import java.util.Map;

import com.cr.ssm.entity.Student;
import com.cr.vo.PageBean;
import com.cr.vo.SearchByStudentCondition;

public interface IStudentService {

	public int add(Student student );
	
	public int delete(String id);
	
	public int update(Student student);
	
	public Student findById(String id);
	
	public abstract PageBean<Student> findPageBean(Map<String, Integer> map);

	public PageBean<Student> getSearchByCondition(
			SearchByStudentCondition searchByStudentCondition);

	public Student findByNameAndPassword(Map<String, String> map);
}
