<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>订单</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript" src="plug-in/ckeditor_new/ckeditor.js"></script>
  <script type="text/javascript" src="plug-in/ckfinder/ckfinder.js"></script>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="xOrderController.do?doUpdate" tiptype="1">
					<input id="id" name="id" type="hidden" value="${xOrderPage.id }">
					<input id="temp" name="temp" type="hidden" value="${xOrderPage.temp }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								属性:
							</label>
						</td>
						<td class="value">
						     	 <input id="attribute" name="attribute" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xOrderPage.attribute}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">属性</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								购买者ID:
							</label>
						</td>
						<td class="value">
						     	 <input id="gmzid" name="gmzid" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xOrderPage.gmzid}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">购买者ID</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								供应商ID:
							</label>
						</td>
						<td class="value">
						     	 <input id="gysid" name="gysid" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xOrderPage.gysid}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">供应商ID</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								订单号:
							</label>
						</td>
						<td class="value">
						     	 <input id="orderNumber" name="orderNumber" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xOrderPage.orderNumber}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">订单号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								商品ID：
							</label>
						</td>
						<td class="value">
						     	 <input id="goodsId" name="goodsId" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xOrderPage.goodsId}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">五粮特区</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								商品数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="amount" name="amount" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xOrderPage.amount}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">商品数量</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								订单状态:
							</label>
						</td>
						<td class="value">
						     	 <input id="status" name="status" type="text" style="width: 150px" class="inputxt"  
									               
									                 value='${xOrderPage.status}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">订单状态</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								订单时间:
							</label>
						</td>
						<td class="value">
									  <input id="date" name="date" type="text" style="width: 150px" 
						      						class="Wdate" onClick="WdatePicker()"
									                
						      						 value='<fmt:formatDate value='${xOrderPage.date}' type="date" pattern="yyyy-MM-dd"/>'>    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">订单时间</label>
						</td>
				<td align="right">
					<label class="Validform_label">
					</label>
				</td>
				<td class="value">
				</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
