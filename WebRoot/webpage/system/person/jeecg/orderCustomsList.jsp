<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addOrderCustomsBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});  
	$('#delOrderCustomsBtn').linkbutton({   
	    iconCls: 'icon-remove'  
	}); 
	$('#addOrderCustomsBtn').bind('click', function(){   
 		 var tr =  $("#add_orderCustoms_table_template tr").clone();
	 	 $("#add_orderCustoms_table").append(tr);
	 	 resetTrNum('add_orderCustoms_table');
    });  
	$('#delOrderCustomsBtn').bind('click', function(){   
      	$("#add_orderCustoms_table").find("input:checked").parent().parent().remove();   
        resetTrNum('add_orderCustoms_table'); 
    }); 
    $(document).ready(function(){
    	$(".datagrid-toolbar").parent().css("width","auto");
    });
</script>
<div style="padding: 3px; height: 25px;width:auto;" class="datagrid-toolbar">
	<a id="addOrderCustomsBtn" href="#">添加</a> <a id="delOrderCustomsBtn" href="#">删除</a> 
</div>
<div style="width: auto;height: 300px;overflow-y:auto;overflow-x:scroll;">
<table border="0" cellpadding="2" cellspacing="0" id="orderCustoms_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE">序号</td>
		<td align="center" bgcolor="#EEEEEE">操作</td>
				  <td align="left" bgcolor="#EEEEEE">createD</td>
				  <td align="left" bgcolor="#EEEEEE">crtuser</td>
				  <td align="left" bgcolor="#EEEEEE">crtuser</td>
				  <td align="left" bgcolor="#EEEEEE">delDt</td>
				  <td align="left" bgcolor="#EEEEEE">delflag</td>
				  <td align="left" bgcolor="#EEEEEE">gocBuss</td>
				  <td align="left" bgcolor="#EEEEEE">gocCont</td>
				  <td align="left" bgcolor="#EEEEEE">gocCusN</td>
				  <td align="left" bgcolor="#EEEEEE">gocIdca</td>
				  <td align="left" bgcolor="#EEEEEE">gocPass</td>
				  <td align="left" bgcolor="#EEEEEE">gocSex</td>
				  <td align="left" bgcolor="#EEEEEE">modifie</td>
				  <td align="left" bgcolor="#EEEEEE">modifie</td>
				  <td align="left" bgcolor="#EEEEEE">modifyD</td>
	</tr>
	<tbody id="add_orderCustoms_table">	
	<c:if test="${fn:length(orderCustomsList)  <= 0 }">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">1</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck"/></td>
				  <td align="left"><input name="orderCustomsList[0].createDt" maxlength="" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderCustomsList[0].crtuser" maxlength="12" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderCustomsList[0].crtuserName" maxlength="10" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderCustomsList[0].delDt" maxlength="" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderCustomsList[0].delflag" maxlength="" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderCustomsList[0].gocBussContent" maxlength="33" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderCustomsList[0].gocContent" maxlength="66" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderCustomsList[0].gocCusName" maxlength="16" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderCustomsList[0].gocIdcard" maxlength="18" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderCustomsList[0].gocPassportCode" maxlength="10" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderCustomsList[0].gocSex" maxlength="255" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderCustomsList[0].modifier" maxlength="12" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderCustomsList[0].modifierName" maxlength="10" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="orderCustomsList[0].modifyDt" maxlength="" type="text" style="width:120px;" ></td>
   			</tr>
	</c:if>
	<c:if test="${fn:length(orderCustomsList)  > 0 }">
		<c:forEach items="${orderCustomsList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
				<input name="orderCustomsList[${stuts.index }].id"  value="${poVal.id }" type="hidden" >
				   <td align="left"><input name="orderCustomsList[${stuts.index }].createDt" maxlength="" value="${poVal.createDt }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderCustomsList[${stuts.index }].crtuser" maxlength="12" value="${poVal.crtuser }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderCustomsList[${stuts.index }].crtuserName" maxlength="10" value="${poVal.crtuserName }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderCustomsList[${stuts.index }].delDt" maxlength="" value="${poVal.delDt }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderCustomsList[${stuts.index }].delflag" maxlength="" value="${poVal.delflag }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderCustomsList[${stuts.index }].gocBussContent" maxlength="33" value="${poVal.gocBussContent }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderCustomsList[${stuts.index }].gocContent" maxlength="66" value="${poVal.gocContent }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderCustomsList[${stuts.index }].gocCusName" maxlength="16" value="${poVal.gocCusName }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderCustomsList[${stuts.index }].gocIdcard" maxlength="18" value="${poVal.gocIdcard }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderCustomsList[${stuts.index }].gocPassportCode" maxlength="10" value="${poVal.gocPassportCode }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderCustomsList[${stuts.index }].gocSex" maxlength="255" value="${poVal.gocSex }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderCustomsList[${stuts.index }].modifier" maxlength="12" value="${poVal.modifier }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderCustomsList[${stuts.index }].modifierName" maxlength="10" value="${poVal.modifierName }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="orderCustomsList[${stuts.index }].modifyDt" maxlength="" value="${poVal.modifyDt }" type="text" style="width:120px;"></td>
   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
</div>