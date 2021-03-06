package com.business.inventory.controller;
import java.util.ArrayList;
import java.util.List;

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
import com.business.inventory.dao.XInventoryDao;
import com.business.inventory.entity.XInventoryEntity;
import com.business.inventory.service.XInventoryServiceI;

/**   
 * @Title: Controller
 * @Description: 酒类库存
 * @author onlineGenerator
 * @date 2016-04-05 15:13:55
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/xInventoryController")
public class XInventoryController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(XInventoryController.class);

	@Autowired
	private XInventoryServiceI xInventoryService;
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
 * 经销商酒类库存查询
 * @param request
 * @param response
 * @return
 */
	@RequestMapping(params = "queryInventory")
	@ResponseBody
	public JSONArray queryInventory(HttpServletRequest request, HttpServletResponse response){

		return xInventoryService.queryInventory("0001");
		
	}
	
	
	/**
	 * 酒类库存列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "xInventory")
	public ModelAndView xInventory(HttpServletRequest request) {
		return new ModelAndView("business/inventory/xInventoryList");
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
	public void datagrid(XInventoryEntity xInventory,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(XInventoryEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, xInventory, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.xInventoryService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除酒类库存
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(XInventoryEntity xInventory, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		xInventory = systemService.getEntity(XInventoryEntity.class, xInventory.getId());
		message = "酒类库存删除成功";
		try{
			xInventoryService.delete(xInventory);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "酒类库存删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除酒类库存
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		AjaxJson j = new AjaxJson();
		message = "酒类库存删除成功";
		try{
			for(String id:ids.split(",")){
				XInventoryEntity xInventory = systemService.getEntity(XInventoryEntity.class, 
				id
				);
				xInventoryService.delete(xInventory);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "酒类库存删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加酒类库存
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(XInventoryEntity xInventory, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		message = "酒类库存添加成功";
		try{
			xInventoryService.save(xInventory);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "酒类库存添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新酒类库存
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(XInventoryEntity xInventory, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		message = "酒类库存更新成功";
		XInventoryEntity t = xInventoryService.get(XInventoryEntity.class, xInventory.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(xInventory, t);
			xInventoryService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "酒类库存更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 酒类库存新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(XInventoryEntity xInventory, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(xInventory.getId())) {
			xInventory = xInventoryService.getEntity(XInventoryEntity.class, xInventory.getId());
			req.setAttribute("xInventoryPage", xInventory);
		}
		return new ModelAndView("business/inventory/xInventory-add");
	}
	/**
	 * 酒类库存编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(XInventoryEntity xInventory, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(xInventory.getId())) {
			xInventory = xInventoryService.getEntity(XInventoryEntity.class, xInventory.getId());
			req.setAttribute("xInventoryPage", xInventory);
		}
		return new ModelAndView("business/inventory/xInventory-update");
	}
}
