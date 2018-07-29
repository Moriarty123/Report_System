<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css">


<!-- 
<link rel='stylesheet' href='../css/selectManage.css'>
-->
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

<s:if test="gradeList==null">
 		 <s:action name="gradeManage" namespace="/"  executeResult="true"> </s:action>
</s:if>

<body data-spy="scroll" data-target="#myScrollspy" data-offset="20">
	<!-- 
	<a href="gradeManage">gradeManage</a>
	 
	<form name="gradeForm" action="gradeManage" method="post"></form>
	 -->
	
	
    <div class="container">
        <div class="row">
            <nav class="col-xs-3" id="myScrollspy">
                <div class="container-fluid">
                    <div class="container-fluid">
                        <ul class="nav nav-pills nav-stacked list-group">
                            <li class="active list-group-item">
                                <a href="#section1">年级设置</a>
                            </li>
                            <li class="list-group-item">
                                <a href="#section2">专业设置</a>
                            </li>
                            <li class="list-group-item">
                                <a href="#section3">班级设置</a>
                            </li>
                            <li class="list-group-item">
                                <a href="#section4">课程设置</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            <div class="col-xs-9">
                <div id="section1">
                    <div class="col-xs-9">
                        <table class="table">
                            <h3 id="section-1">现有年级：</h3>
                            <thead>
                                <tr>
                                    <th>年级</th>
                                    <th>操作</th>
                                </tr>
                            </thead>
                            <tbody>
                            	
								<s:iterator value="gradeList">
                                <tr>
                                    <td><s:property />级</td>
                                    <td>
                                        <a href="">删除</a>
                                    </td>
                                </tr>
								</s:iterator>
								
                            </tbody>
                        </table>
                    </div>
                    <table>
                        <form class="bs-example bs-example-form" role="form" action="/selectManage" method="POST">
                            <div class="col-lg-6">
                                <div class="input-group">
                                    <input name="grade" type="text" class="form-control" placeholder="请输入年级，如：2014" pattern="[0-9]{4}" required>
                                    <span class="input-group-btn">
                                        <input class="rearchSubmit btn btn-primary" type="submit" value="添加年级">
                                    </span>
                                </div>
                            </div>
                        </form>
                    </table>
                </div>
                
                
                <hr>
                
                
                <div id="section2">
                    <div class="col-xs-9">
                        <table class="table">
                            <h4>&nbsp;</h4>
                            <h4>&nbsp;</h4>
                            <h3 id="section-2">现有专业：</h3>
                            <thead>
                                <tr>
                                    <th>专业</th>
                                    <th>操作</th>
                                </tr>
                            </thead>
                            <tbody>

                                <tr>
                                    <td></td>
                                    <td>
                                        <a href="">删除</a>
                                    </td>
                                </tr>

                            </tbody>
                        </table>
                    </div>
                    <table>
                        <form class="bs-example bs-example-form" role="form" action="/selectManage" method="POST">
                            <div class="col-lg-6">
                                <div class="input-group">
                                    <input name="major" type="text" class="form-control" placeholder="请输入专业，如：计算机科学与技术" required="">
                                    <span class="input-group-btn">
                                        <input class="rearchSubmit btn btn-primary" type="submit" value="添加专业">
                                    </span>
                                </div>
                            </div>
                        </form>
                    </table>
                    <h2 id="section-2"></h2>

                </div>
                
                
                <hr>
                
                
                <div id="section3">
                    <div class="col-xs-9">
                        <table class="table">
                            <h4>&nbsp;</h4>
                            <h4>&nbsp;</h4>
                            <h3 id="seciton-3">现有班级：</h3>
                            <thead>
                                <tr>
                                    <th>班级</th>
                                    <th>操作</th>
                                </tr>
                            </thead>
                            <tbody>

                                <tr>
                                    <td>班</td>
                                    <td>
                                        <a href="">删除</a>
                                    </td>
                                </tr>

                            </tbody>
                        </table>
                    </div>
                    <table>
                        <form class="bs-example bs-example-form" role="form" action="/selectManage" method="POST">
                            <div class="col-lg-6">
                                <div class="input-group">
                                    <input name="classes" type="text" class="form-control" placeholder="请输入班级，如：1" required="" pattern="[0-9]{2}">
                                    <span class="input-group-btn">
                                        <input class="rearchSubmit btn btn-primary" type="submit" value="添加班级">
                                    </span>
                                </div>
                            </div>
                        </form>
                    </table>
                    <h2 id="section-3"></h2>
                </div>
                
                
                <hr>
                
                
                <div id="section4">
                    <div class="col-xs-9">
                        <table class="table">
                            <h4>&nbsp;</h4>
                            <h4>&nbsp;</h4>
                            <h3 id="seciton-4">现有课程：</h3>
                            <thead>
                                <tr>
                                    <th>课程</th>
                                    <th>操作</th>
                                </tr>
                            </thead>
                            <tbody>

                                <tr>
                                    <td></td>
                                    <td>
                                        <a href="">删除</a>
                                    </td>
                                </tr>

                            </tbody>
                        </table>
                    </div>
                    <table>
                        <form class="bs-example bs-example-form" role="form" action="/selectManage" method="POST">
                            <div class="col-lg-6">
                                <div class="input-group">
                                    <input name="courseName" type="text" class="form-control" placeholder="请输入课程，如：操作系统" required="">
                                    <span class="input-group-btn">
                                        <input class="rearchSubmit btn btn-primary" type="submit" value="添加课程">
                                    </span>
                                </div>
                            </div>
                        </form>
                    </table>
                    <h2 id="section-4"></h2>
                </div>
 
 
 				<hr>
 				
 				
            </div>

        </div>
    </div>
    <br>
    <br>
    <br>
    <br>
</body>
