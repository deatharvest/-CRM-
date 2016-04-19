<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addXRebateInfoBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});  
	$('#delXRebateInfoBtn').linkbutton({   
	    iconCls: 'icon-remove'  
	}); 
	$('#addXRebateInfoBtn').bind('click', function(){   
 		 var tr =  $("#add_xRebateInfo_table_template tr").clone();
	 	 $("#add_xRebateInfo_table").append(tr);
	 	 resetTrNum('add_xRebateInfo_table');
    });  
	$('#delXRebateInfoBtn').bind('click', function(){   
      	$("#add_xRebateInfo_table").find("input:checked").parent().parent().remove();   
        resetTrNum('add_xRebateInfo_table'); 
    }); 
    $(document).ready(function(){
    	$(".datagrid-toolbar").parent().css("width","auto");
    	if(location.href.indexOf("load=detail")!=-1){
			$(":input").attr("disabled","true");
			$(".datagrid-toolbar").hide();
			$(":input").each(function(){
				var $thisThing = $(this);
				$thisThing.attr("title",$thisThing.val());
			});
		}
    });
</script>
<div style="padding: 3px; height: 25px;width:auto;" class="datagrid-toolbar">
	<a id="addXRebateInfoBtn" href="#">添加</a> <a id="delXRebateInfoBtn" href="#">删除</a> 
</div>
<div style="width: auto;height: 300px;overflow-y:auto;overflow-x:scroll;">
<table border="0" cellpadding="2" cellspacing="0" id="xRebateInfo_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE"><label class="Validform_label">序号</label></td>
		<td align="center" bgcolor="#EEEEEE"><label class="Validform_label">操作</label></td>
				  <td align="left" bgcolor="#EEEEEE">
				  <label class="Validform_label">
								订单号
							</label></td>
				  <td align="left" bgcolor="#EEEEEE">
				  <label class="Validform_label">
								时间
							</label></td>
				  <td align="left" bgcolor="#EEEEEE">
				  <label class="Validform_label">
								总金额
							</label></td>
				  <td align="left" bgcolor="#EEEEEE">
				  <label class="Validform_label">
								返利金额
							</label></td>
				  <td align="left" bgcolor="#EEEEEE">
				  <label class="Validform_label">
								饭利率
							</label></td>
	</tr>
	<tbody id="add_xRebateInfo_table">	
	<c:if test="${fn:length(xRebateInfoList)  <= 0 }">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">1</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck"/></td>
					<input name="xRebateInfoList[0].id" type="hidden"/>
					<input name="xRebateInfoList[0].fckId" type="hidden"/>
				  <td align="left">
					  	<input name="xRebateInfoList[0].orderNumber" maxlength="36" 
					  		type="text" class="inputxt"  style="width:120px;"
					               
					               >
					  <label class="Validform_label" style="display: none;">订单号</label>
					</td>
				  <td align="left">
							<input name="xRebateInfoList[0].date" maxlength="36" 
					  		type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"
					                
					               >  
					  <label class="Validform_label" style="display: none;">时间</label>
					</td>
				  <td align="left">
					  	<input name="xRebateInfoList[0].totalPrice" maxlength="200" 
					  		type="text" class="inputxt"  style="width:120px;"
					               
					               >
					  <label class="Validform_label" style="display: none;">总金额</label>
					</td>
				  <td align="left">
					  	<input name="xRebateInfoList[0].rebatePrice" maxlength="200" 
					  		type="text" class="inputxt"  style="width:120px;"
					               
					               >
					  <label class="Validform_label" style="display: none;">返利金额</label>
					</td>
				  <td align="left">
					  	<input name="xRebateInfoList[0].rebateRate" maxlength="36" 
					  		type="text" class="inputxt"  style="width:120px;"
					               
					               >
					  <label class="Validform_label" style="display: none;">饭利率</label>
					</td>
   			</tr>
	</c:if>
	<c:if test="${fn:length(xRebateInfoList)  > 0 }">
		<c:forEach items="${xRebateInfoList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
					<input name="xRebateInfoList[${stuts.index }].id" type="hidden" value="${poVal.id }"/>
					<input name="xRebateInfoList[${stuts.index }].fckId" type="hidden" value="${poVal.fckId }"/>
				   <td align="left">
					  	<input name="xRebateInfoList[${stuts.index }].orderNumber" maxlength="36" 
					  		type="text" class="inputxt"  style="width:120px;"
					               
					                value="${poVal.orderNumber }">
					  <label class="Validform_label" style="display: none;">订单号</label>
				   </td>
				   <td align="left">
							<input name="xRebateInfoList[${stuts.index }].date" maxlength="36" 
					  		type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"
					                
					                value="<fmt:formatDate value='${poVal.date}' type="date" pattern="yyyy-MM-dd"/>">  
					  <label class="Validform_label" style="display: none;">时间</label>
				   </td>
				   <td align="left">
					  	<input name="xRebateInfoList[${stuts.index }].totalPrice" maxlength="200" 
					  		type="text" class="inputxt"  style="width:120px;"
					               
					                value="${poVal.totalPrice }">
					  <label class="Validform_label" style="display: none;">总金额</label>
				   </td>
				   <td align="left">
					  	<input name="xRebateInfoList[${stuts.index }].rebatePrice" maxlength="200" 
					  		type="text" class="inputxt"  style="width:120px;"
					               
					                value="${poVal.rebatePrice }">
					  <label class="Validform_label" style="display: none;">返利金额</label>
				   </td>
				   <td align="left">
					  	<input name="xRebateInfoList[${stuts.index }].rebateRate" maxlength="36" 
					  		type="text" class="inputxt"  style="width:120px;"
					               
					                value="${poVal.rebateRate }">
					  <label class="Validform_label" style="display: none;">饭利率</label>
				   </td>
   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
</div>