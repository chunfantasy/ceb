<%@ page language="java" import="java.util.*,java.text.*" pageEncoding="gbk"%>
  <%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
		<title>��̳��ҳ</title>
		<link href="css/ieb.css" type="text/css" rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="css/style.css" title="Integrated Styles">
		
        <script language="JavaScript" type="text/javascript" src="image/global.js"></script>
        <script language="JavaScript" type="text/javascript" src="image/common.js"></script>
        <script type="text/javascript" src="fckeditor/fckeditor.js"></script>
       
       
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
								<a href="/CEB/web/index">��ҳ</a>
							</td>
							<td align="center">
								<a href="/CEB/introduction.jsp">Э�����</a>
							</td>
							<td align="center">
								<a href="/CEB/web/news_index">Э������ </a>
							</td>
							<td align="center">
								<a href="/CEB/web/bbsList!listAll?currentPage=1">Э����̳</a>
							</td>
							<td align="center">
								<a href="/CEB/web/files_index">��Դ���� </a>
							</td>
							<td align="center">
								<a href="/CEB/tendency.jsp">��ҵ��̬</a>
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
      <td width="40%"><img src="image/header-stretch.gif" alt="" border="0" height="57" width="100%"></td>
      <td width="1%"><img src="image/header-right.gif" alt="" height="57" border="0"></td></tr>
  </tbody>
</table>
<br>
<div id="jive-flatpage">
  
  <div class="jive-buttons">
   
    <table summary="Buttons" border="0" cellpadding="0" cellspacing="0">
      <tbody>
        <!--<tr>
          <td class="jive-icon"><img src="image/reply-16x16.gif" alt="�ظ�������" border="0" height="16" width="16"></td>
          <td class="jive-icon-label"><a id="jive-reply-thread">�ظ�������</a> </td>
        </tr>
      --></tbody>
    </table>
  </div>
  <br>
</div>
<s:debug></s:debug>

 <table border="0" cellpadding="0" cellspacing="0" width="930" height="61">
    <tbody>
       <tr>
          <td class="jive-icon" height="480" >
          <table width="800" height="480" border="0" align="center">
            <tr>
              <td height="58" align="center">
               <font color="" size="5" ><strong><s:property value="news.title"/></strong></font></td>
            </tr>
            <tr>
              <td height="18" align="right">�����ڣ�<s:property value="news.pdate"/></td>
            </tr>
            <tr>
              <td height="400" style="border-top: 1px solid rgb(204, 204, 204);" class="jive-last">
              <s:property value="news.content" escape="false"/>
              </td>
            </tr>
          </table></td>
      
        </tr>
      <tr valign="top">
        <td width="99%"><div id="jive-message-holder">
          <div class="jive-message-list-footer">
            <table border="0" cellpadding="0" cellspacing="0" width="100%">
                <tbody>
                  <tr>
                    <td nowrap="nowrap" width="1%"><br><br></td>
                    <td align="center" width="98%"><table border="0" cellpadding="0" cellspacing="0">
                        <tbody>
                          <tr>
                            <td><a href=""><img src="image/arrow-left-16x16.gif" alt="���ص������б�" border="0" height="16" hspace="6" width="16"></a> </td>
                            <td><a href="bbsList!listAll?currentPage=1">���ص������б�</a> </td>
                          </tr>
                        </tbody>
                      </table></td>
                    <td nowrap="nowrap" width="1%">&nbsp;</td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div></td>
        <td width="1%">&nbsp;</td>
      </tr>
    </tbody>
  </table>
			<br><br></td>
			</tr>

			<tr>
				<td class="bgcolor">
					<table width=100% border="0">
						<tr align="center">
							<td width="70%">
								Copyright 2009-2010 �人����ѧ��������Э�� ��Ȩ����
								<br />
								��ַ:�人�к�ɽ����ʨ·122���人����ѧ
								<br>
									�ʱ�:430070&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									ieb@whut.edu.cn&nbsp; 
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>
