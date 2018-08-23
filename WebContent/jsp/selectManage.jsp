<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<jsp:include page="base.jsp" flush="true" />



<body data-spy="scroll" data-target="#myScrollspy" data-offset="20">



	<div class="container">
		<div class="row">



			<nav class="col-xs-3" id="myScrollspy">

				<div class="container-fluid">
					<div class="container-fluid">
						<ul class="nav nav-pills nav-stacked list-group">
							<li class="active list-group-item"><a href="#section1">年级设置</a>
							</li>
							<li class="list-group-item"><a href="#section2">专业设置</a></li>
							<li class="list-group-item"><a href="#section3">班级设置</a></li>
							<li class="list-group-item"><a href="#section4">课程设置</a></li>
						</ul>
					</div>
				</div>
			</nav>
			<div class="col-xs-9">

				<s:if test="hasActionErrors()">
					<div class="alert alert-warning">
						<a href="#" class="close" data-dismiss="alert"> &times; </a>
						${error}
					</div>
				</s:if>

				<s:if test="hasActionMessages()">
					<div class="alert alert-success">
						<a href="#" class="close" data-dismiss="alert"> &times; </a>
						${message}
					</div>
				</s:if>
				
				

				<div id="section1">
					<s:if test="gradeList==null">
						<s:action name="gradeManage" namespace="/" executeResult="true">
						</s:action>
					</s:if>
				</div>
				<HR style="border: 0">
				<br> <br>

				<div id="section2">
					<s:if test="majorList==null">
						<s:action name="majorManage" namespace="/" executeResult="true">
						</s:action>
					</s:if>
				</div>
				<HR style="border: 0">
				<br> <br>

				<div id="section3">
					<s:if test="classList==null">
						<s:action name="classManage" namespace="/" executeResult="true">
						</s:action>
					</s:if>
				</div>
				<HR style="border: 0">
				<br> <br>

				<div id="section4">
					<s:if test="courseList==null">
						<s:action name="courseManage" namespace="/" executeResult="true">
						</s:action>
					</s:if>
				</div>
				<HR style="border: 0">
				<br> <br>
			</div>
		</div>
	</div>
	<br>
	<br>
	<br>
	<br>
</body>



