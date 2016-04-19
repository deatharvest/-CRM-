package com.business.orderNumberGenerator.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.business.orderNumberGenerator.service.OrderNumberGeneratorI;
import com.business.orderNumberGenerator.service.impl.OrderNumberGeneratorImpl;

@Controller
@RequestMapping("/OrderNumberGeneratorController")
public class OrderNumberGeneratorController {

	@Autowired
	private OrderNumberGeneratorI orderNumberGenerator;
	
	/**
	 * OrderNumberGeneratorController.do?getOrderNumber
	 */
	@RequestMapping(params = "getOrderNumber")
	@ResponseBody
	public void getOrderNumber(HttpServletResponse response){
		String orderNumber;
		orderNumber = orderNumberGenerator.getOrderNumber();
		System.out.println(orderNumber);
	}
	
	public String getOrderNumber(){
		String orderNumber;
		orderNumber = orderNumberGenerator.getOrderNumber();
		return orderNumber;
	}
}
