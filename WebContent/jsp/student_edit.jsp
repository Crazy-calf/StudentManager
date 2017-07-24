<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="../lib/bootstrap/css/bootstrap.css"/>
<script src="../lib/jquery/jquery-1.11.1.js" ></script>
<link rel="stylesheet" type="text/css" href="../lib/bootstrap/css/bootstrap-theme.min.css"/>
<script type="text/javascript" src="../lib/bootstrap/js/bootstrap.js"></script>
<title>Insert title here</title>
</head>
<body>

	<%@include file = "student_header.jsp" %>
	<form class="form-inline form-horizontal" action="${pageContext.request.contextPath}/student/update.action" method="post">
		<input type="hidden" name="id" value="${student.id }">
		<label class="control-label">姓名：</label><input class="form-control" type="text" name="name" value="${student.name }"/><br/>
		<label class="control-label">密码：</label><input class="form-control" type="text" name="password" value="${student.password }"/><br/>
		<label class="control-label">年龄：</label><input class="form-control" type="text" name="age" value="${student.age }"/><br/>
		
		<label class="control-label">性别：</label><input class="form-control" type="text" name="gender" value="${student.gender }"/><br/>
		<label class="control-label">籍贯：</label><input class="form-control" type="text" name="address" value="${student.address }"/><br/>
		
		<label class="control-label">生日：</label><input class="form-control" type="text" name="birthday" value="${student.birthday }"/><br/>
		<p><button type="submit" class="btn btn-primary">保存</button></p>
	</form>
	<%@include file="student_footer.jsp" %>
</body>
</html>