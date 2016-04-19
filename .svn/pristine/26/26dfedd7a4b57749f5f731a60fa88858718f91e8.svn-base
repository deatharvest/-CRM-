package com.business.orderNumberGenerator.dao;

import org.jeecgframework.minidao.annotation.MiniDao;
import org.jeecgframework.minidao.annotation.ResultType;
import org.jeecgframework.minidao.annotation.Sql;

import com.business.order_form.entity.XOrderEntity;

@MiniDao
public interface OrderNumberGeneratorDao {

	@Sql("SELECT * FROM x_order ORDER BY id DESC LIMIT 1")
	@ResultType("com.business.order_form.entity.XOrderEntity")
	public XOrderEntity getLastOrderNumber();
}
	