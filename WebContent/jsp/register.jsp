<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<jsp:include page="base.jsp" flush="true" />

<link rel='stylesheet' href='../css/login.css'>
<style>
<!--
-->
.center {
	margin: 0 auto;
}
</style>


<div class="container">
	<s:if test="hasActionMessages()">
		<div class="alert alert-success">
			<a href="#" class="close" data-dismiss="alert"> &times; </a>
			${message}
		</div>
	</s:if>
	<s:elseif test="hasActionErrors()">
		<div class="alert alert-warning">
			<a href="#" class="close" data-dismiss="alert"> &times; </a>
			${message}
		</div>
	</s:elseif>


	<div class="row">
		<div class="col-md-offset-3 col-md-6 center">
			<form class="form-horizontal" action="Register" method="post">
				<span class="heading">用户注册</span>
				<div class="form-group">
					<input type="text" class="form-control" id="inputEmail3"
						placeholder="学号或职工号" name="user.userName"> <i
						class="fa fa-user"></i>
				</div>
				<div class="form-group help">
					<input type="password" class="form-control" id="inputPassword3"
						placeholder="密　码" name="user.password"> <i
						class="fa fa-lock"></i> <a href="#" class="fa fa-question-circle"></a>
				</div>
				<div class="form-group">
					<div class="main-checkbox">
						<input type="checkbox" value="None" id="checkbox1" name="check" />
						<label for="checkbox1"></label>
					</div>
					<span class="text">记住我</span>
					<button type="submit" class="btn btn-default">注册</button>
				</div>
			</form>
		</div>
	</div>
</div>