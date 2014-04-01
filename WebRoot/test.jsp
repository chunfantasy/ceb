<%@ page language="java"  pageEncoding="GB18030"%>
  
  <%@page   import="java.sql.*,java.util.*"%>   
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>

  <%String   sDBDrvier="com.microsoft.jdbc.sqlserver.SQLServerDriver";                     
      String   user="sa";
      String   pwd="123";
      String   sConnStr="jdbc:sqlserver://localhost:1433;DatabaseName=ceb";   
      Connection   conn=null;
      Statement   stmt=null;   
      ResultSet   rs=null;
      String   sqlStr="select   *   from   Bbs";
      try{
        Class.forName(sDBDrvier).newInstance();
      }
      catch(ClassNotFoundException   e)
      {
          //System.out.println("数据库驱动类没找到");
      }
      try{
            conn=DriverManager.getConnection(sConnStr,user,pwd);
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sqlStr);
            while(rs.next())   
            {
                    System.out.print(rs.getString("title"));   
            }
            }
      catch(SQLException   ex)
      {
              System.out.print(ex.getMessage());   
      }
  %>   
  </body>
</html>
