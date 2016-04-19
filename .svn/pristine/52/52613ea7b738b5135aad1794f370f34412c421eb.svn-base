<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>门店信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript" src="plug-in/ckeditor_new/ckeditor.js"></script>
  <script type="text/javascript" src="plug-in/ckfinder/ckfinder.js"></script>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="xStoreInfoController.do?doUpdate" tiptype="1">
					<input id="id" name="id" type="hidden" value="${xStoreInfoPage.id }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								门店ID:
							</label>
						</td>
						<td class="value">
						     	 <input id="storeId" name="storeId" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xStoreInfoPage.storeId}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">门店ID</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								门店名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="storeName" name="storeName" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xStoreInfoPage.storeName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">门店名称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								地址:
							</label>
						</td>
						<td class="value">
						     	 <input id="address" name="address" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xStoreInfoPage.address}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">地址</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								店主名:
							</label>
						</td>
						<td class="value">
						     	 <input id="hostName" name="hostName" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xStoreInfoPage.hostName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">店主名</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								联系电话:
							</label>
						</td>
						<td class="value">
						     	 <input id="phone" name="phone" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xStoreInfoPage.phone}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">联系电话</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								状态:
							</label>
						</td>
						<td class="value">
						     	 <input id="staus" name="staus" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xStoreInfoPage.staus}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">状态</label>
						</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
