package com.cr.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.cr.ssm.entity.Student;
import com.cr.ssm.service.IStudentService;
import com.cr.vo.LoginBean;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	@Resource(name="studentService")
	IStudentService studentService;
	
	@RequestMapping(value ="/login")
	public String login(LoginBean loginBean, Model model,HttpServletRequest request, HttpServletResponse response) {
		String checkCode = loginBean.getCheckCode();
		System.out.println(checkCode);
		
		String checkCodeSession = (String) request.getSession().getAttribute("checkCodeSession");
		System.out.println(checkCodeSession);
		if(checkCode == null && checkCode.equals("")){
			return "redirect:/jsp/login.jsp";
		}
		if(!checkCode.equalsIgnoreCase(checkCodeSession)){
			return "redirect:/jsp/login.jsp";
		}
		
		Map<String, String> map = new HashMap<String, String>();
	    map.put("name", loginBean.getName());
	    map.put("password", loginBean.getPassword());
	    System.out.println(map);
	    
		Student student = studentService.findByNameAndPassword(map);
		
		if(student != null) {
			HttpSession session = request.getSession(false);
			session.setAttribute("student", student);
			
			//用户登录后添加到在线列表集合
			List<Student> onlineStudentList = (List<Student>) request.getServletContext().getAttribute("onlineStudentList");
			onlineStudentList.add(student);
			return "redirect:/student/pageList.action";
		} else {
			//System.out.println("错球");
			//登陆失败
			return "redirect:/jsp/login.jsp";
		}
		
	}
	
	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession(false);
		if (session!= null){
			Student student = (Student) session.getAttribute("student");
			session.removeAttribute("student");
			
			List<Student> onlineStudentList = (List<Student>) request.getServletContext().getAttribute("onlineStudentList");
			onlineStudentList.remove(student);
			session.invalidate();
		}
		
		return "redirect:/jsp/login.jsp";
	}
	

}
