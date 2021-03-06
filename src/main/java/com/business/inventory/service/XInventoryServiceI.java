package com.business.inventory.service;

import java.io.Serializable;
import java.util.List;

import org.jeecgframework.core.common.service.CommonService;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.business.inventory.entity.XInventoryEntity;

public interface XInventoryServiceI extends CommonService{
	
 	public <T> void delete(T entity);
 	
 	public <T> Serializable save(T entity);
 	
 	public <T> void saveOrUpdate(T entity);
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(XInventoryEntity t);
 	
 	public List<XInventoryEntity> getInventoryByID(String dealerid);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	
 	public List<XInventoryEntity> getInventoryByDoubleID(String dealerId,String goodsId);
 	public boolean doUpdateSql(XInventoryEntity t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(XInventoryEntity t);
 	
 	
 	public JSONArray queryInventory(String dealerId);
}
