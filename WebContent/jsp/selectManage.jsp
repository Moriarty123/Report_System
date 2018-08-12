<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<jsp:include page="base.jsp" flush="true" />




<s:if test="majorList==null">
 		 <s:action name="majorManage" namespace="/"  executeResult="true"> </s:action>
</s:if>


<div class="container">
	<div class="row">	

	</div>
</div>

