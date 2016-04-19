<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>订单主数据</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //初始化下标
	function resetTrNum(tableId) {
		$tbody = $("#"+tableId+"");
		$tbody.find('>tr').each(function(i){
			$(':input, select', this).each(function(){
				var $this = $(this), name = $this.attr('name'), val = $this.val();
				if(name!=null){
					if (name.indexOf("#index#") >= 0){
						$this.attr("name",name.replace('#index#',i));
					}else{
						var s = name.indexOf("[");
						var e = name.indexOf("]");
						var new_name = name.substring(s+1,e);
						$this.attr("name",name.replace(new_name,i));
					}
				}
			});
			$(this).find('div[name=\'xh\']').html(i+1);
		});
	}
 </script>
 </head>
 <body style="overflow-y: hidden" scroll="no">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" tiptype="1" action="orderMainController.do?save">
			<input id="id" name="id" type="hidden" value="${orderMainPage.id }">
			<table cellpadding="0" cellspacing="1" class="formtable">
			<tr>
			<td align="right"><label class="Validform_label">createD:</label></td>
			<td class="value">
				<input nullmsg="请填写createD" errormsg="createD格式不对" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="createDt" name="createDt" ignore="ignore"
									     value="<fmt:formatDate value='${orderMainPage.createDt}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>">
								<span class="Validform_checktip"></span>
			</td>
			<td align="right"><label class="Validform_label">crtuser:</label></td>
			<td class="value">
				<input nullmsg="请填写crtuser" errormsg="crtuser格式不对" class="inputxt" id="crtuser" name="crtuser" ignore="ignore"
									   value="${orderMainPage.crtuser}">
								<span class="Validform_checktip"></span>
			</td>
			</tr>
			<tr>
			<td align="right"><label class="Validform_label">crtuser:</label></td>
			<td class="value">
				<input nullmsg="请填写crtuser" errormsg="crtuser格式不对" class="inputxt" id="crtuserName" name="crtuserName" ignore="ignore"
									   value="${orderMainPage.crtuserName}">
								<span class="Validform_checktip"></span>
			</td>
			<td align="right"><label class="Validform_label">delDt:</label></td>
			<td class="value">
				<input nullmsg="请填写delDt" errormsg="delDt格式不对" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="delDt" name="delDt" ignore="ignore"
									     value="<fmt:formatDate value='${orderMainPage.delDt}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>">
								<span class="Validform_checktip"></span>
			</td>
			</tr>
			<tr>
			<td align="right"><label class="Validform_label">delflag:</label></td>
			<td class="value">
				<input nullmsg="请填写delflag" errormsg="delflag格式不对" class="inputxt" id="delflag" name="delflag" ignore="ignore"
									   value="${orderMainPage.delflag}" datatype="n">
								<span class="Validform_checktip"></span>
			</td>
			<td align="right"><label class="Validform_label">goAllPr:</label></td>
			<td class="value">
				<input nullmsg="请填写goAllPr" errormsg="goAllPr格式不对" class="inputxt" id="goAllPrice" name="goAllPrice" ignore="ignore"
									   value="${orderMainPage.goAllPrice}" datatype="d">
								<span class="Validform_checktip"></span>
			</td>
			</tr>
			<tr>
			<td align="right"><label class="Validform_label">goConta:</label></td>
			<td class="value">
				<input nullmsg="请填写goConta" errormsg="goConta格式不对" class="inputxt" id="goContactName" name="goContactName" ignore="ignore"
									   value="${orderMainPage.goContactName}">
								<span class="Validform_checktip"></span>
			</td>
			<td align="right"><label class="Validform_label">goConte:</label></td>
			<td class="value">
				<input nullmsg="请填写goConte" errormsg="goConte格式不对" class="inputxt" id="goContent" name="goContent" ignore="ignore"
									   value="${orderMainPage.goContent}">
								<span class="Validform_checktip"></span>
			</td>
			</tr>
			<tr>
			<td align="right"><label class="Validform_label">goOrder:</label></td>
			<td class="value">
				<input nullmsg="请填写goOrder" errormsg="goOrder格式不对" class="inputxt" id="goOrderCode" name="goOrderCode" 
									   value="${orderMainPage.goOrderCode}" datatype="*">
								<span class="Validform_checktip"></span>
			</td>
			<td align="right"><label class="Validform_label">goOrder:</label></td>
			<td class="value">
				<input nullmsg="请填写goOrder" errormsg="goOrder格式不对" class="inputxt" id="goOrderCount" name="goOrderCount" ignore="ignore"
									   value="${orderMainPage.goOrderCount}" datatype="n">
								<span class="Validform_checktip"></span>
			</td>
			</tr>
			<tr>
			<td align="right"><label class="Validform_label">goRetur:</label></td>
			<td class="value">
				<input nullmsg="请填写goRetur" errormsg="goRetur格式不对" class="inputxt" id="goReturnPrice" name="goReturnPrice" ignore="ignore"
									   value="${orderMainPage.goReturnPrice}" datatype="d">
								<span class="Validform_checktip"></span>
			</td>
			<td align="right"><label class="Validform_label">goTelph:</label></td>
			<td class="value">
				<input nullmsg="请填写goTelph" errormsg="goTelph格式不对" class="inputxt" id="goTelphone" name="goTelphone" ignore="ignore"
									   value="${orderMainPage.goTelphone}">
								<span class="Validform_checktip"></span>
			</td>
			</tr>
			<tr>
			<td align="right"><label class="Validform_label">goderTy:</label></td>
			<td class="value">
				<input nullmsg="请填写goderTy" errormsg="goderTy格式不对" class="inputxt" id="goderType" name="goderType" ignore="ignore"
									   value="${orderMainPage.goderType}">
								<span class="Validform_checktip"></span>
			</td>
			<td align="right"><label class="Validform_label">modifie:</label></td>
			<td class="value">
				<input nullmsg="请填写modifie" errormsg="modifie格式不对" class="inputxt" id="modifier" name="modifier" ignore="ignore"
									   value="${orderMainPage.modifier}">
								<span class="Validform_checktip"></span>
			</td>
			</tr>
			<tr>
			<td align="right"><label class="Validform_label">modifie:</label></td>
			<td class="value">
				<input nullmsg="请填写modifie" errormsg="modifie格式不对" class="inputxt" id="modifierName" name="modifierName" ignore="ignore"
									   value="${orderMainPage.modifierName}">
								<span class="Validform_checktip"></span>
			</td>
			<td align="right"><label class="Validform_label">modifyD:</label></td>
			<td class="value">
				<input nullmsg="请填写modifyD" errormsg="modifyD格式不对" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="modifyDt" name="modifyDt" ignore="ignore"
									     value="<fmt:formatDate value='${orderMainPage.modifyDt}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>">
								<span class="Validform_checktip"></span>
			</td>
			</tr>
			<tr>
			<td align="right"><label class="Validform_label">usertyp:</label></td>
			<td class="value">
				<input nullmsg="请填写usertyp" errormsg="usertyp格式不对" class="inputxt" id="usertype" name="usertype" ignore="ignore"
									   value="${orderMainPage.usertype}">
								<span class="Validform_checktip"></span>
			</td>
			</tr>
			</table>
			<div style="width: auto;height: 200px;">
				<%-- 增加一个div，用于调节页面大小，否则默认太小 --%>
				<div style="width:690px;height:1px;"></div>
				<t:tabs id="tt" iframe="false" tabPosition="top" fit="false">
				 <t:tab href="orderMainController.do?orderCustomsList&id=${orderMainPage.id}&goOrderCode=${orderMainPage.goOrderCode}" icon="icon-search" title="订单客户明细" id="orderCustoms"></t:tab>
				 <t:tab href="orderMainController.do?orderProductList&id=${orderMainPage.id}&goOrderCode=${orderMainPage.goOrderCode}" icon="icon-search" title="订单产品明细" id="orderProduct"></t:tab>
				</t:tabs>
			</div>
			</t:formvalid>
			<!-- 添加 明细 模版 -->
		<table style="display:none">
		<tbody id="add_orderCustoms_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left"><input name="orderCustomsList[#index#].createDt" maxlength="" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderCustomsList[#index#].crtuser" maxlength="12" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderCustomsList[#index#].crtuserName" maxlength="10" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderCustomsList[#index#].delDt" maxlength="" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderCustomsList[#index#].delflag" maxlength="" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderCustomsList[#index#].gocBussContent" maxlength="33" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderCustomsList[#index#].gocContent" maxlength="66" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderCustomsList[#index#].gocCusName" maxlength="16" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderCustomsList[#index#].gocIdcard" maxlength="18" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderCustomsList[#index#].gocPassportCode" maxlength="10" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderCustomsList[#index#].gocSex" maxlength="255" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderCustomsList[#index#].modifier" maxlength="12" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderCustomsList[#index#].modifierName" maxlength="10" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderCustomsList[#index#].modifyDt" maxlength="" type="text" style="width:120px;"></td>
			</tr>
		 </tbody>
		<tbody id="add_orderProduct_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left"><input name="orderProductList[#index#].createDt" maxlength="" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderProductList[#index#].crtuser" maxlength="12" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderProductList[#index#].crtuserName" maxlength="10" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderProductList[#index#].delDt" maxlength="" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderProductList[#index#].delflag" maxlength="" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderProductList[#index#].gopContent" maxlength="66" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderProductList[#index#].gopCount" maxlength="" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderProductList[#index#].gopOnePrice" maxlength="" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderProductList[#index#].gopProductName" maxlength="33" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderProductList[#index#].gopProductType" maxlength="1" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderProductList[#index#].gopSumPrice" maxlength="" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderProductList[#index#].modifier" maxlength="12" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderProductList[#index#].modifierName" maxlength="10" type="text" style="width:120px;"></td>
				  <td align="left"><input name="orderProductList[#index#].modifyDt" maxlength="" type="text" style="width:120px;"></td>
			</tr>
		 </tbody>
		</table>
 </body>