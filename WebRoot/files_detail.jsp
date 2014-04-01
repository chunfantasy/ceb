<%@ page language="java"
	import="java.util.*,com.ceb.model.*,com.ceb.service.*"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<base href="<%=basePath%>">

		<title>武汉理工大上学电子商务协会文件下载</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<link href="/css/ieb.css" type="text/css" rel="stylesheet">
	</head>

	<body>
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
								<a href="/CEB/files_index.jsp">资源共享 </a>
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
					<table width="800" align="center" border="0" cellpadding="0"
						cellspacing="0">
						<tr>
							<td width="200">
								<table width=100% height=100% border="0" cellspacing="0"
									cellpadding="0">
									<tr>
										<td align="center" class="bdimage">
											协会新闻（最新）
										</td>
									</tr>
									<%
										int c = application.getAttribute("count_files").hashCode();
										for (int i = c; i >= c - 9; i--) {
											out
													.write("<tr><td class=\"bdimage\" align=\"left\"><a href=\"/CEB/files_detail.jsp?x="
															+ ((Files) (application.getAttribute("files"
																	+ String.valueOf(i)))).getId() + "\"> ");
											out.write(((Files) (application.getAttribute("files"
													+ String.valueOf(i)))).getName());
											out.write("</tr></td> ");
										}
									%>
								</table>
							</td>
							<td width="600">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td class="bdimage" align="center">
											<%=((Files) (application.getAttribute("files"
							+ request.getParameter("x")))).getName()%>
										</td>
									</tr>
									<tr>
										<td class="bdimage" align="center">
											<%=((Files) (application.getAttribute("files"
							+ request.getParameter("x")))).getDescription()%>
										</td>
									</tr>
									<tr>
										<td class="bdimage" align="center">
											<%=((Files) (application.getAttribute("files"
							+ request.getParameter("x")))).getName()%>
										</td>
									</tr>
									<tr>
										<td class="bdimage" align="center">
											<a href="/CEB/files_download.jsp?name=<%=((Files) (application.getAttribute("files"
							+ request.getParameter("x")))).getPath()%>">下载</a>
										</td>
									</tr>
									<tr>
										<td class="bdimage" align="center">
											<a href="/CEB/files_index.jsp">返回</a>
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
