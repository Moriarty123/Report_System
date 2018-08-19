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
		<h3>现有年级：</h3>
		<thead>
			<tr>
				<th>年级</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>

			<s:iterator value="gradeList">
				<tr>
					<td><s:property value="grade"/>级</td>
					<td>
						<form action="deleteGrade" method="post">
							<input type="hidden" name="grade" value="<s:property value="grade"/>">
							<input class="rearchSubmit btn btn-primary" type="submit" value="删除">
						</form>
					</td>
				</tr>
			</s:iterator>

		</tbody>
	</table>
</div>
<table>
	<form class="bs-example bs-example-form" role="form"
		action="/selectManage" method="POST">
		<div class="col-lg-9">
			<div class="input-group">
				<input name="grade" type="text" class="form-control"
					placeholder="请输入年级，如：2014" pattern="[0-9]{4}" required> <span
					class="input-group-btn"> <input
					class="rearchSubmit btn btn-primary" type="submit" value="添加年级">
				</span>
			</div>
		</div>
	</form>
</table>




