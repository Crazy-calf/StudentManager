package com.cr.ssm.dao;

import java.util.List;
import java.util.Map;

import com.cr.ssm.entity.Student;
import com.cr.vo.SearchByStudentCondition;

public interface StudentDao {
	/**
	 * 添加学生
	 * @param student
	 * @return true:添加成功;false:添加失败。
	 */
	public int add(Student student );
	
	/**
	 * 根据id删除学生
	 * @param id
	 * @return true:删除成功;false:删除失败。
	 */
	public int delete(String id);
	
	/**
	 * 修改学生
	 * @param student
	 * @return true:修改成功;false:修改失败。
	 */
	public int update(Student student);
	
	/**
	 * 根据id查找学生
	 * @param id
	 * @return Student
	 */
	public Student findById(String id);
	
	/**
	 * 分页查找学生
	 * @param pageindex
	 * @param pageSize
	 * @return Student
	 */
	public List<Student> findPageBean(Map<String, Integer> map);

	/**.
	 * 查找学生总人数
	 * @return
	 */
	public Integer getTotalCount();

	public int getSearchTotalCount(SearchByStudentCondition searchByStudentCondition);

	public List<Student> searchByCondition(
			SearchByStudentCondition searchByStudentCondition);

	public Student findByNameAndPassword(Map<String, String> map);
	
	
	//select * from student where name=? and password=?
}
