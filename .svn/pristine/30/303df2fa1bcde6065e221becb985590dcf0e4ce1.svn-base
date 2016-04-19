package com.business.order_form.service;

import java.io.Serializable;

import org.jeecgframework.core.common.service.CommonService;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.business.order_form.entity.XOrderEntity;

public interface XOrderServiceI extends CommonService{
	
 	public <T> void delete(T entity);
 	
 	public <T> Serializable save(T entity);
 	
 	public <T> void saveOrUpdate(T entity);
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(XOrderEntity t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(XOrderEntity t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(XOrderEntity t);
 	
 	
 	public JSONObject dealOrder(String attribute,String storeId,JSONArray goodsArray);
 	
 	public JSONObject dealOrderForDealer(String attribute,String storeId,JSONArray goodsArray);
 	
 	public JSONArray packageOrder(String vistorId,String orderNumber,String status,String attribute); 
}
