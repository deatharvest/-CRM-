package org.jeecgframework.web.system.person.controller.jeecg;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.person.entity.jeecg.OrderCustomsEntity;
import org.jeecgframework.web.system.person.entity.jeecg.OrderMainEntity;
import org.jeecgframework.web.system.person.entity.jeecg.OrderProductEntity;
import org.jeecgframework.web.system.person.page.jeecg.OrderMainPage;
import org.jeecgframework.web.system.person.service.jeecg.OrderMainServiceI;
import org.jeecgframework.web.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**   
 * @Title: Controller
 * @Description: 订单主数据
 * @author zhangdaihao
 * @date 2014-10-23 14:53:31
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/orderMainController")
public class OrderMainController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(OrderMainController.class);

	@Autowired
	private OrderMainServiceI orderMainService;
	@Autowired
	private SystemService systemService;
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	/**
	 * 订单主数据列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "orderMain")
	public ModelAndView orderMain(HttpServletRequest request) {
		return new ModelAndView("system/person/jeecg/orderMainList");
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
	public void datagrid(OrderMainEntity orderMain,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(OrderMainEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, orderMain);
		this.orderMainService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除订单主数据
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(OrderMainEntity orderMain, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		orderMain = systemService.getEntity(OrderMainEntity.class, orderMain.getId());
		message = "删除成功";
		orderMainService.delete(orderMain);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加订单主数据
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(OrderMainEntity orderMain,OrderMainPage orderMainPage, HttpServletRequest request) {
		List<OrderCustomsEntity> orderCustomsList =  orderMainPage.getOrderCustomsList();
		List<OrderProductEntity> orderProductList =  orderMainPage.getOrderProductList();
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(orderMain.getId())) {
			message = "更新成功";
			orderMainService.updateMain(orderMain, orderCustomsList,orderProductList);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} else {
			message = "添加成功";
			orderMainService.addMain(orderMain, orderCustomsList,orderProductList);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 订单主数据列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(OrderMainEntity orderMain, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(orderMain.getId())) {
			orderMain = orderMainService.getEntity(OrderMainEntity.class, orderMain.getId());
			req.setAttribute("orderMainPage", orderMain);
		}
		return new ModelAndView("system/person/jeecg/orderMain");
	}
	
	
	/**
	 * 加载明细列表[订单客户明细]
	 * 
	 * @return
	 */
	@RequestMapping(params = "orderCustomsList")
	public ModelAndView orderCustomsList(OrderMainEntity orderMain, HttpServletRequest req) {
	
		//===================================================================================
		//获取参数
		Object id0 = orderMain.getId();
		Object goOrderCode0 = orderMain.getGoOrderCode();
		//===================================================================================
		//查询-订单客户明细
	    String hql0 = "from OrderCustomsEntity where 1 = 1 AND id = ?  AND goOrderCode = ? ";
		try{
		    List<OrderCustomsEntity> orderCustomsEntityList = systemService.findHql(hql0,id0,goOrderCode0);
			req.setAttribute("orderCustomsList", orderCustomsEntityList);
		}catch(Exception e){
			logger.info(e.getMessage());
		}
		return new ModelAndView("system/person/jeecg/orderCustomsList");
	}
	/**
	 * 加载明细列表[订单产品明细]
	 * 
	 * @return
	 */
	@RequestMapping(params = "orderProductList")
	public ModelAndView orderProductList(OrderMainEntity orderMain, HttpServletRequest req) {
	
		//===================================================================================
		//获取参数
		Object id1 = orderMain.getId();
		Object goOrderCode1 = orderMain.getGoOrderCode();
		//===================================================================================
		//查询-订单产品明细
	    String hql1 = "from OrderProductEntity where 1 = 1 AND id = ?  AND goOrderCode = ? ";
		try{
		    List<OrderProductEntity> orderProductEntityList = systemService.findHql(hql1,id1,goOrderCode1);
			req.setAttribute("orderProductList", orderProductEntityList);
		}catch(Exception e){
			logger.info(e.getMessage());
		}
		return new ModelAndView("system/person/jeecg/orderProductList");
	}
	
	
}
