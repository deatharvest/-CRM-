<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>返利表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript" src="plug-in/ckeditor_new/ckeditor.js"></script>
  <script type="text/javascript" src="plug-in/ckfinder/ckfinder.js"></script>
  <script type="text/javascript">
  $(document).ready(function(){
	$('#tt').tabs({
	   onSelect:function(title){
	       $('#tt .panel-body').css('width','auto');
		}
	});
	$(".tabs-wrap").css('width','100%');
  });
 </script>
 </head>
 <body style="overflow-x: hidden;">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" tiptype="1" action="xRebateController.do?doUpdate">
					<input id="id" name="id" type="hidden" value="${xRebatePage.id }">
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right">
				<label class="Validform_label">attribute:</label>
			</td>
			<td class="value">
		     	 <input id="attribute" name="attribute" type="text" style="width: 150px" class="inputxt"  
					               
					                value='${xRebatePage.attribute}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">attribute</label>
			</td>
			<td align="right">
				<label class="Validform_label">ID:</label>
			</td>
			<td class="value">
		     	 <input id="vistorId" name="vistorId" type="text" style="width: 150px" class="inputxt"  
					               
					                value='${xRebatePage.vistorId}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">ID</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">名称:</label>
			</td>
			<td class="value">
		     	 <input id="name" name="name" type="text" style="width: 150px" class="inputxt"  
					               
					                value='${xRebatePage.name}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">名称</label>
			</td>
		</tr>
			</table>
			<div style="width: auto;height: 200px;">
				<%-- 增加一个div，用于调节页面大小，否则默认太小 --%>
				<div style="width:800px;height:1px;"></div>
				<t:tabs id="tt" iframe="false" tabPosition="top" fit="false">
				 <t:tab href="xRebateController.do?xRebateInfoList&id=${xRebatePage.id}" icon="icon-search" title="返利详情" id="xRebateInfo"></t:tab>
				</t:tabs>
			</div>
			</t:formvalid>
			<!-- 添加 附表明细 模版 -->
		<table style="display:none">
		<tbody id="add_xRebateInfo_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
					  	<input name="xRebateInfoList[#index#].orderNumber" maxlength="36" 
					  		type="text" class="inputxt"  style="width:120px;"
					               
					               >
					  <label class="Validform_label" style="display: none;">订单号</label>
				  </td>
				  <td align="left">
							<input name="xRebateInfoList[#index#].date" maxlength="36" 
					  		type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"
					                
					               >  
					  <label class="Validform_label" style="display: none;">时间</label>
				  </td>
				  <td align="left">
					  	<input name="xRebateInfoList[#index#].totalPrice" maxlength="200" 
					  		type="text" class="inputxt"  style="width:120px;"
					               
					               >
					  <label class="Validform_label" style="display: none;">总金额</label>
				  </td>
				  <td align="left">
					  	<input name="xRebateInfoList[#index#].rebatePrice" maxlength="200" 
					  		type="text" class="inputxt"  style="width:120px;"
					               
					               >
					  <label class="Validform_label" style="display: none;">返利金额</label>
				  </td>
				  <td align="left">
					  	<input name="xRebateInfoList[#index#].rebateRate" maxlength="36" 
					  		type="text" class="inputxt"  style="width:120px;"
					               
					               >
					  <label class="Validform_label" style="display: none;">饭利率</label>
				  </td>
			</tr>
		 </tbody>
		</table>
 </body>
 <script src = "webpage/business/rebate/xRebate.js"></script>	