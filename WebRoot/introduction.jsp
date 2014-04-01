<%@ page language="java"
	import="java.util.*,com.ceb.model.*,com.ceb.service.*;"
	pageEncoding="gbk"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>电子商务协会网站</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

		<link href="css/ieb.css" type="text/css" rel="stylesheet">
		<script type="text/javascript" src="index.js"></script>
	</head>

	<body onLoad="getNews('5')">
		<table width="800" align="center" border="0" cellpadding="0"
			cellspacing="0">
			<tr>
				<td>
					<img src="image/logo.jpg" width="800" height="100" />
				</td>
			</tr>

			<tr>
				<td class="bgcolor">
					<table width=100% border="0">
						<tr>
							<td align="center">
								<a href="/CEB/web/index">首页</a>
							</td>
							<td align="center">
								<a href="/CEB/introduction.jsp">协会介绍</a>
							</td>
							<td align="center">
								<a href="/CEB/web/news_index">协会新闻 </a>
							</td>
							<td align="center">
								<a href="/CEB/web/bbsList!listAll?currentPage=1">协会论坛</a>
							</td>
							<td align="center">
								<a href="/CEB/web/files_index">资源共享 </a>
							</td>
							<td align="center">
								<a href="/CEB/tendency.jsp">行业动态</a>
							</td>
						</tr>
					</table>
				</td>
			</tr>

			<tr>
				<td>
					<img src="image/slogan.jpg" width="800" height="175">
				</td>
			</tr>

			<tr>
				<td>
					<table width=100% height="720" align="center" border="0"
						cellpadding="0" cellspacing="0">
						<tr>
							<td width=30%>
								<table width=100% height="720" align="center" border="0"
									cellpadding="0" cellspacing="0">
									<tr>
										<td>
											
										</td>
									</tr>
								</table>
							</td>


							<td width=40%>
								<table width=100% height="720" align="center" border="0"
									cellpadding="0" cellspacing="0">
									<tr>
										<td>
										

										</td>
									</tr>
								</table>
							</td>


							<td width=30%>
								<table width=100% height="720" align="center" border="0"
									cellpadding="0" cellspacing="0">
									<tr>
										<td>
											
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
			</tr>

			<tr>
				<td class="bgcolor">
					<table width=100% border="0">
						<tr align="center">
							<td width="70%">
								Copyright 2009-2010 武汉理工大学电子商务协会 版权所有
								<br />
								地址:武汉市洪山区珞狮路122号武汉理工大学
								<br>
								邮编:430070&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								ieb@whut.edu.cn&nbsp;
							</td>
						</tr>
					</table>
				</td>
			</tr>

		</table>
	</body>
</html>
