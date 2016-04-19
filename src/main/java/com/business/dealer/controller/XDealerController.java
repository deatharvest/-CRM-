package com.business.dealer.controller;
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

import com.alibaba.fastjson.JSONObject;
import com.business.dealer.entity.XDealerEntity;
import com.business.dealer.service.XDealerServiceI;

/**
 * 1.xDealer   XDealer
 * XDealerServicel
 * 
 * 
 * 
 * 
 * 
 * 
 */
@Controller
@RequestMapping("/xDealerController")

public class XDealerController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(XDealerController.class);

	@Autowired
	private XDealerServiceI xDealerService;
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
	 * x经销商信息列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "xDealer")
	public ModelAndView xDealer(HttpServletRequest request) {
		return new ModelAndView("business/xDealer/xDealerList");
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
	public void datagrid(XDealerEntity xDealer,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(XDealerEntity.class, dataGrid);
		//cq.eq("xDealerName", keyvalue);
		//cq.like("xDealerName", "%"+keyvalue+"%");
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, xDealer, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.xDealerService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}	
	//测试
	/**
	 * 删除x经销商信息
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(XDealerEntity xDealer, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		xDealer = systemService.getEntity(XDealerEntity.class, xDealer.getId());
		message = "x经销商信息删除成功";
		try{
			xDealerService.delete(xDealer);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "x经销商信息删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	
	/**
	 * 批量删除x经销商信息
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		AjaxJson j = new AjaxJson();
		message = "x经销商信息删除成功";
		try{
			for(String id:ids.split(",")){
				XDealerEntity xDealer = systemService.getEntity(XDealerEntity.class, 
				id
				);
				xDealerService.delete(xDealer);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "x经销商信息删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加x经销商信息
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(XDealerEntity xDealer, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		message = "x经销商信息添加成功";
		try{
			xDealerService.save(xDealer);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "x经销商信息添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新x经销商信息
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(XDealerEntity xDealer, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		message = "x经销商信息更新成功";
		XDealerEntity t = xDealerService.get(XDealerEntity.class, xDealer.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(xDealer, t);
			xDealerService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "x经销商信息更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * x经销商信息新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(XDealerEntity xDealer, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(xDealer.getId())) {
			xDealer = xDealerService.getEntity(XDealerEntity.class, xDealer.getId());
			req.setAttribute("xDealerPage", xDealer);
		}
		return new ModelAndView("business/xDealer/xDealer-add");
	}
	/**
	 * x经销商信息编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(XDealerEntity xDealer, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(xDealer.getId())) {
			xDealer = xDealerService.getEntity(XDealerEntity.class, xDealer.getId());
			req.setAttribute("xDealerPage", xDealer);
		}
		return new ModelAndView("business/xDealer/xDealer-update");
	}
	


	
	
	
	
}
