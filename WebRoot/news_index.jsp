<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
  <%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>论坛首页</title>
		<link href="css/ieb.css" type="text/css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/style.css" title="Integrated Styles">
        <script language="JavaScript" type="text/javascript" src="js/global.js"></script>
        <script language="JavaScript" type="text/javascript" src="js/common.js"></script>

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
			
			<table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tbody>
    <tr>
      <td width="40%"><img src="image/header-stretch.gif" alt="" border="0" height="57" width="100%"> </td>
      <td width="1%"><img src="image/header-right.gif" alt="" height="57" border="0"></td>
    </tr>
  </tbody>
</table>
<br>
<div id="jive-forumpage">
  <table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tbody>
      <tr valign="top">
        <td width="98%"><p class="jive-breadcrumbs"><img src="image/news.jpg">
            </p>
          <p class="jive-description"> 电子商务协会———— 大家一起交流 共同提高！ </p><br>
        </td>
      </tr>
    </tbody>
  </table>
  <div class="jive-buttons">
    
  </div>
  <br>
  
  <table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tbody>
      <tr valign="top">
        <td width="99%"><div class="jive-thread-list">
            <div class="jive-table">
              <table summary="List of threads" cellpadding="0" cellspacing="0" width="80%" align="center">
                <!--<thead>
                  <tr>
                    <th class="jive-first" colspan="3"> 主题 </th>
                    <th class="jive-author"> <nobr>&nbsp; 作者 	 &nbsp; </nobr> </th>
                   
                    <th class="jive-last" nowrap="nowrap"> 最新帖子 </th>
                  </tr>
                </thead>
                --><tbody>
                  <s:iterator value="newss" var="c">
                  <tr class="jive-even">
                    
                    <td class="jive-view-count" width="5%"> <img src="image/mark1.jpg"></td>
                    <td class="jive-thread-name" width="74%"><a href="NewsList!listDetail?id=<s:property value="#c.id"/>"><s:property value="#c.title"/></a></td> 
                    
                   
                    <td class="jive-last" nowrap="nowrap" width="21%"><div class="jive-last-post"> <s:property value="#c.pdate"/> 
                        </div></td>
                  </tr>
                
                
                 </s:iterator>
                </tbody>
              </table>
            </div> 	
          </div>
          <div class="jive-legend"></div></td>
      </tr>
    </tbody>
  </table>
  <br>
  <br>
</div>
<s:debug></s:debug>
			
			<br><br></td>
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
