package com.business.rebate.dao;

import org.jeecgframework.minidao.annotation.Arguments;
import org.jeecgframework.minidao.annotation.MiniDao;
import org.jeecgframework.minidao.annotation.ResultType;
import org.jeecgframework.minidao.hibernate.MiniDaoSupportHiber;

import com.business.rebate.entity.XRebateEntity;
import com.business.rebate.page.XRebatePage;

@MiniDao
public interface RebateDao extends MiniDaoSupportHiber<XRebateEntity>{
	
	@Arguments({"vistorId","attribute"})
	@ResultType("com.business.rebate.entity.XRebateInfoEntity.XRebatePage")
	public XRebatePage getRebate(String vistorId,String attribute);
	
	
	@Arguments({"vistorId","attribute"})
	@ResultType("com.business.rebate.entity.XRebateEntity")
	public XRebateEntity getXRebateEntity(String vistorId,String attribute);
}
