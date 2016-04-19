package com.business.orderNumberGenerator.service;

import org.jeecgframework.core.common.service.CommonService;


public interface OrderNumberGeneratorI extends CommonService{
	
	/**
	 * 生成订单号
	 * @return
	 */
	public String getOrderNumber();
}
