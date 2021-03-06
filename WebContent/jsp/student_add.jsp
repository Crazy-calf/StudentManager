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
	<div>
		<form action="${pageContext.request.contextPath}/student/add.action " method="post">
			姓名：<br>
			<input class="form-control" type="text" id="name" name="name"
					onblur="if(this.value==''){this.value='请输入学生姓名';this.style.color='#AAA9A9';}"
					onfocus="if(this.value=='请输入学生姓名'){this.value='';this.style.color='#555454'}"
					style="width: 145px; color: rgb(170, 169, 169);" value="请输入学生姓名">
			密码：<br>
			<input class="form-control" type="text" id="password" name="password"
					onblur="if(this.value==''){this.value='请输入学生密码';this.style.color='#AAA9A9';}"
					onfocus="if(this.value=='请输入学生密码'){this.value='';this.style.color='#555454'}"
					style="width: 145px; color: rgb(170, 169, 169);" value="请输入学生密码">
			年龄：<br>
			<input class="form-control" type="text" id="age" name="age"
					onblur="if(this.value==''){this.value='请输入学生年龄';this.style.color='#AAA9A9';}"
					onfocus="if(this.value=='请输入学生年龄'){this.value='';this.style.color='#555454'}"
					style="width: 145px; color: rgb(170, 169, 169);" value="请输入学生年龄">
			性别：<br>
			<select class="form-control" name="gender" id="gender" style="width: 150px">
						<option value="">--选择性别--</option>
						<option value="男">男</option>
						<option value="女">女</option>
				</select>
			地址：<select class="form-control" name="address" id="address"
					style="width: 150px;">
						<option value="">--选择省市--</option>
						<option value="北京市">北京市</option>
						<option value="天津市">天津市</option>
						<option value="河北省">河北省</option>
						<option value="山西省">山西省</option>
						<option value="内蒙古自治区">内蒙古自治区</option>
						<option value="辽宁省">辽宁省</option>
						<option value="吉林省">吉林省</option>
						<option value="黑龙江省">黑龙江省</option>
						<option value="上海市">上海市</option>
						<option value="江苏省">江苏省</option>
						<option value="浙江省">浙江省</option>
						<option value="安徽省">安徽省</option>
						<option value="福建省">福建省</option>
						<option value="江西省">江西省</option>
						<option value="山东省">山东省</option>
						<option value="河南省">河南省</option>
						<option value="湖北省">湖北省</option>
						<option value="湖南省">湖南省</option>
						<option value="广东省">广东省</option>
						<option value="广西壮族自治区">广西壮族自治区</option>
						<option value="海南省">海南省</option>
						<option value="重庆市">重庆市</option>
						<option value="四川省">四川省</option>
						<option value="贵州省">贵州省</option>
						<option value="云南省">云南省</option>
						<option value="西藏自治区">西藏自治区</option>
						<option value="陕西省">陕西省</option>
						<option value="甘肃省">甘肃省</option>
						<option value="青海省">青海省</option>
						<option value="宁夏回族自治区">宁夏回族自治区</option>
						<option value="新疆维吾尔自治区">新疆维吾尔自治区</option>
						<option value="台湾省">台湾省</option>
						<option value="香港特别行政区">香港特别行政区</option>
						<option value="澳门特别行政区">澳门特别行政区</option>
				</select>
			生日：<br>
			<input class="form-control" type="text" id="birthday" name="birthday"
					onblur="if(this.value==''){this.value='请输入学生生日';this.style.color='#AAA9A9';}"
					onfocus="if(this.value=='请输入学生生日'){this.value='';this.style.color='#555454'}"
					style="width: 145px; color: rgb(170, 169, 169);" value="请输入学生生日">
			<input class="btn btn-primary" type="submit" value="添加"><%@include file="student_footer.jsp" %>
		</form>
	</div>
</body>
</html>