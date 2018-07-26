<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<head>
<title>计算机与网络安全学院实验报告在线撰写系统</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
	
	<style type="text/css">

	
	.img-circle{border-radius:50%;}
	</style>
</head>

<nav class="navbar navbar-expand-lg bg-dark navbar-dark">


	
	<a class="nav-link" href="jsp/index.jsp"><img src="image/school.jpg" class="img-circle" alt="Cinque Terre" width="50"></a>
	<!-- <div class="navbar-collapse collapse" id="collapsibleNavbar">  -->
	<div class="navbar-collapse collapse" id="collapsibleNavbar">
		<!-- Links -->
		<ul class="nav navbar-nav nav-left">
			<li class="nav-item"><a class="nav-link" href="jsp/index.jsp">首页</a></li>
			<s:if test="#session.isLogin=='true'">
				<s:if test="#session.isStudent=='true'">
					<li class="nav-item"><a class="nav-link" href="#">我的实验报告</a></li>
				</s:if>


				<s:if test="#session.isStudent=='true'">
					<li class="nav-item"><a class="nav-link" href="#">我的实验任务</a></li>
				</s:if>

				<s:if test="#session.isStudent=='true'">
					<li class="nav-item"><a class="nav-link" href="#">我的实验课程</a></li>
				</s:if>

				<s:if test="#session.isTeacher=='true'">
					<li class="nav-item"><a class="nav-link" href="#">实验课程</a></li>
				</s:if>

				<!--  
				<s:if test="#session.isStudent=='true'">
					<li class="nav-item"><a class="nav-link" href="#">我的实验任务</a></li>
				</s:if>
				
				<li class="nav-item"><a class="nav-link" href="#">实验课程</a></li>
				<li class="nav-item"><a class="nav-link" href="#">批阅实验报告</a></li>
				<li class="nav-item"><a class="nav-link" href="#">发布实验任务</a></li>
				<li class="nav-item"><a class="nav-link" href="#">实验指导</a></li>
                -->

				<s:if test="#session.isTeacher=='true'">
					<li class="nav-item"><a class="nav-link" href="#">统计</a></li>
				</s:if>

				<s:if test="#session.isStudent=='true'">
					<li class="nav-item"><a class="nav-link" href="#">统计</a></li>
				</s:if>

				<s:if test="true">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbardrop"
						data-toggle="dropdown"> 管理 </a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="#">用户管理</a> <a
								class="dropdown-item" href="#">实验课程管理</a> <a
								class="dropdown-item" href="#">用户权限管理</a> <a
								class="dropdown-item" href="#">下拉框管理</a>
						</div></li>
				</s:if>
			</s:if>
		</ul>
	</div>
	<div>



		<ul class="nav navbar-nav navbar-right">
			<s:if test="#session.isLogin!='true'">

				<li class="nav-item"><a class="nav-link"
					href="jsp/register.jsp"> <span class="glyphicon glyphicon-user"></span>
						注册
				</a></li>
				<li class="nav-item"><a class="nav-link" href="jsp/login.jsp">
						<span class="glyphicon glyphicon-log-in"></span> 登录
				</a></li>
			</s:if>
			<s:elseif test="#session.isLogin=='true'">

				<li class="nav-item"><a class="nav-link" href="">
						<span class="glyphicon glyphicon-log-in"></span> 欢迎你，${userName}
				</a></li>


				<li class="nav-item"><a class="nav-link" href="Logout">
						<span class="glyphicon glyphicon-log-in"></span> 登出
				</a></li>
			</s:elseif>

		</ul>
	</div>

	<!--折叠导航栏-->

	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#collapsibleNavbar">
		<span class="navbar-toggler-icon"></span>
	</button>

</nav>
<br>
