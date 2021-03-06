package com.business.rebate.service;

import java.util.Date;
import java.util.List;

import org.jeecgframework.core.common.service.CommonService;

import com.alibaba.fastjson.JSONObject;
import com.business.rebate.entity.XRebateEntity;
import com.business.rebate.entity.XRebateInfoEntity;

public interface XRebateServiceI extends CommonService{
	
 	public <T> void delete(T entity);
	/**
	 * 添加一对多
	 * 
	 */
	public void addMain(XRebateEntity xRebate,
	        List<XRebateInfoEntity> xRebateInfoList) ;
	/**
	 * 修改一对多
	 * 
	 */
	public void updateMain(XRebateEntity xRebate,
	        List<XRebateInfoEntity> xRebateInfoList);
	public void delMain (XRebateEntity xRebate);
	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(XRebateEntity t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(XRebateEntity t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(XRebateEntity t);
 	
 	/**
 	 * 通过vistorId和attribute 获得实体
 	 * 
 	 */
 	public XRebateEntity getXRebateEntity(String vistorId,String attribute);
 	
	public JSONObject queryRebate(String attribute, String vistorId);
	
	/**
	 * 下单时调用，生成返利信息
	 * @param attribute
	 * @param vistorId
	 * @param name
	 * @param orderNumber
	 * @param date
	 * @param totalPrice
	 * @param rebatePrice
	 * @param rebateRate
	 */
	public void calculateRebate(String attribute,String vistorId,String name,
			String orderNumber,Date date,String totalPrice,String rebatePrice,
			String rebateRate);
 	
}
