package com.cr.ssm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cr.ssm.dao.StudentDao;
import com.cr.ssm.entity.Student;
import com.cr.ssm.service.IStudentService;
import com.cr.vo.PageBean;
import com.cr.vo.SearchByStudentCondition;

@Service("studentService")
public class StudentServiceImpl implements IStudentService{

	@Resource(name="studentDao")
	StudentDao studentDao;
	
	@Override
	public PageBean<Student> findPageBean(Map<String, Integer> map) {
		PageBean pageBean = new PageBean();
		
		int totalCount = studentDao.getTotalCount();
		pageBean.setTotalCount(totalCount);
		int totalPage = (int) Math.ceil((double)totalCount / 3);
		pageBean.setTotalPage(totalPage);
		
		List<Student> list = studentDao.findPageBean(map);
		pageBean.setList(list);
		
		return pageBean;
	}

	@Override
	public int add(Student student) {
		return studentDao.add(student);
	}

	@Override
	public int delete(String id) {
		return studentDao.delete(id);
	}

	@Override
	public int update(Student student) {
		return studentDao.update(student);
	}

	@Override
	public Student findById(String id) {
		return studentDao.findById(id);
	}

	@Override
	public PageBean<Student> getSearchByCondition(
			SearchByStudentCondition searchByStudentCondition) {
		PageBean pageBean = new PageBean<>();
		
		pageBean.setPageIndex(searchByStudentCondition.getPageIndex());
		pageBean.setPageSize(searchByStudentCondition.getPageSize());
		
		int totalCount = studentDao.getSearchTotalCount(searchByStudentCondition);
		pageBean.setTotalCount(totalCount);
		pageBean.setTotalPage((int) Math.ceil((double)totalCount / 3));
		
		//System.out.println("service::" + searchByStudentCondition);
		searchByStudentCondition.setPageIndex((pageBean.getPageIndex()-1)*pageBean.getPageSize());
		pageBean.setList(studentDao.searchByCondition(searchByStudentCondition));
		
		List<Student> list = pageBean.getList();
//		for (Student student : list) {
//			System.out.println("student" + student);
//		}
		
		return pageBean;
	}

	@Override
	public Student findByNameAndPassword(Map<String, String> map) {
		return studentDao.findByNameAndPassword(map);
	}

	@Override
	public void deleteAll(int[] ids) {
		for (int id : ids) {
		studentDao.delete(String.valueOf(id));
	}
		
	}

}
