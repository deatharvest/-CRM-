package com.business.inventory.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.business.inventory.dao.XInventoryDao;
import com.business.inventory.entity.XInventoryEntity;
import com.business.inventory.service.XInventoryServiceI;

@Service("xInventoryService")
@Transactional
public class XInventoryServiceImpl extends CommonServiceImpl implements XInventoryServiceI {
	@Autowired
	private XInventoryDao xInventoryDao;
	
	
	
	/**
	 * http://localhost:8080/jeecg-framework/xInventoryController.do?getInventory
	 * @return
	 */

	public List<XInventoryEntity> getInventoryByID(String dealerid){
		List<XInventoryEntity> getter=xInventoryDao.getInventoryByID(dealerid); 
		return getter;
	}	
	
	public List<XInventoryEntity> getInventoryByDoubleID(String dealerId,String goodsId){
		List<XInventoryEntity> getterEntities =xInventoryDao.getInventoryByDoubleID(dealerId, goodsId);
		
		return getterEntities;
		
	}
	
	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((XInventoryEntity)entity);
 	}
 	
 	public <T> Serializable save(T entity) {
 		Serializable t = super.save(entity);
 		//执行新增操作配置的sql增强
 		this.doAddSql((XInventoryEntity)entity);
 		return t;
 	}
 	
 	public <T> void saveOrUpdate(T entity) {
 		super.saveOrUpdate(entity);
 		//执行更新操作配置的sql增强
 		this.doUpdateSql((XInventoryEntity)entity);
 	}
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(XInventoryEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(XInventoryEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(XInventoryEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,XInventoryEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{dealer_id}",String.valueOf(t.getDealerId()));
 		sql  = sql.replace("#{goods_id}",String.valueOf(t.getGoodsId()));
 		sql  = sql.replace("#{amount}",String.valueOf(t.getAmount()));
 		sql  = sql.replace("#{temp}",String.valueOf(t.getTemp()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}

 	
 	
	@Override
	public JSONArray queryInventory(String dealerId) {
		// TODO Auto-generated method stub
		JSONArray jsonArray = new JSONArray();
		JSONObject jsonObject = new JSONObject();
		List<XInventoryEntity> list = xInventoryDao.getInventoryByID(dealerId);
		jsonArray.addAll(list);
		
		return jsonArray;

	}
}