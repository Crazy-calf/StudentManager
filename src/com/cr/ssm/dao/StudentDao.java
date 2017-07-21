package com.cr.ssm.dao;

import com.cr.ssm.entity.Student;

public interface StudentDao {
	/**
	 * 添加学生
	 * @param student
	 * @return true:添加成功;false:添加失败。
	 */
	public boolean add(Student student );
	
	/**
	 * 根据id删除学生
	 * @param id
	 * @return true:删除成功;false:删除失败。
	 */
	public boolean delete(Integer id);
	
	/**
	 * 修改学生
	 * @param student
	 * @return true:修改成功;false:修改失败。
	 */
	public boolean update(Student student);
	
	/**
	 * 根据id查找学生
	 * @param id
	 * @return Student
	 */
	public Student findById(Integer id);
}
