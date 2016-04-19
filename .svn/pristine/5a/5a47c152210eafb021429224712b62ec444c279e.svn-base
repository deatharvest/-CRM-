package com.business.inventory.dao;

import java.util.List;

import org.jeecgframework.minidao.annotation.Arguments;
import org.jeecgframework.minidao.annotation.MiniDao;
import org.jeecgframework.minidao.annotation.ResultType;
import org.jeecgframework.minidao.hibernate.MiniDaoSupportHiber;

import com.business.inventory.entity.XInventoryEntity;
@MiniDao
public interface XInventoryDao extends MiniDaoSupportHiber<XInventoryEntity> {
	
	@Arguments("dealerId")
	@ResultType("com.business.inventory.entity.XInventoryEntity")
	public List<XInventoryEntity> getInventoryByID(String dealerId);
	
	@Arguments({"dealerId","goodsId"})
	@ResultType("com.business.inventory.entity.XInventoryEntity")
	public List<XInventoryEntity> getInventoryByDoubleID(String dealerId,String goodsId);
}
