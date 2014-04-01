<%@ page language="java" import="com.jspsmart.upload.*"%>
<%
	SmartUpload mySmartUpload = new SmartUpload();
	mySmartUpload.initialize(pageContext);
	mySmartUpload.downloadFile("/files/" + request.getParameter("name"));
%>