package com.business.rebate.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.core.util.oConvertUtils;
import org.jeecgframework.web.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.business.rebate.dao.RebateDao;
import com.business.rebate.entity.XRebateEntity;
import com.business.rebate.entity.XRebateInfoEntity;
import com.business.rebate.service.XRebateServiceI;
@Service("xRebateService")
@Transactional
public class XRebateServiceImpl extends CommonServiceImpl implements XRebateServiceI {
	@Autowired
	private RebateDao rebateDao;
	@Autowired
	private SystemService systemService;
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((XRebateEntity)entity);
 	}
	
	public void addMain(XRebateEntity xRebate,
	        List<XRebateInfoEntity> xRebateInfoList){
			//保存主信息
			this.save(xRebate);
		
			/**保存-返利详情*/
			for(XRebateInfoEntity xRebateInfo:xRebateInfoList){
				//外键设置
				xRebateInfo.setFckId(xRebate.getId());
				this.save(xRebateInfo);
			}
			//执行新增操作配置的sql增强
 			this.doAddSql(xRebate);
	}

	
	public void updateMain(XRebateEntity xRebate,
	        List<XRebateInfoEntity> xRebateInfoList) {
		//保存主表信息
		this.saveOrUpdate(xRebate);
		//===================================================================================
		//获取参数
		Object id0 = xRebate.getId();
		//===================================================================================
		//1.查询出数据库的明细数据-返利详情
	    String hql0 = "from XRebateInfoEntity where 1 = 1 AND fCK_ID = ? ";
	    List<XRebateInfoEntity> xRebateInfoOldList = this.findHql(hql0,id0);
		//2.筛选更新明细数据-返利详情
		for(XRebateInfoEntity oldE:xRebateInfoOldList){
			boolean isUpdate = false;
				for(XRebateInfoEntity sendE:xRebateInfoList){
					//需要更新的明细数据-返利详情
					if(oldE.getId().equals(sendE.getId())){
		    			try {
							MyBeanUtils.copyBeanNotNull2Bean(sendE,oldE);
							this.saveOrUpdate(oldE);
						} catch (Exception e) {
							e.printStackTrace();
							throw new BusinessException(e.getMessage());
						}
						isUpdate= true;
		    			break;
		    		}
		    	}
	    		if(!isUpdate){
		    		//如果数据库存在的明细，前台没有传递过来则是删除-返利详情
		    		super.delete(oldE);
	    		}
	    		
			}
			//3.持久化新增的数据-返利详情
			for(XRebateInfoEntity xRebateInfo:xRebateInfoList){
				if(oConvertUtils.isEmpty(xRebateInfo.getId())){
					//外键设置
					xRebateInfo.setFckId(xRebate.getId());
					this.save(xRebateInfo);
				}
			}
		//执行更新操作配置的sql增强
 		this.doUpdateSql(xRebate);
	}

	
	public void delMain(XRebateEntity xRebate) {
		//删除主表信息
		this.delete(xRebate);
		//===================================================================================
		//获取参数
		Object id0 = xRebate.getId();
		//===================================================================================
		//删除-返利详情
	    String hql0 = "from XRebateInfoEntity where 1 = 1 AND fCK_ID = ? ";
	    List<XRebateInfoEntity> xRebateInfoOldList = this.findHql(hql0,id0);
		this.deleteAllEntitie(xRebateInfoOldList);
	}
	
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(XRebateEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(XRebateEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(XRebateEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,XRebateEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{attribute}",String.valueOf(t.getAttribute()));
 		sql  = sql.replace("#{vistor_id}",String.valueOf(t.getVistorId()));
 		sql  = sql.replace("#{name}",String.valueOf(t.getName()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}



	@Override
	public XRebateEntity getXRebateEntity(String vistorId, String attribute) {
		// TODO Auto-generated method stub
		XRebateEntity xRebateEntity = rebateDao.getXRebateEntity(vistorId, attribute);
		return xRebateEntity;
	}

	@Override
	public JSONObject queryRebate(String attribute, String vistorId) {
		
		List<XRebateInfoEntity> xRebateInfoEntityList = null;
		XRebateEntity xRebate = getXRebateEntity(vistorId,attribute);
	    JSONObject jsonObject = new JSONObject();
	    JSONArray jsonArray = new JSONArray();
		if(xRebate != null){
			//===================================================================================
			//获取参数
			Object id0 = xRebate.getId();
			//===================================================================================
			//查询-返利详情
		    String hql0 = "from XRebateInfoEntity where 1 = 1 AND fCK_ID = ? ";
		    xRebateInfoEntityList = systemService.findHql(hql0,id0);
		    jsonArray.addAll(xRebateInfoEntityList);
		}
	    jsonObject.put("rebate", jsonArray);
		return jsonObject;

		
		
	}

	@Override
	public void calculateRebate(String attribute, String vistorId, String name,
			String orderNumber, Date date, String totalPrice,
			String rebatePrice, String rebateRate) {
		//查询vistorID
		
		
			XRebateEntity xRebateEntity;
			xRebateEntity = getXRebateEntity(vistorId,attribute);
			if(xRebateEntity==null){
				xRebateEntity = new XRebateEntity();
				xRebateEntity.setAttribute(attribute);
				xRebateEntity.setVistorId(vistorId);
				xRebateEntity.setName(name);
			}
			this.saveOrUpdate(xRebateEntity);
			
			//
			XRebateInfoEntity xRebateInfoEntity = new XRebateInfoEntity();
			xRebateInfoEntity.setDate(date);
			xRebateInfoEntity.setFckId(xRebateEntity.getId());
			xRebateInfoEntity.setOrderNumber(orderNumber);
			xRebateInfoEntity.setRebatePrice(rebatePrice);
			xRebateInfoEntity.setTotalPrice(totalPrice);
			xRebateInfoEntity.setRebateRate(rebateRate);
			
			this.saveOrUpdate(xRebateInfoEntity);
			
		
	};
}