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
<%
	List<Bbs> bbss;

	BbsService bbsService = new BbsService();

	String hql = "from Bbs where isleaf = 0  order by rootid asc";
	bbss = (List<Bbs>) bbsService.list(hql);
	
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
											<table width="100%" border="0" cellpadding="0"
												cellspacing="0">
												<tr>
													<td class="bdimage" height="180"
														background="image/bg_login.jpg">

														<%
															if (session.getAttribute("user") == null
																	|| "".equals(session.getAttribute("user"))) {
														%><table width="207" height="126" align="center"
															cellspacing="6">
															<form action="userLogin" method="post">
																<tr>
																	<td width="77" height="40" align="center"
																		valign="bottom">
																		用户名：
																	</td>
																	<td width="106" align="center" valign="bottom">
																		<input type="text" name="member.name" size="15" />
																	</td>
																</tr>
																<tr>
																	<td height="26" align="center" valign="middle">
																		密&nbsp;码：
																	</td>
																	<td align="center" valign="bottom">
																		<input type="password" name="member.password"
																			size="15" />
																	</td>
																</tr>
																<tr>
																	<td height="34">
																		<img src="image/denglu.gif" hspace="3"
																			tyle="cursor: hand" onClick="submit();" />
																	</td>
																	<td>
																		<img src="image/zhuce.gif" width="49" height="18"
																			hspace="5">
																	</td>
																</tr>
															</form>
														</table>
														<%
															} else {
														%>
														Welcome!&nbsp;&nbsp;&nbsp;&nbsp;<%=session.getAttribute("user")%>
														<br />

														<%
															}
														%>

													</td>
												</tr>
												<tr>
													<td class="bdimage" height="240"
														background="image/bg_notice.jpg">
														&nbsp;



													</td>
												</tr>
												<tr>
													<td class="bdimage" height="300"
														background="image/bg_friendlink.jpg">
														&nbsp;



													</td>
												</tr>
											</table>
										</td>
									</tr>
								</table>
							</td>


							<td width=40%>
								<table width=100% height="720" align="center" border="0"
									cellpadding="0" cellspacing="0">
									<tr>
										<td>
											<table width="100%" border="0" cellspacing="0"
												cellpadding="0">
												<tr>
													<td class="bdimage" height="360"
														background="image/bg_news.jpg">
														<table width="100%" height="100%" border="0"
															cellspacing="0" cellpadding="0">
															<tr>
																<td id="Layer1">
																	&nbsp;

																</td>
																<td height="60" align="right">
																	<a href="/CEB/news/news_list.jsp"> More >>>> </a>
																</td>
																<td>
																	&nbsp;

																</td>
															</tr>

															<tr>
																<td height="20">
																	&nbsp;


																</td>
															</tr>
														</table>
													</td>
												</tr>
												<tr>
													<td class="bdimage" height="360"
														background="image/bg_forum.jpg">
														&nbsp;
														<table>
															<s:iterator value="bbss" var="bbs">
																<tr>
																	<td align="center" width="20">
																		<img src="image/mark5.jpg">
																	</td>
																	<td>
																		<s:property value="#bbs.cont" />
																	</td>
																</tr>
															</s:iterator>
														</table>


													</td>
												</tr>
											</table>

										</td>
									</tr>
								</table>
							</td>


							<td width=30%>
								<table width=100% height="720" align="center" border="0"
									cellpadding="0" cellspacing="0">
									<tr>
										<td>
											<table width="100%" border="0" cellspacing="0"
												cellpadding="0">
												<tr>
													<td height="180">
														<img src="image/a.jpg" width="240" height="180" />
													</td>
												</tr>
												<tr>
													<td class="bdimage" height="270"
														background="image/bg_activity.jpg">
														&nbsp;



													</td>
												</tr>
												<tr>
													<td class="bdimage" height="270"
														background="image/bg_member.jpg">
														&nbsp;



													</td>
												</tr>
											</table>

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
		<s:debug></s:debug>
	</body>
</html>
