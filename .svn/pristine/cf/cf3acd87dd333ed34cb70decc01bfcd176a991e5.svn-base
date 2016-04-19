<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>公告</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript" src="plug-in/ckeditor_new/ckeditor.js"></script>
  <script type="text/javascript" src="plug-in/ckfinder/ckfinder.js"></script>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="xNoticeController.do?doUpdate" tiptype="1">
					<input id="id" name="id" type="hidden" value="${xNoticePage.id }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								发布时间:
							</label>
						</td>
						<td class="value">
									  <input id="issuedTime" name="issuedTime" type="text" style="width: 150px" 
						      						class="Wdate" onClick="WdatePicker()"
									                
						      						 value='<fmt:formatDate value='${xNoticePage.issuedTime}' type="date" pattern="yyyy-MM-dd"/>'>    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">发布时间</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								新闻属性:
							</label>
						</td>
						<td class="value">
						     	 <input id="attribute" name="attribute" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xNoticePage.attribute}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">新闻属性</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								标题:
							</label>
						</td>
						<td class="value">
						     	 <input id="title" name="title" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xNoticePage.title}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">标题</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								作者:
							</label>
						</td>
						<td class="value">
						     	 <input id="author" name="author" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xNoticePage.author}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">作者</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								内容:
							</label>
						</td>
						<td class="value">
						  	 	<textarea id="msg" name="msg">${xNoticePage.msg}</textarea>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">内容</label>
						</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
