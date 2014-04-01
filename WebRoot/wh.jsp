<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="/WEB-INF/FCKeditor.tld" prefix="fck" %>
 <script type="text/javascript" src="/CEB/fckeditor/fckeditor.js"></script>
<html>
  <head>
    <title>FCKeditor Sample</title>
  </head>
  
  <body>
	<!--<FORM action="submit.jsp" target="blank">
    <fck:editor id="testfck" basePath="/CEB/fckeditor/"
    	height="500"
    	width="800"
    	skinPath="/CEB/fckeditor/editor/skins/silver/"
    	toolbarSet="Default"
    	imageBrowserURL="/CEB/fckeditor/editor/filemanager/browser/default/browser.html?Type=Image&Connector=connectors/jsp/connector"
		linkBrowserURL="/CEB/fckeditor/editor/filemanager/browser/default/browser.html?Connector=connectors/jsp/connector"
		flashBrowserURL="/CEB/fckeditor/editor/filemanager/browser/default/browser.html?Type=Flash&Connector=connectors/jsp/connector"
    	imageUploadURL="/CEB/fckeditor/editor/filemanager/upload/simpleuploader?Type=Image"
		linkUploadURL="/CEB/fckeditor/editor/filemanager/upload/simpleuploader?Type=File"
		flashUploadURL="/CEB/fckeditor/editor/filemanager/upload/simpleuploader?Type=Flash">
		This is some <strong>sample text</strong>. You are using <a href="http://www.fredck.com/fckeditor/">FCKeditor</a>.
    </fck:editor>
    </FORM>
  -->
  
         <form action="" method="post" target="_blank">
            <table border="0" width="700"><tr><td>
            <textarea id="content" name="content" style="WIDTH: 100%; HEIGHT: 
            400px">input</textarea>
            <script type="text/javascript">
             var oFCKeditor = new FCKeditor('content') ;
             oFCKeditor.BasePath = "<%=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/fckeditor/" %>";
             oFCKeditor.Height = 400;
             oFCKeditor.ToolbarSet = "Default" ; 
             oFCKeditor.ReplaceTextarea();
            </script>
            <input type="submit" value="Submit">
            </td></tr></table>
            </form>
  
  
</body>
</html>
