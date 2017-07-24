<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<head>
<link rel="stylesheet" type="text/css"
	href="../lib/bootstrap/css/bootstrap.css" />
<script src="../lib/jquery/jquery-1.11.1.js"></script>
<link rel="stylesheet" type="text/css"
	href="../lib/bootstrap/css/bootstrap-theme.min.css" />
<script type="text/javascript" src="../lib/bootstrap/js/bootstrap.js"></script>
</head>
<body>
	<%@include file = "student_header.jsp" %>
	<table class="table table-bordered"  >
		<tr>
			<td>ID</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>性别</td>
			<td>删除</td>
			<td>修改</td>
		</tr>
		
		<c:forEach items="${onlineStudentList}" var="student">
			<tr>
				<td><%-- <%=student.getId() %> --%> ${student.id }</td>
				<td>${student.name }</td>
				<td>${student.age }</td>
				<td>${student.gender }</td>
				<td><a href="javascript:void(0);" onclick="deleteStudent('${student.id}')">删除</a></td>
				<td><a href="${pageContext.request.contextPath}/student?method=toUpdate&id=${student.id}">修改</a></td>
			
			</tr>
		</c:forEach>
	</table>
	<%@include file="student_footer.jsp" %>
</body>
</html>