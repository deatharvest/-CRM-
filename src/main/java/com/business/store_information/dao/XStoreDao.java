package com.business.store_information.dao;

import org.jeecgframework.minidao.annotation.Arguments;
import org.jeecgframework.minidao.annotation.MiniDao;
import org.jeecgframework.minidao.hibernate.MiniDaoSupportHiber;

import com.business.store_information.entity.XStoreInfoEntity;
@MiniDao
public interface XStoreDao extends MiniDaoSupportHiber<XStoreInfoEntity>{
	
	@Arguments("xStore")
	public XStoreInfoEntity getDealerID(String xStore);

}
