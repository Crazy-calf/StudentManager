package com.cr.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cr.ssm.entity.Student;
import com.cr.ssm.service.IStudentService;
import com.cr.vo.PageBean;
import com.cr.vo.SearchByStudentCondition;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

	@Resource(name = "studentService")
	private IStudentService studentService;
	
	@RequestMapping(value = "/pageList")
	public String pageList(PageBean<Student> pageBean, Model model) {
		if (pageBean.getPageIndex() == null
				|| pageBean.getPageIndex().equals("")) {
			pageBean.setPageIndex(1);
		}
		
		if (pageBean.getPageSize() == null || pageBean.getPageSize().equals("")) {
			pageBean.setPageSize(3);
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
	    map.put("pageIndex", pageBean.getPageIndex()-1);
	    map.put("pageSize", pageBean.getPageSize());
	    pageBean = studentService.findPageBean(map);
	    List<Student> stuList = pageBean.getList();
		System.out.println(pageBean);

		model.addAttribute("pageBean", pageBean);
		// 3.返回结果
		return "forward:/jsp/student_list.jsp";
	}
	
	@RequestMapping(value = "/add")
	public String add(Student student) {
		System.out.println(student);
		int i = studentService.add(student);
		return "redirect:pageList.action";
	}

	@RequestMapping(value = "/delete")
	public String delete(String id){
		int i = studentService.delete(id);
		return "redirect:pageList.action";
	}
	
	@RequestMapping(value = "/toUpdate")
	public String toUpdete(String id, Model model){
		Student student = studentService.findById(id);
		System.out.println(student);
		model.addAttribute("student", student);
		return "forward:/jsp/student_edit.jsp";
	}
	
	@RequestMapping(value="/update")
	public String update(Student student){
		int i = studentService.update(student);
		return "redirect:pageList.action";
		
	}
	
	@RequestMapping(value = "/searchByCondition")
	public String searchByCondition(PageBean<Student> pageBean,
			SearchByStudentCondition searchByStudentCondition, Model model) {
		if (pageBean.getPageIndex() == null
				|| pageBean.getPageIndex().equals("")) {
			pageBean.setPageIndex(1);
		} else {
			pageBean.setPageIndex(pageBean.getPageIndex());
		}
		// 获取pageSize，页面显示数量
		if (pageBean.getPageSize() == null || pageBean.getPageSize().equals("")) {
			pageBean.setPageSize(3);
		}
		if(searchByStudentCondition.getName().equals("请输入学生姓名")){
			searchByStudentCondition.setName("");
		}
		if (searchByStudentCondition.getAge().equals("请输入学生年龄")) {
			searchByStudentCondition.setAge("");;
		}
		
		SearchByStudentCondition searchByStudentCondition1 = new SearchByStudentCondition(
				searchByStudentCondition.getName(), searchByStudentCondition.getAge(), searchByStudentCondition.getGender(),
				searchByStudentCondition.getAddress(), pageBean.getPageIndex(),
				pageBean.getPageSize());
		//System.out.println(searchByStudentCondition.toString());

		pageBean = studentService.getSearchByCondition(searchByStudentCondition1);
		//System.out.println(pageBean);
		model.addAttribute("pageBean", pageBean);
		//model.addAttribute("student", student);
		// 3.返回结果
		return "forward:/jsp/student_list.jsp";
	}

	@RequestMapping(value="/onlineList")
	public String onlineList(){
		return "forward:/jsp/student_online_list.jsp";
	}

}
