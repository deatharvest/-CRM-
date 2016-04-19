<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>商品信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript" src="plug-in/ckeditor_new/ckeditor.js"></script>
  <script type="text/javascript" src="plug-in/ckfinder/ckfinder.js"></script>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="xGoodsController.do?doUpdate" tiptype="1">
					<input id="id" name="id" type="hidden" value="${xGoodsPage.id }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								商品ID:
							</label>
						</td>
						<td class="value">
						     	 <input id="goodsId" name="goodsId" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xGoodsPage.goodsId}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">商品ID</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								商品名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="name" name="name" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xGoodsPage.name}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">商品名称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								价格:
							</label>
						</td>
						<td class="value">
						     	 <input id="price" name="price" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xGoodsPage.price}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">价格</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								录入时间:
							</label>
						</td>
						<td class="value">
						     	 <input id="entryTime" name="entryTime" type="date" style="width: 150px" class="inputxt"  
									               
									                 value='${xGoodsPage.entryTime}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">录入时间</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								库存量：
							</label>
						</td>
						<td class="value">
						     	 <input id="inventory" name="inventory" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xGoodsPage.inventory}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">库存量</label>
						</td>

					</tr>
			</table>
		</t:formvalid>
 </body>
