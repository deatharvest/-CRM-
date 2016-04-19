package com.business.goods.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
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
import com.business.goods.entity.XGoodsEntity;
import com.business.goods.service.XGoodsServiceI;
import com.business.inventory.entity.XInventoryEntity;
import com.business.inventory.service.XInventoryServiceI;
import com.business.store_information.entity.XStoreInfoEntity;
import com.business.store_information.service.XStoreInfoServiceI;

/**   
 * @Title: Controller
 * @Description: 商品信息
 * @author onlineGenerator
 * @date 2016-03-24 14:01:10
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/xGoodsController")
public class XGoodsController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(XGoodsController.class);

	@Autowired
	private XGoodsServiceI xGoodsService;
	@Autowired
	private SystemService systemService;
	private String message;
	@Autowired
	private XStoreInfoServiceI xStoreInfoServiceI;
	@Autowired
	private XInventoryServiceI xInventoryServiceI;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	/**
	 *商品信息列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "xGoods")
	public ModelAndView xGoods(HttpServletRequest request) {
	return new ModelAndView("business/goods/xGoodsList");
	}
	
	
	/**
	 * 门店安卓设备获取商品信息
	 * xGoodsController.do?getXGoods
	 * 
	 */
	@RequestMapping(params = "getXGoods")
	@ResponseBody
	public JSONArray getXGoods(HttpServletRequest request,HttpServletResponse response){
		List<XGoodsEntity> list=xGoodsService.getALLEntities(new XGoodsEntity());
		for (XGoodsEntity xGoodsEntity : list) {
			String inventory;
			//根据vistorID获得经销商ID
			
			//王迪为啥vistorID给我传的是1
			String vistorId = request.getParameter("vistorId");
			if(vistorId==null){
				vistorId = "1";
				System.out.println("未输入vistorId");
			}
			XStoreInfoEntity xStoreInfoEntity =  xStoreInfoServiceI.getDealerID(vistorId);
			String dealerId = xStoreInfoEntity.getStaus();
	//		String dealerId = xStoreInfoServiceI.getDealerID(vistorId)+"";
	//		String dealerId = "0001";
			String goodsId = xGoodsEntity.getGoodsId();
			//根据经销商ID和商品ID，查询库存
			List<XInventoryEntity> temp = xInventoryServiceI.getInventoryByDoubleID(dealerId, goodsId);
	 		XInventoryEntity xInventoryEntity = temp.get(0);
	 		
			xGoodsEntity.setInventory(xInventoryEntity.getAmount());
		}
		JSONArray js = new JSONArray();
		js.addAll(list);
		System.out.println("安卓设备获取商品信息");
		return js;
		
	}
	
	/**
	 * 经销商安卓设备获取商品信息
	 * xGoodsController.do?getXGoodsForDealer
	 * 
	 */
	@RequestMapping(params = "getXGoodsForDealer")
	@ResponseBody
	public JSONArray getXGoodsForDealer(HttpServletRequest request,HttpServletResponse response){
		List<XGoodsEntity> list=xGoodsService.getALLEntities(new XGoodsEntity());
		JSONArray js = new JSONArray();
		js.addAll(list);
		System.out.println("安卓设备获取商品信息");
		return js;
		
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
	public void datagrid(XGoodsEntity xGoodsEntity,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(XGoodsEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, xGoodsEntity, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.xGoodsService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除x经销商信息
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(XGoodsEntity xGoodsEntity, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		xGoodsEntity = systemService.getEntity(XGoodsEntity.class, xGoodsEntity.getId());
		message = "商品信息删除成功";
		try{
			xGoodsService.delete(xGoodsEntity);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "商品信息删除失败";
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
		message = "商品信息删除成功";
		try{
			for(String id:ids.split(",")){
				XGoodsEntity xGoodsEntity = systemService.getEntity(XGoodsEntity.class, 
				id
				);
				xGoodsService.delete(xGoodsEntity);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "商品信息删除失败";
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
	public AjaxJson doAdd(XGoodsEntity xGoodsEntity, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		message = "商品信息添加成功";
		try{
			xGoodsService.save(xGoodsEntity);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "商品信息添加失败";
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
	public AjaxJson doUpdate(XGoodsEntity xGoodsEntity, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		message = "商品信息更新成功";
		XGoodsEntity t = xGoodsService.get(XGoodsEntity.class, xGoodsEntity.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(xGoodsEntity, t);
			xGoodsService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "商品信息更新失败";
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
	public ModelAndView goAdd(XGoodsEntity xGoodsEntity, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(xGoodsEntity.getId())) {
			xGoodsEntity = xGoodsService.getEntity(XGoodsEntity.class, xGoodsEntity.getId());
			req.setAttribute("xGoodsPage", xGoodsEntity);
		}
		return new ModelAndView("business/goods/xGoods-add");
	}
	/**
	 * x经销商信息编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(XGoodsEntity xGoodsEntity, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(xGoodsEntity.getId())) {
			xGoodsEntity = xGoodsService.getEntity(XGoodsEntity.class, xGoodsEntity.getId());
			req.setAttribute("xGoodsPage", xGoodsEntity);
		}
		return new ModelAndView("business/goods/xGoods-update");
	}
}
