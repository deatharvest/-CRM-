<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="xInventoryList" checkbox="true" fitColumns="false" title="酒类库存" actionUrl="xInventoryController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="false"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经销商ID"  field="dealerId"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="五粮特区"  field="wltq"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="金潭玉液"  field="jtyy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="金剑南"  field="jjn"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="保留字段"  field="temp"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="xInventoryController.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="xInventoryController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="xInventoryController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="xInventoryController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="xInventoryController.do?goUpdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>	
 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 });
 </script>