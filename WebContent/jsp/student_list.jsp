<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="../lib/bootstrap/css/bootstrap.css" />
<script src="../lib/jquery/jquery-1.11.1.js"></script>
<link rel="stylesheet" type="text/css"
	href="../lib/bootstrap/css/bootstrap-theme.min.css" />
<script type="text/javascript" src="../lib/bootstrap/js/bootstrap.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	function deleteStudent(id) {
		var isDel = confirm("您确认要删除吗？");
		if (isDel) {
			//要删除
			location.href = "${pageContext.request.contextPath}/student/delete.action?id="
					+ id;
		}
	}
	function gopage(pageIndex) {
		$("#pageIndex").val(pageIndex);
		$("#searchForm").submit();
	}
	$(function() {
		$("#gender option[value='${searchCondition.gender}']").prop("selected",
				true);
	});
	function funselectAll() {
		$("input[name=selectIds]").prop("checked",
				$("#selectAll").is(":checked"));
	}

	function deleteAll() {
		$("#mainForm").attr("action",
				"${pageContext.request.contextPath}/student/deleteAll.action");
		$("#mainForm").submit();
	}
</script>
</head>
<body>
	<%@include file="student_header.jsp"%>
	<form id="searchForm"
		action="${pageContext.request.contextPath}/student/searchByCondition.action"
		method="post">
		<input type="hidden" name="pageIndex" id="pageIndex" />
		<table align="center">
			<tr>
				<td><input class="form-control" type="text" id="name"
					name="name"
					onblur="if(this.value==''){this.value='请输入学生姓名';this.style.color='#AAA9A9';}"
					onfocus="if(this.value=='请输入学生姓名'){this.value='';this.style.color='#555454'; }"
					style="width: 145px; color: rgb(170, 169, 169);" value="请输入学生姓名">

				</td>
				<td><input class="form-control" type="text" id="age" name="age"
					onblur="if(this.value==''){this.value='请输入学生年龄';this.style.color='#AAA9A9';}"
					onfocus="if(this.value=='请输入学生年龄'){this.value='';this.style.color='#555454';} "
					style="width: 145px; color: rgb(170, 169, 169);" value="请输入学生年龄">
				</td>
				<td><select class="form-control" name="address" id="address"
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
				</select></td>


				<td><select class="form-control" name="gender" id="gender"
					style="width: 150px">
						<option value="">--选择性别--</option>
						<option value="男">男</option>
						<option value="女">女</option>
				</select></td>
				<td><input class="btn btn-primary" type="submit" value="搜索">
				</td>
				<td><a class="btn btn-primary"
					href="${pageContext.request.contextPath}/jsp/student_add.jsp">添加</a>
				</td>
				<td><a class="btn btn-primary"
					href="${pageContext.request.contextPath}/student/onlineList.action">监听</a>
				</td>
			</tr>
		</table>
	</form>
	<div align="center">
		<form id="mainForm" method="post" action="" style="margin: auto;">
			<table class="table table-bordered" style="width: 900px;">
				<tr>
					<td><input type="checkbox" id="selectAll"
						onclick="funselectAll()" style="width: 30px;"></td>
					<td>ID</td>
					<td>姓名</td>
					<td>密码</td>
					<td>年龄</td>
					<td>性别</td>
					<td>籍贯</td>
					<td>生日</td>
					<td>修改</td>
					<td><a href="javascript:void(0);" onclick="deleteAll()">批量删除</a></td>
				</tr>

				<c:forEach items="${pageBean.list}" var="student">
					<tr>
						<td><input type="checkbox" name="selectIds"
							value="${student.id }" style="width: 30px;"></td>
						<td>${student.id }</td>
						<td>${student.name }</td>
						<td>${student.password}</td>
						<td>${student.age }</td>
						<td>${student.gender }</td>
						<td>${student.address }</td>
						<td>${student.birthday }</td>
						<td><a
							href="${pageContext.request.contextPath}/student/toUpdate.action?id=${student.id}">修改</a></td>
						<td><a href="javascript:void(0);"
							onclick="deleteStudent('${student.id}')">删除</a></td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</div>


	<nav aria-label="Page navigation" align="center">
	<ul class="pagination">
		<!-- 上一页 -->
		<c:if test="${pageBean.pageIndex!=1}">
			<li><a href="javascript:gopage('${pageBean.pageIndex-1}');"
				aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
			</a></li>
		</c:if>
		<c:if test="${pageBean.pageIndex==1}">
			<li class="disabled"><a href="javascript:void(0)"
				aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
			</a></li>
		</c:if>

		<!-- 页码键 -->
		<c:forEach begin="1" end="${pageBean.totalPage}" var="page">
			<c:if test="${pageBean.pageIndex==page }">
				<li class="active"><a href="javascript:void(0);">${page}</a></li>
			</c:if>
			<c:if test="${pageBean.pageIndex!=page }">
				<li><a href="javascript:gopage('${page}');">${page}</a></li>
			</c:if>
		</c:forEach>

		<!-- 下一页 -->
		<c:if test="${pageBean.pageIndex!=pageBean.totalPage }">
			<li><a href="javascript:gopage('${pageBean.pageIndex+1}');"
				aria-label="Next"> <span aria-hidden="true"> &raquo;</span>
			</a></li>
		</c:if>
		<c:if test="${pageBean.pageIndex==pageBean.totalPage }">
			<li class="disabled"><a href="javascript:void(0);"
				aria-label="Previous"> <span aria-hidden="true">&raquo;</span>
			</a></li>
		</c:if>
	</ul>
	</nav>

	<%@include file="student_footer.jsp"%>

</body>
</html>