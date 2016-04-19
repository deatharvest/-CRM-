package com.business.notice.controller;

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
import com.business.notice.entity.XNoticeEntity;
import com.business.notice.service.XNoticeServiceI;

@Controller
@RequestMapping("/xNoticeController")
public class XNoticeController extends BaseController {
	
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(XNoticeController.class);

	@Autowired
	private XNoticeServiceI xNoticeService;
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
	 * 安卓设备获取商品信息
	 * xGoodsController.do?getXGoods
	 * 
	 */
	@RequestMapping(params = "getNotice")
	@ResponseBody
	public JSONArray getXGoods1(HttpServletRequest request,HttpServletResponse response){
		List<XNoticeEntity> list=xNoticeService.getALLEntities(new XNoticeEntity());
		for (XNoticeEntity notice:list) {
			System.out.println(notice.getAttribute());
		}
		System.out.println("安卓设备访问公告信息");
		JSONArray js = new JSONArray();
		js.addAll(list);
		return js;
		
	}
	/**
	 * 公告列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "xNotice")
	public ModelAndView xNotice(HttpServletRequest request) {
		return new ModelAndView("business/xNotice/xNoticeList");
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
	public void datagrid(XNoticeEntity xNotice,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(XNoticeEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, xNotice, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.xNoticeService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除公告
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(XNoticeEntity xNotice, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		xNotice = systemService.getEntity(XNoticeEntity.class, xNotice.getId());
		message = "公告删除成功";
		try{
			xNoticeService.delete(xNotice);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "公告删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除公告
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		AjaxJson j = new AjaxJson();
		message = "公告删除成功";
		try{
			for(String id:ids.split(",")){
				XNoticeEntity xNotice = systemService.getEntity(XNoticeEntity.class, 
				id
				);
				xNoticeService.delete(xNotice);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "公告删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加公告
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(XNoticeEntity xNotice, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		message = "公告添加成功";
		try{
			xNoticeService.save(xNotice);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "公告添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新公告
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(XNoticeEntity xNotice, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		message = "公告更新成功";
		XNoticeEntity t = xNoticeService.get(XNoticeEntity.class, xNotice.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(xNotice, t);
			xNoticeService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "公告更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 公告新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(XNoticeEntity xNotice, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(xNotice.getId())) {
			xNotice = xNoticeService.getEntity(XNoticeEntity.class, xNotice.getId());
			req.setAttribute("xNoticePage", xNotice);
		}
		return new ModelAndView("business/xNotice/xNotice-add");
	}
	/**
	 * 公告编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(XNoticeEntity xNotice, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(xNotice.getId())) {
			xNotice = xNoticeService.getEntity(XNoticeEntity.class, xNotice.getId());
			req.setAttribute("xNoticePage", xNotice);
		}
		return new ModelAndView("business/xNotice/xNotice-update");
	}

	
}

