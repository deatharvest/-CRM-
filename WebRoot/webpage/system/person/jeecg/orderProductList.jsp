<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addOrderProductBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});  
	$('#delOrderProductBtn').linkbutton({   
	    iconCls: 'icon-remove'  
	}); 
	$('#addOrderProductBtn').bind('click', function(){   
 		 var tr =  $("#add_orderProduct_table_template tr").clone();
	 	 $("#add_orderProduct_table").append(tr);
	 	 resetTrNum('add_orderProduct_table');
    });  
	$('#delOrderProductBtn').bind('click', function(){   
      	$("#add_orderProduct_table").find("input:checked").parent().parent().remove();   
        resetTrNum('add_orderProduct_table'); 
    }); 
    $(document).ready(function(){
    	$(".datagrid-toolbar").parent().css("width","auto");
    });
</script>
<div style="padding: 3px; height: 25px;width:auto;" class="datagrid-toolbar">
	<a id="addOrderProductBtn" href="#">添加</a> <a id="delOrderProductBtn" href="#">删除</a> 
</div>
<div style="width: auto;height: 300px;overflow-y:auto;overflow-x:scroll;">
<table border="0" cellpadding="2" cellspacing="0" id="orderProduct_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE">序号</td>
		<td align="center" bgcolor="#EEEEEE">操作</td>
				  <td align="left" bgcolor="#EEEEEE">createD</td>
				  <td align="left" bgcolor="#EEEEEE">crtuser</td>
				  <td align="left" bgcolor="#EEEEEE">crtuser</td>
				  <td align="left" bgcolor="#EEEEEE">delDt</td>
				  <td align="left" bgcolor="#EEEEEE">delflag</td>
				  <td align="left" bgcolor="#EEEEEE">gopCont</td>
				  <td align="left" bgcolor="#EEEEEE">gopCoun</td>
				  <td align="left" bgcolor="#EEEEEE">gopOneP</td>
				  <td align="left" bgcolor="#EEEEEE">gopProd</td>
				  <td align="left" bgcolor="#EEEEEE">gopProd</td>
				  <td align="left" bgcolor="#EEEEEE">gopSumP</td>
				  <td align="left" bgcolor="#EEEEEE">modifie</td>
				  <td align="left" bgcolor="#EEEEEE">modifie</td>
				  <td align="left" bgcolor="#EEEEEE">modifyD</td>
	</tr>
	<tbody id="add_orderProduct_table">	
	<c:if test="${fn:length(orderProductList)  <= 0 }">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">1</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck"/></td>
				  <td align="left"><input name="orderProductList[0].createDt" maxlength="" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderProductList[0].crtuser" maxlength="12" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderProductList[0].crtuserName" maxlength="10" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderProductList[0].delDt" maxlength="" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderProductList[0].delflag" maxlength="" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderProductList[0].gopContent" maxlength="66" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderProductList[0].gopCount" maxlength="" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderProductList[0].gopOnePrice" maxlength="" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderProductList[0].gopProductName" maxlength="33" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderProductList[0].gopProductType" maxlength="1" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderProductList[0].gopSumPrice" maxlength="" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderProductList[0].modifier" maxlength="12" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderProductList[0].modifierName" maxlength="10" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderProductList[0].modifyDt" maxlength="" type="text" style="width:120px;" ></td>
   			</tr>
	</c:if>
	<c:if test="${fn:length(orderProductList)  > 0 }">
		<c:forEach items="${orderProductList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
				<input name="orderProductList[${stuts.index }].id"  value="${poVal.id }" type="hidden" >
				   <td align="left"><input name="orderProductList[${stuts.index }].createDt" maxlength="" value="${poVal.createDt }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderProductList[${stuts.index }].crtuser" maxlength="12" value="${poVal.crtuser }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderProductList[${stuts.index }].crtuserName" maxlength="10" value="${poVal.crtuserName }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderProductList[${stuts.index }].delDt" maxlength="" value="${poVal.delDt }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderProductList[${stuts.index }].delflag" maxlength="" value="${poVal.delflag }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderProductList[${stuts.index }].gopContent" maxlength="66" value="${poVal.gopContent }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderProductList[${stuts.index }].gopCount" maxlength="" value="${poVal.gopCount }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderProductList[${stuts.index }].gopOnePrice" maxlength="" value="${poVal.gopOnePrice }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderProductList[${stuts.index }].gopProductName" maxlength="33" value="${poVal.gopProductName }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderProductList[${stuts.index }].gopProductType" maxlength="1" value="${poVal.gopProductType }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderProductList[${stuts.index }].gopSumPrice" maxlength="" value="${poVal.gopSumPrice }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderProductList[${stuts.index }].modifier" maxlength="12" value="${poVal.modifier }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderProductList[${stuts.index }].modifierName" maxlength="10" value="${poVal.modifierName }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderProductList[${stuts.index }].modifyDt" maxlength="" value="${poVal.modifyDt }" type="text" style="width:120px;"></td>
   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
</div>