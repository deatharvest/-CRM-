<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="orderMainList" fitColumns="true" title="订单主数据" actionUrl="orderMainController.do?datagrid" idField="id" fit="true">
   <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
   <t:dgCol title="createDt" field="createDt" formatter="yyyy-MM-dd hh:mm:ss"></t:dgCol>
   <t:dgCol title="crtuser" field="crtuser" ></t:dgCol>
   <t:dgCol title="crtuserName" field="crtuserName" ></t:dgCol>
   <t:dgCol title="delDt" field="delDt" formatter="yyyy-MM-dd hh:mm:ss"></t:dgCol>
   <t:dgCol title="delflag" field="delflag" ></t:dgCol>
   <t:dgCol title="goAllPrice" field="goAllPrice" ></t:dgCol>
   <t:dgCol title="goContactName" field="goContactName" ></t:dgCol>
   <t:dgCol title="goContent" field="goContent" ></t:dgCol>
   <t:dgCol title="goOrderCode" field="goOrderCode" ></t:dgCol>
   <t:dgCol title="goOrderCount" field="goOrderCount" ></t:dgCol>
   <t:dgCol title="goReturnPrice" field="goReturnPrice" ></t:dgCol>
   <t:dgCol title="goTelphone" field="goTelphone" ></t:dgCol>
   <t:dgCol title="goderType" field="goderType" ></t:dgCol>
   <t:dgCol title="modifier" field="modifier" ></t:dgCol>
   <t:dgCol title="modifierName" field="modifierName" ></t:dgCol>
   <t:dgCol title="modifyDt" field="modifyDt" formatter="yyyy-MM-dd hh:mm:ss"></t:dgCol>
   <t:dgCol title="usertype" field="usertype" ></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="orderMainController.do?del&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="orderMainController.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="orderMainController.do?addorupdate" funname="update"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>