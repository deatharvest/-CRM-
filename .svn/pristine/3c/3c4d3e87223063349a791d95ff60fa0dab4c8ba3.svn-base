<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="xNoticeList" checkbox="true" fitColumns="false" title="公告" actionUrl="xNoticeController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="false"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="发布时间"  field="issuedTime" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="新闻属性"  field="attribute"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="标题"  field="title"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="作者"  field="author"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="内容"  field="msg"  hidden="true"  queryMode="single"  width="580"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="xNoticeController.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="xNoticeController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="xNoticeController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="xNoticeController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="xNoticeController.do?goUpdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>

 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 			$("#xNoticeListtb").find("input[name='issuedTime']").attr("class","Wdate").attr("style","height:20px;width:90px;").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 });
 </script>