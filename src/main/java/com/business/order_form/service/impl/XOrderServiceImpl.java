package com.business.order_form.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.business.goods.service.XGoodsServiceI;
import com.business.inventory.entity.XInventoryEntity;
import com.business.inventory.service.XInventoryServiceI;
import com.business.orderNumberGenerator.service.OrderNumberGeneratorI;
import com.business.order_form.dao.XOrderDao;
import com.business.order_form.entity.XOrderEntity;
import com.business.order_form.service.XOrderServiceI;
import com.business.rebate.service.XRebateServiceI;

@Service("xOrderService")
@Transactional
public class XOrderServiceImpl extends CommonServiceImpl implements XOrderServiceI {
	
	@Autowired
	private XInventoryServiceI xInventoryService;
	@Autowired
	private OrderNumberGeneratorI orderNumberGenerator;
	@Autowired
	private XOrderDao xOrderDao;
	@Autowired
	private XGoodsServiceI xGoodsServiceI;
	@Autowired
	private XRebateServiceI xRebateServiceI;
	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((XOrderEntity)entity);
 	}
 	
 	public <T> Serializable save(T entity) {
 		Serializable t = super.save(entity);
 		//执行新增操作配置的sql增强
 		this.doAddSql((XOrderEntity)entity);
 		return t;
 	}
 	
 	public <T> void saveOrUpdate(T entity) {
 		super.saveOrUpdate(entity);
 		//执行更新操作配置的sql增强
 		this.doUpdateSql((XOrderEntity)entity);
 	}
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(XOrderEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(XOrderEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(XOrderEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,XOrderEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{attribute}",String.valueOf(t.getAttribute()));
 		sql  = sql.replace("#{gmzid}",String.valueOf(t.getGmzid()));
 		sql  = sql.replace("#{gysid}",String.valueOf(t.getGysid()));
 		sql  = sql.replace("#{order_number}",String.valueOf(t.getOrderNumber()));
 		sql  = sql.replace("#{goods_id}",String.valueOf(t.getGoodsId()));
 		sql  = sql.replace("#{amount}",String.valueOf(t.getAmount()));
 		sql  = sql.replace("#{status}",String.valueOf(t.getStatus()));
 		sql  = sql.replace("#{date}",String.valueOf(t.getDate()));
 		sql  = sql.replace("#{temp}",String.valueOf(t.getTemp()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
 	
 	
 	
 	/**
 	 * 门店下订单
 	 */
 	public JSONObject dealOrder(String attribute,String storeId,JSONArray goodsArray){
		JSONObject jsonTemp = new JSONObject();		
		JSONObject returnJsonObject = new JSONObject();
		JSONArray returnArray =new JSONArray();
		XOrderEntity xOrderEntity;
		long totalPrice = 0;
		
		for (int i = 0; i < goodsArray.size(); i++) {
			//根据goodsId查询价格
			JSONObject j1  =  goodsArray.getJSONObject(i);
			String goodsId = j1.getString("goodsId");//获得商品ID
			String amount = j1.getString("amount");//获得商品数量
			totalPrice = Integer.parseInt(amount)*xGoodsServiceI.getPriceByGoodsId(goodsId,attribute)+totalPrice;
		}
		
		
		
		//生成订单号
		String orderNumber = orderNumberGenerator.getOrderNumber();
		for (int i = 0; i < goodsArray.size(); i++) {
			xOrderEntity = new XOrderEntity();
			//---------------------------------------->
			//设置订单号
			xOrderEntity.setOrderNumber(orderNumber);
			//为实体赋值	属性  和  购买者ID
			xOrderEntity.setAttribute(attribute);
			xOrderEntity.setGmzid(storeId);
			xOrderEntity.setTemp(totalPrice+"");
			JSONObject j1  =  goodsArray.getJSONObject(i);
			String goodsId = j1.getString("goodsId");//获得商品ID
			String amount = j1.getString("amount");//获得商品数量
			
			//添加单个商品的售价
			long price = 0;
			price = Integer.parseInt(amount)*xGoodsServiceI.getPriceByGoodsId(goodsId,attribute);
			xOrderEntity.setPrice(price+"");
			
			//选择经销商，此处应有方法
			choiceDealer(xOrderEntity);		
			xOrderEntity.setGoodsId(goodsId);//判断商品ID
			xOrderEntity.setAmount(amount);//设置购买量	

			//更新该经销商库存
			if(attribute.equals("dealer")){
				updateDealerInventoryForDealer(xOrderEntity);
			}else if(attribute.equals("store")){
				updateDealerInventory(xOrderEntity);
			}else{
				System.out.println("未正确传递attribute");
			}

			//设置订单状态
			xOrderEntity.setStatus("待确认");		

			//生成时间
			xOrderEntity.setDate(new Date());			
			//刷新到数据表
			saveOrUpdate(xOrderEntity);
			jsonTemp = xOrderEntity.receiveJsonObject();
			returnArray.add(jsonTemp);////////////////////////////////
			if(i==goodsArray.size()-1){
				returnJsonObject.put("attribute", xOrderEntity.getAttribute());
				returnJsonObject.put("gmzid", xOrderEntity.getGmzid());
				returnJsonObject.put("gysid", xOrderEntity.getGysid());
				returnJsonObject.put("orderNumber", xOrderEntity.getOrderNumber());
				returnJsonObject.put("date", xOrderEntity.getDate());
				returnJsonObject.put("status", xOrderEntity.getStatus());
			}
		}
		//返利
		double rebateRate = 0.025;
		long rebatePrice = (long) (totalPrice*rebateRate);
		xRebateServiceI.calculateRebate(attribute, storeId, "王迪小店", orderNumber,
				new Date(), String.valueOf(totalPrice), String.valueOf(rebatePrice),String.valueOf(rebateRate));
		
		System.out.println(totalPrice);
		returnJsonObject.put("goods", returnArray);	
		returnJsonObject.put("totalPrice", totalPrice+"");
		
		if(attribute.equals("dealer")){
			
			returnJsonObject.put("discountPrice",totalPrice*0.8+"" );
		}
		
		System.out.println(returnJsonObject.toJSONString());
		return returnJsonObject;
 	}
 	
 	/**
 	 * 经销商向厂商下订单
 	 */
 	public JSONObject dealOrderForDealer(String attribute,String storeId,JSONArray goodsArray){
		JSONObject jsonTemp = new JSONObject();		
		JSONObject returnJsonObject = new JSONObject();
		JSONArray returnArray =new JSONArray();
		XOrderEntity xOrderEntity;
		long totalPrice = 0;
		
		//生成订单号
		String orderNumber = orderNumberGenerator.getOrderNumber();
		for (int i = 0; i < goodsArray.size(); i++) {
			xOrderEntity = new XOrderEntity();
			//---------------------------------------->
			//设置订单号
			xOrderEntity.setOrderNumber(orderNumber);
			//为实体赋值	属性  和  购买者ID
			xOrderEntity.setAttribute(attribute);
			xOrderEntity.setGmzid(storeId);
			JSONObject j1  =  goodsArray.getJSONObject(i);
			String goodsId = j1.getString("goodsId");//获得商品ID
			String amount = j1.getString("amount");//获得商品数量

			//添加单个商品的售价
			long price = 0;
			price = Integer.parseInt(amount)*xGoodsServiceI.getPriceByGoodsId(goodsId,attribute);
			xOrderEntity.setPrice(price+"");
			
			//选择经销商，此处应有方法
			choiceDealer(xOrderEntity);		
			xOrderEntity.setGoodsId(goodsId);//判断商品ID
			xOrderEntity.setAmount(amount);//设置购买量	
			//根据goodsId查询价格

			totalPrice = Integer.parseInt(amount)*xGoodsServiceI.getPriceByGoodsId(goodsId,attribute)+totalPrice;
			xOrderEntity.setTemp(totalPrice+"");
			//更新该经销商库存
			updateDealerInventoryForDealer(xOrderEntity);
			
			//设置订单状态
			xOrderEntity.setStatus("待收货");		

			//生成时间
			xOrderEntity.setDate(new Date());			
			//刷新到数据表
			saveOrUpdate(xOrderEntity);
			jsonTemp = xOrderEntity.receiveJsonObject();
			returnArray.add(jsonTemp);////////////////////////////////
			if(i==goodsArray.size()-1){
				returnJsonObject.put("attribute", xOrderEntity.getAttribute());
				returnJsonObject.put("gmzid", xOrderEntity.getGmzid());
				returnJsonObject.put("gysid", xOrderEntity.getGysid());
				returnJsonObject.put("orderNumber", xOrderEntity.getOrderNumber());
				returnJsonObject.put("date", xOrderEntity.getDate());
				returnJsonObject.put("status", xOrderEntity.getStatus());
			}
		}
		System.out.println(totalPrice);
		returnJsonObject.put("goods", returnArray);	
		returnJsonObject.put("totalPrice", totalPrice);
		System.out.println(returnJsonObject.toJSONString());
		
		double rebateRate = 0.05;
		long rebatePrice = (long) (totalPrice*rebateRate);
		xRebateServiceI.calculateRebate(attribute, storeId, "舒豪杰总代理", orderNumber,
				new Date(), String.valueOf(totalPrice), String.valueOf(rebatePrice),String.valueOf(rebateRate));
		
		
		return returnJsonObject;
 	}	
 	
 	
 	
 	/**
 	 * 执行经销商库存扣除
 	 * @param xOrderEntity
 	 */
 	private void updateDealerInventory(XOrderEntity xOrderEntity) {
		// TODO Auto-generated method stub
 		String dealerID = xOrderEntity.getGysid() ;
 		String goodsID = xOrderEntity.getGoodsId();
 		//购买量
 		Long amount = Long.parseLong(xOrderEntity.getAmount()); 
 		//得到经销商当前库存，根据
 		List<XInventoryEntity> list = xInventoryService.getInventoryByDoubleID(dealerID, goodsID);
 		XInventoryEntity xInventoryEntity = list.get(0);
 		Long inventory = Long.parseLong(xInventoryEntity.getAmount());
 		inventory = inventory - amount;
 		if(inventory<0){
 			System.out.println("");
 		}
 		
 		xInventoryEntity.setAmount(inventory + "");
 		//刷新经销商库存
 		xInventoryService.saveOrUpdate(xInventoryEntity);

		
	}

 	
 	/**
 	 * 执行经销商库存扣除
 	 * @param xOrderEntity
 	 */
 	private void updateDealerInventoryForDealer(XOrderEntity xOrderEntity) {
		// TODO Auto-generated method stub
 		String dealerID = xOrderEntity.getGysid() ;
 		String goodsID = xOrderEntity.getGoodsId();
 		//购买量
 		Long amount = Long.parseLong(xOrderEntity.getAmount()); 
 		//得到经销商当前库存，根据
 		List<XInventoryEntity> list = xInventoryService.getInventoryByDoubleID(dealerID, goodsID);
 		XInventoryEntity xInventoryEntity = list.get(0);
 		Long inventory = Long.parseLong(xInventoryEntity.getAmount());
 		inventory = inventory + amount;
 		if(inventory<0){
 			System.out.println("");
 		}
 		
 		xInventoryEntity.setAmount(inventory + "");
 		//刷新经销商库存
 		xInventoryService.saveOrUpdate(xInventoryEntity);

		
	}
	public JSONArray packageOrder(String vistorId,String orderNumber,String status,String attribute){
		
			
		/*
		 *   	经销商ID，订单号，返回该订单信息
		 *  	传经销商ID，订单号，status，则修改该订单status，返回修改后的订单信息
		 */

		
 		JSONArray returnArray =new JSONArray();
		if(orderNumber!=null&&vistorId!=null){
			//获取订单实体
			List<XOrderEntity> list = xOrderDao.getOrderByOrderNumber(orderNumber);
					//super.findByProperty(XOrderEntity.class, "orderNumber", orderNumber);
			
			for (XOrderEntity xOrderEntity : list) {
				//循环遍历订单实体，判断是否修改status
				String temp;
				if(status!=null){
					if(status.equals("needAffirm")){
						temp = "待确认";
					}else if(status.equals("needSend")){
						temp = "待发货";
					}else if(status.equals("needReceipt")){
						temp = "待收货";
					}else if(status.equals("receipted")){
						temp = "已收货";	
					}else{
						temp = "英文不匹配！";
					}
					xOrderEntity.setStatus(temp);
					//刷新数据库
					saveOrUpdate(xOrderEntity);
				}
				//生成返回的JSON
				returnArray.add(xOrderEntity.receiveJsonObject());
			}
			//返回对象
			JSONObject returnJsonObject = new JSONObject();
			//设定格式
			XOrderEntity xOrderEntity = new XOrderEntity();
			xOrderEntity = list.get(0);
			String totalPrice = xOrderEntity.getTemp();
			returnJsonObject.put("attribute", xOrderEntity.getAttribute());
			returnJsonObject.put("gmzid", xOrderEntity.getGmzid());
			returnJsonObject.put("gysid", xOrderEntity.getGysid());
			returnJsonObject.put("orderNumber", xOrderEntity.getOrderNumber());
			returnJsonObject.put("date", xOrderEntity.getDate());
			returnJsonObject.put("status", xOrderEntity.getStatus());
			returnJsonObject.put("goods", returnArray);
			returnJsonObject.put("totalPrice", totalPrice+"");
			JSONArray jsonArray = new JSONArray();
			jsonArray.add(0, returnJsonObject);
			
			return jsonArray;
			//

		}else if(vistorId!=null){
			//只传经销商ID
			
			//需要一个根据订单号进行订单状态修改的sql  saveOrUpdate   先来一个查询订单号的sql
			List<XOrderEntity> list = new ArrayList<XOrderEntity>();
					//
			if(attribute.equals("store")){
				//list = xOrderDao.getOrderByID(vistorId);
				 list = xOrderDao.getOrderByStoreID(vistorId);
			}else{
				 list = xOrderDao.getOrderByID(vistorId);
			}
			
			
			//获得该经销商id的订单信息后，得到订单号，再次sql，查找相同订单信息
			
			JSONObject infoObject = null;
			JSONArray goodsArray = null;
			JSONObject orderObject = null;
			String initlizeOrderNumber = "abc";
			for (XOrderEntity xOrderEntity : list) {
				//方法，传入xOrderEntity，判断订单号与上次是否相同

				if(xOrderEntity.getOrderNumber().equals(initlizeOrderNumber)){
					continue;
				}else{
					//不同,sql该订单号					
					infoObject = new JSONObject();
					goodsArray = new JSONArray();
					orderObject = new JSONObject();
					initlizeOrderNumber = xOrderEntity.getOrderNumber();
					
					List<XOrderEntity> listnew  = xOrderDao.getOrderByOrderNumber(initlizeOrderNumber);
					for (XOrderEntity xOrderEntityEqualOrderNumber : listnew) {
						infoObject = new JSONObject();
						infoObject = xOrderEntityEqualOrderNumber.receiveJsonObject();
						goodsArray.add(infoObject);
					}
					
					orderObject.put("orderNumber", initlizeOrderNumber);
					orderObject.put("attribute", xOrderEntity.getAttribute());
					orderObject.put("gmzid", xOrderEntity.getGmzid());
					orderObject.put("gysid", xOrderEntity.getGysid());
					orderObject.put("status", xOrderEntity.getStatus());
					orderObject.put("date", xOrderEntity.getDate());
					orderObject.put("totalPrice", xOrderEntity.getTemp());
					orderObject.put("goods", goodsArray);
				}
					
				returnArray.add(orderObject);

				
			}				
			return returnArray;
			
		}else{
			System.out.println("查询或修改订单传递参数错误！");
			return null;
		}
 	}
 	
 	public void choiceDealer(XOrderEntity xOrderEntity){
 		String DealerID = "0001";
 		xOrderEntity.setGysid(DealerID);
 		
 	}
 	
 	
 	
}