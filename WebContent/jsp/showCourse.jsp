<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css">

<style>
body {
	position: relative;
}

ul.nav-pills {
	top: 100px;
	position: fixed;
}

div.col-xs-9 div {
	font-size: 20px;
}

@media screen and (max-width: 810px) {
	#section1,#section2,#section3,#section4 {
		margin-left: 150px;
	}
}
</style>


<div class="col-xs-9">
	<table class="table">
		<h3>现有课程：</h3>
		<thead>
			<tr>
				<th>课程</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>

			<s:iterator value="courseList">
				<tr>
					<td><s:property /></td>
					<td><a href="">删除</a></td>
				</tr>
			</s:iterator>

		</tbody>
	</table>
</div>
<table>
	<form class="bs-example bs-example-form" role="form"
		action="/selectManage" method="POST">
		<div class="col-lg-6">
			<div class="input-group">
				<input name="courseName" type="text" class="form-control"
					placeholder="请输入课程，如：操作系统" required=""> <span
					class="input-group-btn"> <input
					class="rearchSubmit btn btn-primary" type="submit" value="添加课程">
				</span>
			</div>
		</div>
	</form>
</table>




