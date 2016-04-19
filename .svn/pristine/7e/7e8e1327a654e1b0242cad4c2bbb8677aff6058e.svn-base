package com.business.order_form.dao;

import java.util.List;

import org.jeecgframework.minidao.annotation.Arguments;
import org.jeecgframework.minidao.annotation.MiniDao;
import org.jeecgframework.minidao.annotation.ResultType;
import org.jeecgframework.minidao.hibernate.MiniDaoSupportHiber;

import com.business.order_form.entity.XOrderEntity;



@MiniDao
public interface XOrderDao extends MiniDaoSupportHiber<XOrderEntity>{
	
	@Arguments("vistorId")
	@ResultType("com.business.order_form.entity.XOrderEntity")
	public List<XOrderEntity> getOrderByStoreID(String vistorId);
	
	@Arguments("vistorId")
	@ResultType("com.business.order_form.entity.XOrderEntity")
	public List<XOrderEntity> getOrderByID(String vistorId);
	
	
	@Arguments("orderNumber")
	@ResultType("com.business.order_form.entity.XOrderEntity")
	public List<XOrderEntity> getOrderByOrderNumber(String orderNumber);


}


