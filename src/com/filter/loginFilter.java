package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cr.ssm.entity.Student;

/**
 * Servlet Filter implementation class loginFilter
 */
@WebFilter("/*")
public class loginFilter implements Filter {


	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String uri = req.getRequestURI();
		// /Java1705Web/login.jsp   /Java1705Web/loginFilter
		System.out.println(uri);
		String requestPath = uri.substring(uri.lastIndexOf("/") + 1, uri.length());
		if (requestPath.equals("login.jsp") || requestPath.equals("login.action")
				|| requestPath.equals("checkImg")) {
			//System.out.println("___________________________________");
			//直接放行
			chain.doFilter(request, response);
		} else {
			//都是需要登陆验证
			// 1.得到Session对象
			HttpSession session = req.getSession(false);
			if (session == null) {
				resp.sendRedirect(req.getContextPath() + "/jsp/login.jsp");
				return;
			}
			// 2.得到会话数据
			Student student =  (Student) session.getAttribute("student");
			if (student == null) {
				resp.sendRedirect(req.getContextPath() + "/jsp/login.jsp");
				return;
			}
			//验证成功，放行
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
		
	}

}
