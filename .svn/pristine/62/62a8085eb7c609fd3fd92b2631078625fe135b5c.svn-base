package com.business.store_information.controller;

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

//import com.business.customer.entity.TBCustomerEntity;
//import com.business.customer.service.TBCustomerServiceI;


import com.business.store_information.entity.XStoreInfoEntity;
import com.business.store_information.service.XStoreInfoServiceI;

//XStoreInfo
//xStoreInfo






@Controller
@RequestMapping("/xStoreInfoController")
public class XStoreInfoController extends BaseController{
	
	private static final Logger logger = Logger.getLogger(XStoreInfoController.class);
	
	@Autowired
	private XStoreInfoServiceI xStoreInfoService;
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
	 * 门店信息列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "xStoreInfo")
	public ModelAndView xStoreInfo(HttpServletRequest request) {
		return new ModelAndView("business/xStoreInfo/xStoreInfoList");
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
	public void datagrid(XStoreInfoEntity xStoreInfo,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(XStoreInfoEntity.class, dataGrid);
		//cq.eq("customerName", keyvalue);
		//cq.like("customerName", "%"+keyvalue+"%");
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, xStoreInfo, request.getParameterMap());
		try{
		//自定义追加查询条件
			
			
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.xStoreInfoService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

/**
 * 删除x经销商信息
 * 
 * @return
 */
@RequestMapping(params = "doDel")
@ResponseBody
public AjaxJson doDel(XStoreInfoEntity xStoreInfo, HttpServletRequest request) {
	AjaxJson j = new AjaxJson();
	xStoreInfo = systemService.getEntity(XStoreInfoEntity.class, xStoreInfo.getId());
	message = "x经销商信息删除成功";
	try{
		xStoreInfoService.delete(xStoreInfo);
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
	 * 批量删除
	 * 
	 * @return
	 */
	@RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		AjaxJson j = new AjaxJson();
		message = "门店信息删除成功";
		try{
			for(String id:ids.split(",")){
				XStoreInfoEntity xStoreInfo= systemService.getEntity(XStoreInfoEntity.class, 
				id
				);
				xStoreInfoService.delete(xStoreInfo);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "门店信息删除失败";
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
	public AjaxJson doAdd(XStoreInfoEntity xStoreInfo, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		message = "门店信息添加成功";
		try{
			xStoreInfoService.save(xStoreInfo);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "门店信息添加失败";
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
	public AjaxJson doUpdate(XStoreInfoEntity xStoreInfo, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		message = "门店信息更新成功";
		XStoreInfoEntity t = xStoreInfoService.get(XStoreInfoEntity.class, xStoreInfo.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(xStoreInfo, t);
			xStoreInfoService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "门店信息更新失败";
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
	public ModelAndView goAdd(XStoreInfoEntity xStoreInfo, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(xStoreInfo.getId())) {
			xStoreInfo = xStoreInfoService.getEntity(XStoreInfoEntity.class, xStoreInfo.getId());
			req.setAttribute("xStoreInfoPage", xStoreInfo);
		}
		return new ModelAndView("business/xStoreInfo/xStoreInfo-add");
	}
	/**
	 * 门店信息编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(XStoreInfoEntity xStoreInfo, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(xStoreInfo.getId())) {
			xStoreInfo = xStoreInfoService.getEntity(XStoreInfoEntity.class, xStoreInfo.getId());
			req.setAttribute("xStoreInfoPage", xStoreInfo);
		}
		return new ModelAndView("business/xStoreInfo/xStoreInfo-update");
	}
}
