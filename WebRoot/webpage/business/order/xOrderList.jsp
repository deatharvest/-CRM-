<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="xOrderList" checkbox="true" fitColumns="false" title="订单" actionUrl="xOrderController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="false"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="属性"  field="attribute"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="购买者ID"  field="gmzid"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="供应商ID"  field="gysid"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="订单号"  field="orderNumber"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="商品ID"  field="goodsId"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="商品数量"  field="amount"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="订单状态"  field="status"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="订单时间"  field="date" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="保留字段"  field="temp"  hidden="false"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="xOrderController.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="xOrderController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="xOrderController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="xOrderController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="xOrderController.do?goUpdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
	
 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 			$("#xOrderListtb").find("input[name='date']").attr("class","Wdate").attr("style","height:20px;width:90px;").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 });
 </script>