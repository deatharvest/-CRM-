<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="xStoreInfoList" checkbox="true" fitColumns="false" title="门店信息" actionUrl="xStoreInfoController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="false"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="门店ID"  field="storeId"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="店名"  field="storeName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="地址"  field="address"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="店主名" field="hostName" hidden="true"  queryMode="single"	width="120"></t:dgCol>
   <t:dgCol title="联系电话"  field="phone"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="状态"  field="staus"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="xStoreInfoController.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="xStoreInfoController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="xStoreInfoController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="xStoreInfoController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="xStoreInfoController.do?goUpdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 });
 </script>