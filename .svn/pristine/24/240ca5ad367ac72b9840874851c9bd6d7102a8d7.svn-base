<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid fitColumns="false" checkbox="true" name="xRebateList" title="返利表" actionUrl="xRebateController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="false"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="attribute"  field="attribute"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="ID"  field="vistorId"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="名称"  field="name"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="xRebateController.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="xRebateController.do?goAdd" funname="add" height="450"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="xRebateController.do?goUpdate" funname="update" height="450"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="xRebateController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="xRebateController.do?goUpdate" funname="detail" height="450"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/business/rebate/xRebateList.js"></script>		
 <script type="text/javascript">
  $(document).ready(function(){
 		//给时间控件加上样式
 });
 </script>