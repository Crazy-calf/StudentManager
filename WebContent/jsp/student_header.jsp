<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<div align="center">
	<h2 style="display:inline">学生管理系统</h2>
	<span class="span1">
		欢迎您：${student.name} 
		<a href="${pageContext.request.contextPath}/login/logout.action">注销</a>
	</span>
</div>