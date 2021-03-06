package com.business.order_form.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.business.order_form.dao.XOrderDao;
import com.business.order_form.entity.XOrderEntity;
import com.business.order_form.service.XOrderServiceI;

/**   
 * @Title: Controller
 * @Description: 订单
 * @author onlineGenerator
 * @date 2016-04-05 22:42:28
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/xOrderController")
public class XOrderController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(XOrderController.class);

	@Autowired
	private XOrderServiceI xOrderService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private XOrderDao xOrderDao;
	
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
/**
 * 经销商查询订单
 * 		attribute：        store or  dealer
 * 		dealerId：		访问者ID
 * 		orderNumber：	订单号
 * 		status:   修改订单状态  用jasonobject发过来
 * 功能：只传经销商ID，则返回所有订单信息
 * 		传经销商ID，订单号，返回该订单信息
 * 		传经销商ID，订单号，status，则修改该订单status，返回修改后的订单信息
 * 
 * 
 * http://localhost:8080/jeecg-framework/xOrderController.do?getOrders&vistorId=0001&orderNumber=1000&status=
 * @param request
 * @param response
 * @return
 */
	@RequestMapping(params = "getOrders")
	@ResponseBody
	public JSONArray getOrders( HttpServletRequest request,HttpServletResponse response){
		
		//获得访问者ID，订单号，状态
		String vistorId = request.getParameter("vistorId");//改为visitorId
		String orderNumber = request.getParameter("orderNumber");
		String status = request.getParameter("status");
		String attribute =request.getParameter("attribute");//store or  dealer
		JSONArray jsonArray = new JSONArray();
		
		jsonArray = xOrderService.packageOrder(vistorId,orderNumber,status,attribute);
		return jsonArray;

		
	}
	
/**
 * 设备访问下单
 * @param request
 * @param response
 * @return  {"attribute":"store","date":1459997466180,"gmzid":"1",
 * "goods": [{"amount":"4","goodsId":"1","name":"五粮特区"},
 * 			{"amount":"1","goodsId":"2","name":"金坛玉液"},
 * 			{"amount":"1","goodsId":"3","name":"金剑南"}],
 * 			"gysid":"0001","orderNumber":"0001"}
 */

	@RequestMapping(params = "orders")
	@ResponseBody
	public JSONObject orders( HttpServletRequest request,HttpServletResponse response){
		
		System.out.println("安卓设备访问下订单------------》");
		//解析数据
		String attribute;
		String storeId;
		String goods;
		JSONArray goodsArray;

		attribute = request.getParameter("attribute");
		
		storeId = request.getParameter("storeId");
		goods =  request.getParameter("goods");
		
		System.out.println("下订单的商品："+goods);
		goodsArray = JSONArray.parseArray(goods);//厉害
		JSONObject returnJsonObject = new JSONObject();
		
		/**
		 * input：attribute，storeId，goodsArray
		 * return:returnJsonObject
		 */
		if(attribute.equals("dealer")){
			//经销商下单
			returnJsonObject = xOrderService.dealOrderForDealer(attribute,storeId,goodsArray);
		}
		else {
			//门店下单
			returnJsonObject = xOrderService.dealOrder(attribute,storeId,goodsArray);
		}

		return returnJsonObject;
	}		
	
	
	
	/**
	 * 订单列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "xOrder")
	public ModelAndView xOrder(HttpServletRequest request) {
		return new ModelAndView("business/order/xOrderList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(XOrderEntity xOrder,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(XOrderEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, xOrder, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.xOrderService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除订单
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(XOrderEntity xOrder, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		xOrder = systemService.getEntity(XOrderEntity.class, xOrder.getId());
		message = "订单删除成功";
		try{
			xOrderService.delete(xOrder);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "订单删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除订单
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		AjaxJson j = new AjaxJson();
		message = "订单删除成功";
		try{
			for(String id:ids.split(",")){
				XOrderEntity xOrder = systemService.getEntity(XOrderEntity.class, 
				id
				);
				xOrderService.delete(xOrder);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "订单删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加订单
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(XOrderEntity xOrder, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		message = "订单添加成功";
		try{
			xOrderService.save(xOrder);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "订单添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新订单
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(XOrderEntity xOrder, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		message = "订单更新成功";
		XOrderEntity t = xOrderService.get(XOrderEntity.class, xOrder.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(xOrder, t);
			xOrderService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "订单更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 订单新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(XOrderEntity xOrder, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(xOrder.getId())) {
			xOrder = xOrderService.getEntity(XOrderEntity.class, xOrder.getId());
			req.setAttribute("xOrderPage", xOrder);
		}
		return new ModelAndView("business/order/xOrder-add");
	}
	/**
	 * 订单编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(XOrderEntity xOrder, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(xOrder.getId())) {
			xOrder = xOrderService.getEntity(XOrderEntity.class, xOrder.getId());
			req.setAttribute("xOrderPage", xOrder);
		}
		return new ModelAndView("business/order/xOrder-update");
	}
}
