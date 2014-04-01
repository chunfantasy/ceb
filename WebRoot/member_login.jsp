<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
  <%@taglib uri="/struts-tags" prefix="s" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>论坛首页</title>
		<link href="/CEB/css/ieb.css" type="text/css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="/CEB/css/style.css" title="Integrated Styles">
        <script language="JavaScript" type="text/javascript" src="/CEB/js/global.js"></script>
        <script language="JavaScript" type="text/javascript" src="/CEB/js/common.js"></script>

    <style type="text/css">
<!--
#jive-forumpage table tbody tr td .jive-thread-list .jive-table form table tbody .jive-even td {
	font-family: Verdana, Geneva, sans-serif;
}
-->
    </style>
	</head>

<body>
		<table width="800" align="center" border="0" cellpadding="0"
			cellspacing="0">
			<tr>
				<td>
					<img src="/CEB/image/logo.jpg" width="800" height="100" />
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
      <td width="40%"><img src="/CEB/image/header-stretch.gif" alt="" border="0" height="57" width="100%"> </td>
      <td width="1%"><img src="/CEB/image/header-right.gif" alt="" height="57" border="0"></td>
    </tr>
  </tbody>
</table>
<br>
<div id="jive-forumpage">
  <table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tbody>
      <tr valign="top">
        <td width="98%"><p class="jive-breadcrumbs">用户登录: 武汉理工大学电子商务协会
            </p>
          <p class="jive-description"><font color=red> 对不起，你还没有登录，请您登录！</font> </p>
        </td>
      </tr>
    </tbody>
  </table>
  <div class="jive-buttons">
    <table summary="Buttons" border="0" cellpadding="0" cellspacing="0">
     
    </table>
  </div>
  <br>
  
  <table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tbody>
      <tr valign="top">
        <td width="99%"><div class="jive-thread-list">
           	
            <form action="web/userLogin" method="post">
              <table  cellpadding="0" cellspacing="0" width="100%" border="0">
              
                <tbody>
                  
                  <tr >
                    <td width="40%" height="50" align="right" with=100>用户名：</td>
                    <td width="60%" align="left" nowrap="nowrap" ><div class="jive-bullet">
                      <input type="text" name="member.name" size="20"/></td>
                  </tr>
                  <tr class="jive-even">
                    <td height="50" align="right" with="100">密码：</td>
                    <td align="left" nowrap="nowrap" class="jive-first"><div class="jive-bullet">
                      <input type="password" name="member.password" size="21"/></td>
                  </tr>
                
                  <tr class="jive-even">
                    <td height="34" align="right" with=100>&nbsp;</td>
                    <td align="left" nowrap="nowrap" class="jive-first">
                    <input type="image" src="/CEB/image/denglu.gif"  onclick="submit();">
                    <a href="member_register.jsp"><img src="/CEB/image/zhuce.gif" border=0 ></img></a>
                    </td>
                  </tr>
                
                </tbody>
              </table>
              </form>
            
          </div>
          <div class="jive-legend"></div></td>
      </tr>
    </tbody>
  </table>
  <br>
  <br>
</div>
<s:debug></s:debug>
<!--<s:iterator value="fieldErrors">    
     <s:iterator value="value">    
         <script language="JavaScript">    
             alert('<s:property/>');    
         </script>       
     </s:iterator>      
</s:iterator>    

			
			--><br><br></td>
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
