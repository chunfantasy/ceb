<%@ page language="java" import="java.util.*,java.text.*"
	pageEncoding="gbk"%>
<%@taglib uri="/struts-tags" prefix="s"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
		<title>��̳��ҳ</title>
		<link href="/CEB/css/ieb.css" type="text/css" rel="stylesheet">
			<link rel="stylesheet" type="text/css" href="/CEB/css/style.css"
				title="Integrated Styles">

				<script language="JavaScript" type="text/javascript"
					src="image/global.js"></script>
				<script language="JavaScript" type="text/javascript"
					src="image/common.js"></script>
				<script type="text/javascript" src="/CEB/fckeditor/fckeditor.js"></script>
				<script type="text/javascript">
        window.onload = function()
         {
	     var sBasePath = "<%=request.getScheme() + "://"
					+ request.getServerName() + ":" + request.getServerPort()
					+ request.getContextPath() + "/fckeditor/"%>";
	     var oFCKeditor = new FCKeditor( 'bbs.cont' ) ;
	      oFCKeditor.BasePath	= sBasePath ;
	      oFCKeditor.ReplaceTextarea() ;}

       </script>
	</head>

	<%!public static String getTime() {
		Calendar nowTime = Calendar.getInstance();
		Date nowDate = nowTime.getTime();
		String dateFormat = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);

		return sdf.format(nowDate);
	}%>

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
								<td width="40%">
									<img src="/CEB/image/header-stretch.gif" alt="" border="0"
										height="57" width="100%">
								</td>
								<td width="1%">
									<img src="/CEB/image/header-right.gif" alt="" height="57"
										border="0">
								</td>
							</tr>
						</tbody>
					</table>
					<br>
						<div id="jive-flatpage">
							<table border="0" cellpadding="0" cellspacing="0" width="100%">
								<tbody>
									<tr valign="top">
										<td width="79%">
											<p class="jive-breadcrumbs">
												��ҳ
												&#187;�人����ѧ&nbsp;|&nbsp;����ѧԺ&nbsp;|&nbsp;��������Э��|&nbsp;������̳
												: ��ѧjava��һ����
											</p>
											<p class="jive-breadcrumbs">
												�㵱ǰ���������&#187;:
												<s:property value="bbss[0].title" />
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
												<a href="web/bsList!listAll?currentPage=1"><img
														src="/CEB/image/arrow-left-16x16.gif" alt="���ص������б�"
														border="0">
												</a>
												<a href="web/bbsList!listAll?currentPage=1">���ص������б�</a>
											</p>
										</td>
										<td width="1%">
											<div class="jive-accountbox"></div>
										</td>
									</tr>
									<tr valign="top">
										<td>
											<br>
												<span class="jive-paginator">[��&nbsp;<font color=red><s:property
															value="#request.totalPage" />
												</font>&nbsp;ҳ] <span class="jive-paginator"> <span
														class="jive-paginator"> [ <a
															href="web/bbsList!listDetail?rootid=<s:property value="bbss[0].rootid"/>&currentPage=${currentPage-1}">��һҳ</a>
															]-��&nbsp;<font color=red>${currentPage }&nbsp;</font>ҳ- [<a
															href="web/bbsList!listDetail?rootid=<s:property value="bbss[0].rootid"/>&currentPage=${currentPage+1}">��һҳ</a>
															] </span> </span>
										</td>



									</tr>
								</tbody>
							</table>
							<div class="jive-buttons">

								<table summary="Buttons" border="0" cellpadding="0"
									cellspacing="0">
									<tbody>
										<!--<tr>
          <td class="jive-icon"><img src="image/reply-16x16.gif" alt="�ظ�������" border="0" height="16" width="16"></td>
          <td class="jive-icon-label"><a id="jive-reply-thread">�ظ�������</a> </td>
        </tr>
      -->
									</tbody>
								</table>
							</div>
							<br>


								<s:iterator value="bbss" var="c">
									<table border="0" cellpadding="0" cellspacing="0" width="100%">
										<tbody>
											<tr valign="top">
												<td width="99%">
													<div id="jive-message-holder">
														<div class="jive-message-list">
															<div class="jive-table">
																<div class="jive-messagebox">

																	<table summary="Message" border="0" cellpadding="0"
																		cellspacing="0" width="100%">

																		<tbody>

																			<tr id="jive-message-780144" class="jive-odd"
																				valign="top">
																				<td class="jive-first" width="1%">

																					<!-- ������Ϣ��table -->
																					<table border="0" cellpadding="0" cellspacing="0"
																						width="150">
																						<tbody>
																							<tr>
																								<td>
																									&nbsp;
																									<br>
																										<br>
																											<span class="jive-description"> ����: <s:property
																													value="#c.pname" />
																												<br>
																													<br>
																														����: <s:property value="#c.pdate" />
																														<br>
																											</span>
																								</td>
																							</tr>
																						</tbody>
																					</table>
																					<!--������Ϣtable����-->

																				</td>
																				<td class="jive-last" width="99%">
																					<table border="0" cellpadding="0" cellspacing="0"
																						width="100%" style="width: 541px;">
																						<tbody>
																							<tr valign="top">
																								<td width="1%"></td>
																								<td width="97%">
																									<span class="jive-description">���⣺<s:property
																											value="#c.title" />
																									</span>
																								</td>
																								<td class="jive-rating-buttons" nowrap="nowrap"
																									width="1%"></td>
																								<td width="1%">
																									<br>
																								</td>
																							</tr>
																							<tr>
																								<td colspan="4"
																									style="border-top: 1px solid rgb(204, 204, 204);">
																									<br>
																										<s:property value="#c.cont" escape="false" />
																										<br>
																								</td>
																							</tr>
																							<!--
                              <tr>
                                <td colspan="4" style="font-size: 9pt;">1<br>
                                </td>
                              </tr>
                            -->
																						</tbody>
																					</table>
																				</td>
																			</tr>
																		</tbody>
																	</table>
																</div>
															</div>
														</div>
														<!--  <div class="jive-message-list-footer">
              <table border="0" cellpadding="0" cellspacing="0" width="100%">
                <tbody>
                  <tr>
                    <td nowrap="nowrap" width="1%"><br><br></td>
                    <td align="center" width="98%"><table border="0" cellpadding="0" cellspacing="0" width="118" height="20">
                      </table></td>
                    <td nowrap="nowrap" width="1%">&nbsp;</td>
                  </tr>
                </tbody>
              </table>
            </div>-->
													</div>
												</td>
												<td width="1%">
													&nbsp;
												</td>
											</tr>
										</tbody>
									</table>
								</s:iterator>
						</div>
						<s:debug></s:debug>

						<table border="0" cellpadding="0" cellspacing="0" width="930"
							height="61">
							<tbody>
								<tr>
									<td class="jive-icon">
										<img src="/CEB/image/reply-16x16.gif" alt="�ظ�������" border="0"
											width="16">
											&nbsp;&nbsp;&nbsp;&nbsp;�ظ�������
									</td>

								</tr>
								<tr valign="top">
									<td width="99%">
										<div id="jive-message-holder">
											<div class="jive-message-list">
												<div class="jive-table">
													<div class="jive-messagebox">

														<form action="web/bbsReply?currentPage=1" method="post">
															<input type="hidden" name="bbs.pname" value="�Ļ�" />
															<input type="hidden" name="bbs.rootid"
																value="<s:property value="bbss[0].rootid"/>" />
															<input type="hidden" name="bbs.title"
																value="<s:property value="bbss[0].title"/>">
																<textarea name="bbs.cont" rows="30" cols="60"></textarea>
																<input type="hidden" name="bbs.pdate"
																	value="<%=getTime()%> />
                		<input type="hidden" name="bbs.isleaf" value="1"/>
                	 
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
                            <td><a href=""><img src="/CEB/image/arrow-left-16x16.gif" alt="���ص������б�" border="0" height="16" hspace="6" width="16"></a> </td>
                            <td><a href="web/bbsList!listAll?currentPage=1">���ص������б�</a> </td>
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
