<%@ page language="java" import="java.util.*,java.text.*" pageEncoding="gbk"%>
<%@ page import ="com.ceb.service.bbs.*" %>
  <%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
		<title>��������</title>
		<link href="css/ieb.css" type="text/css" rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="css/style.css" title="Integrated Styles">
		
        <script language="JavaScript" type="text/javascript" src="image/global.js"></script>
        <script language="JavaScript" type="text/javascript" src="image/common.js"></script>
        <script type="text/javascript" src="fckeditor/fckeditor_news.js"></script>
       <script type="text/javascript">
        window.onload = function()
         {
	     var sBasePath = "<%=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/fckeditor/" %>";
	     var oFCKeditor = new FCKeditor( 'news.content' ) ;
	     oFCKeditor.BasePath	= sBasePath ;
	      oFCKeditor.ReplaceTextarea() ;}

       </script>
       
       
	</head>
    <%!
        public static String getTime() {
            Calendar nowTime= Calendar.getInstance();
             Date nowDate = nowTime.getTime();
             String dateFormat = "yyyy-MM-dd HH:mm:ss";
             SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
             return sdf.format(nowDate);
                		    } 
      
                		%>
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
  <table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tbody>
      <tr valign="top">
        <td width="99%"><p class="jive-breadcrumbs"> ��ҳ &#187;�人����ѧ&nbsp;|&nbsp;����ѧԺ&nbsp;|&nbsp;��������Э��|&nbsp;���ŷ��� </p>
         </td>
        <td width="1%"><div class="jive-accountbox"></div></td>
      </tr>
          
    </tbody>
  </table>
  <div class="jive-buttons">
   
    <table summary="Buttons" border="0" cellpadding="0" cellspacing="0">
      <tbody>
        <!--<tr>
          <td class="jive-icon"><img src="../image/reply-16x16.gif" alt="�ظ�������" border="0" height="16" width="16"></td>
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
          <!--<td class="jive-icon"><img src="image/reply-16x16.gif" alt="�ظ�������" border="0"  width="16">&nbsp;&nbsp;&nbsp;&nbsp;�ظ�������</td>
      
        --></tr>
      <tr valign="top">
        <td width="99%"><div id="jive-message-holder">
            <div class="jive-message-list">
              <div class="jive-table">
                <div class="jive-messagebox">
                	
                <form action="NewsPost!post" method="post">
                		���ű��⣺<input type="text" name="news.title" size="68"/>
                		<br>
                		<input type="hidden" name="news.editor" nalue="wenhui"/>
                		<textarea name="news.content" rows="60" cols="60"></textarea>
                		<input type="hidden" name="news.pdate" value="<%=getTime() %>" />
                		<%=getTime() %>
                		
                		<br>
                		<input type="submit" value="�ύ"/>
                		<input type="reset" value="����"/>
                
                	</form> 
                	
                	
                </div>
              </div>
            </div>
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
