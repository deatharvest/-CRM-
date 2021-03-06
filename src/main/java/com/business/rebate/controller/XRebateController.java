package com.business.rebate.controller;
import java.util.List;

import javax.management.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.business.rebate.entity.XRebateEntity;
import com.business.rebate.entity.XRebateInfoEntity;
import com.business.rebate.page.XRebatePage;
import com.business.rebate.service.XRebateServiceI;
/**   
 * @Title: Controller
 * @Description: 返利表
 * @author onlineGenerator
 * @date 2016-04-11 17:16:27
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/xRebateController")
public class XRebateController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(XRebateController.class);

	@Autowired
	private XRebateServiceI xRebateService;
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
	 * 
	 */
	
	
	/**
	 * 安卓端获取返利信息
	 * 传入参数：attribute，vistorId，
	 * http://192.168.2.187:8080/jeecg-framework/xRebateController.do?getRebate&attribute=store&vistorId=1
	 */
	@RequestMapping(params = "getRebate")
	@ResponseBody
	public JSONObject getRebate(HttpServletRequest request,HttpServletResponse response) {
		//获取传入参数
		String attribute = request.getParameter("attribute");
		String vistorId = request.getParameter("vistorId");
		//查询订单表的temp，若为已收货，则返回返利信息，否则返回null
		
		JSONObject jsonObject =xRebateService.queryRebate(attribute,vistorId);
		return jsonObject;
	}
	
	
	
	

	/**
	 * 返利表列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "xRebate")
	public ModelAndView xRebate(HttpServletRequest request) {
		return new ModelAndView("business/rebate/xRebateList");
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
	public void datagrid(XRebateEntity xRebate,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(XRebateEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, xRebate);
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.xRebateService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除返利表
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(XRebateEntity xRebate, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		xRebate = systemService.getEntity(XRebateEntity.class, xRebate.getId());
		message = "返利表删除成功";
		try{
			xRebateService.delMain(xRebate);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "返利表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 批量删除返利表
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		AjaxJson j = new AjaxJson();
		message = "返利表删除成功";
		try{
			for(String id:ids.split(",")){
				XRebateEntity xRebate = systemService.getEntity(XRebateEntity.class,
				id
				);
				xRebateService.delMain(xRebate);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "返利表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 添加返利表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(XRebateEntity xRebate,XRebatePage xRebatePage, HttpServletRequest request) {
		List<XRebateInfoEntity> xRebateInfoList =  xRebatePage.getXRebateInfoList();
		AjaxJson j = new AjaxJson();
		message = "添加成功";
		try{
			xRebateService.addMain(xRebate, xRebateInfoList);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "返利表添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	/**
	 * 更新返利表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(XRebateEntity xRebate,XRebatePage xRebatePage, HttpServletRequest request) {
		List<XRebateInfoEntity> xRebateInfoList =  xRebatePage.getXRebateInfoList();
		AjaxJson j = new AjaxJson();
		message = "更新成功";
		try{
			xRebateService.updateMain(xRebate, xRebateInfoList);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "更新返利表失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 返利表新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(XRebateEntity xRebate, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(xRebate.getId())) {
			xRebate = xRebateService.getEntity(XRebateEntity.class, xRebate.getId());
			req.setAttribute("xRebatePage", xRebate);
		}
		return new ModelAndView("business/rebate/xRebate-add");
	}
	
	/**
	 * 返利表编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(XRebateEntity xRebate, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(xRebate.getId())) {
			xRebate = xRebateService.getEntity(XRebateEntity.class, xRebate.getId());
			req.setAttribute("xRebatePage", xRebate);
		}
		return new ModelAndView("business/rebate/xRebate-update");
	}
	
	
	/**
	 * 加载明细列表[返利详情]
	 * 
	 * @return
	 */
	@RequestMapping(params = "xRebateInfoList")
	public ModelAndView xRebateInfoList(XRebateEntity xRebate, HttpServletRequest req) {
	
		//===================================================================================
		//获取参数
		Object id0 = xRebate.getId();
		//===================================================================================
		//查询-返利详情
	    String hql0 = "from XRebateInfoEntity where 1 = 1 AND fCK_ID = ? ";
	    try{
	    	List<XRebateInfoEntity> xRebateInfoEntityList = systemService.findHql(hql0,id0);
			req.setAttribute("xRebateInfoList", xRebateInfoEntityList);
		}catch(Exception e){
			logger.info(e.getMessage());
		}
		return new ModelAndView("business/rebateinfo/xRebateInfoList");
	}
	
}
