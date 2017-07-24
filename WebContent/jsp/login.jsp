<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../lib/bootstrap/css/bootstrap.css"/>
<script src="../lib/jquery/jquery-1.11.1.js" ></script>
<link rel="stylesheet" type="text/css" href="../lib/bootstrap/css/bootstrap-theme.min.css"/>
<script type="text/javascript" src="../lib/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript">
	function refreshCode(){
		document.getElementById("codeImage").src="${pageContext.request.contextPath}/checkImg?" + Math.random();
	}
</script>
</head>
<body>
	<form class="form-inline form-horizontal" action="${pageContext.request.contextPath }/login/login.action" method="post">
		用户名：<input class="form-control" type="text" name="name"><br>
		密码：<input class="form-control" type="password" name="password"><br>
		验证码：<input class="form-control" type="text" name="checkCode"><img id="codeImage" src="${pageContext.request.contextPath }/checkImg" onclick="refreshCode();"><br>
		<p><button type="submit" class="btn btn-primary">提交</button></p>
	</form>
</body>
</html>