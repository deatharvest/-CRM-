package com.business.orderNumberGenerator.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.business.orderNumberGenerator.dao.OrderNumberGeneratorDao;
import com.business.orderNumberGenerator.service.OrderNumberGeneratorI;
import com.business.order_form.entity.XOrderEntity;

@Service("OrderNumberGeneratorImpl")
@Transactional
public class OrderNumberGeneratorImpl extends CommonServiceImpl implements OrderNumberGeneratorI{

	@Autowired
	private OrderNumberGeneratorDao orderNumberGenerator;
	
	private String enptyOrderNumber = "0000000000000";
	private String orderNumber;
	
	/**
	 * 获取生成的订单号
	 * @return
	 * orderNumberGenerator.do?getOrderNumber
	 */
	@Override
	public String getOrderNumber(){
		
		Long orderNumberByLong;
		Date currentTime = new Date();
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyyMMdd");
		
		//把从数据库获得的最后一条订单的订单号取出来
		orderNumber = this.getLastOrderNumberBySql();
		//转换成等值的long类型，方便用于自增
		orderNumberByLong = Long.valueOf(orderNumber);
		//对数值进行操作，获得新的订单自增数据段
		orderNumberByLong = orderNumberByLong % 10000 + 1;
		//调整订单自增数据段
		if(!this.isTodayOrder(orderNumber.substring(0,8), currentTime)){
			orderNumber = "0000";
		}
		else{
			//格式化订单编号后四位
			orderNumber = String.format("%04d", orderNumberByLong);
		}


		//拼接获得最终订单号
		orderNumber = dateFormater.format(currentTime.getTime()) + orderNumber;
		
		System.out.println("This is the number you want: " + orderNumber);
		return orderNumber;
	}
	
	
	public String getLastOrderNumberBySql(){
		XOrderEntity xOrderEntity = new XOrderEntity();
		if(orderNumberGenerator.getLastOrderNumber()==null){
			return enptyOrderNumber;
		}else{
			xOrderEntity = orderNumberGenerator.getLastOrderNumber();
			System.out.println("getOrderNumber: " + xOrderEntity.getOrderNumber());
			return xOrderEntity.getOrderNumber();
		}
	}
	
	public boolean isTodayOrder(String orderTime, Date currentTime){
		String timeString;
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyyMMdd");
		timeString = dateFormater.format(currentTime);
		if(timeString.equals(orderTime))
			return true;
		else
			return false;
	}
	
	public static void main(String args []) {
		String codeString = "201504048404";
		long orderNumberByLong = Long.valueOf(codeString);
		System.out.println(orderNumberByLong % 10000 + 1);
	}

}
