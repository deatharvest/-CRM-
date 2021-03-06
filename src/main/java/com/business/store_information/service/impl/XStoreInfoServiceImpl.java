package com.business.store_information.service.impl;

import java.io.Serializable;
import java.util.UUID;

import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


//import com.business.customer.entity.TBCustomerEntity;
import com.business.store_information.service.XStoreInfoServiceI;

//import com.business.customer.service.TBCustomerServiceI;


import com.business.store_information.dao.XStoreDao;
import com.business.store_information.entity.XStoreInfoEntity;

//XStoreInfoEntity   改为   XStoreInfoEntity
//

@Service("xStoreInfoService")
@Transactional
public class XStoreInfoServiceImpl extends CommonServiceImpl implements XStoreInfoServiceI {

	@Autowired
	private XStoreDao xStoreDao;
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((XStoreInfoEntity)entity);
 	}
 	
 	public <T> Serializable save(T entity) {
 		Serializable t = super.save(entity);
 		//执行新增操作配置的sql增强
 		this.doAddSql((XStoreInfoEntity)entity);
 		return t;
 	}
 	
 	public <T> void saveOrUpdate(T entity) {
 		super.saveOrUpdate(entity);
 		//执行更新操作配置的sql增强
 		this.doUpdateSql((XStoreInfoEntity)entity);
 	}
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(XStoreInfoEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(XStoreInfoEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(XStoreInfoEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,XStoreInfoEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{store_id}",String.valueOf(t.getStoreId()));
 		sql  = sql.replace("#{store_name}",String.valueOf(t.getStoreName()));
 		sql  = sql.replace("#{address}",String.valueOf(t.getAddress()));
 		sql  = sql.replace("#{phone}",String.valueOf(t.getPhone()));
 		sql  = sql.replace("#{staus}",String.valueOf(t.getStaus()));
 		sql  = sql.replace("#{host_name}", String.valueOf(t.getHostName()));
 		
 		
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}

	@Override
	public XStoreInfoEntity getDealerID(String xStore) {
		// TODO Auto-generated method stub
		return xStoreDao.getDealerID(xStore);
	}

}