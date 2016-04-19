package com.business.order_form.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.alibaba.fastjson.JSONObject;

/**   
 * @Title: Entity
 * @Description: 订单
 * @author onlineGenerator
 * @date 2016-04-05 22:42:28
 * @version V1.0   
 *
 */
@Entity
@Table(name = "x_order", schema = "")
@SuppressWarnings("serial")
public class XOrderEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**属性*/
	private java.lang.String attribute;
	/**购买者ID*/
	private java.lang.String gmzid;
	/**供应商ID*/
	private java.lang.String gysid;
	/**订单号*/
	private java.lang.String orderNumber;
	/**商品ID*/
	private java.lang.String goodsId;
	/**商品数量*/
	private String amount;
	
//	/**五粮特区*/
//	private java.lang.String wltq;
//	/**金坛玉液*/
//	private java.lang.String jtyy;
//	/**金剑南*/
//	private java.lang.String jjn;
	
	/**订单状态*/
	private java.lang.String status;
	/**订单时间*/
	private java.util.Date date;
	/**保留字段*/
	private java.lang.String temp;
	
	/**单个商品价格*/
	private String price;
	
	
	

	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=false,length=36)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  属性
	 */
	@Column(name ="ATTRIBUTE",nullable=true,length=36)
	public java.lang.String getAttribute(){
		return this.attribute;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  属性
	 */
	public void setAttribute(java.lang.String attribute){
		this.attribute = attribute;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  购买者ID
	 */
	@Column(name ="GMZID",nullable=true,length=36)
	public java.lang.String getGmzid(){
		return this.gmzid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  购买者ID
	 */
	public void setGmzid(java.lang.String gmzid){
		this.gmzid = gmzid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  供应商ID
	 */
	@Column(name ="GYSID",nullable=true,length=36)
	public java.lang.String getGysid(){
		return this.gysid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  供应商ID
	 */
	public void setGysid(java.lang.String gysid){
		this.gysid = gysid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单号
	 */
	@Column(name ="ORDER_NUMBER",nullable=true,length=36)
	public java.lang.String getOrderNumber(){
		return this.orderNumber;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单号
	 */
	public void setOrderNumber(java.lang.String orderNumber){
		this.orderNumber = orderNumber;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  商品ID
	 */
	@Column(name ="GOODS_ID",nullable=true,length=200)
	public java.lang.String getGoodsId(){
		return this.goodsId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  商品ID
	 */
	public void setGoodsId(java.lang.String goodsId){
		this.goodsId = goodsId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  商品数量
	 */
	@Column(name ="AMOUNT",nullable=true,length=200)
	public java.lang.String getAmount(){
		return this.amount;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  商品数量
	 */
	public void setAmount(java.lang.String amount){
		this.amount = amount;
	}

	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单状态
	 */
	@Column(name ="STATUS",nullable=true,length=36)
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单状态
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  订单时间
	 */
	@Column(name ="DATE",nullable=true,length=36)
	public java.util.Date getDate(){
		return this.date;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  订单时间
	 */
	public void setDate(java.util.Date date){
		this.date = date;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  保留字段
	 */
	@Column(name ="TEMP",nullable=true,length=36)
	public java.lang.String getTemp(){
		return this.temp;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  保留字段
	 */
	public void setTemp(java.lang.String temp){
		this.temp = temp;
	}
	
	public JSONObject receiveJsonObject(){
		JSONObject jsonObject =new JSONObject();
		
		if(goodsId.equals("1")){
			jsonObject.put("name", "五粮特区");
			jsonObject.put("price",1499);
		}else if(goodsId.equals("2")){
			jsonObject.put("name", "金坛玉液");
			jsonObject.put("price",899);
		}else if(goodsId.equals("3")){
			jsonObject.put("name", "金剑南");
			jsonObject.put("price",299);
		}else{
			jsonObject.put("name", "error,goodsId error!");
		}
		
		jsonObject.put("goodsId", goodsId);
		jsonObject.put("amount", amount);
//		jsonObject.put("status", status);
//		jsonObject.put("date", date);
		return jsonObject;
		
		
	}

	@Override
	public String toString() {
		return "XOrderEntity [id=" + id + ", attribute=" + attribute
				+ ", gmzid=" + gmzid + ", gysid=" + gysid + ", orderNumber="
				+ orderNumber + ", goodsId=" + goodsId + ", amount=" + amount
				+ ", status=" + status + ", date=" + date + ", temp=" + temp
				+ "]";
	}

	public JSONObject receiveJsonObjectAddOrderNumber() {

		JSONObject jsonObject =new JSONObject();
		
		if(goodsId.equals("1")){
			jsonObject.put("name", "五粮特区");
			jsonObject.put("price",1499);
		}else if(goodsId.equals("2")){
			jsonObject.put("name", "金坛玉液");
			jsonObject.put("price",899);
		}else if(goodsId.equals("3")){
			jsonObject.put("name", "金剑南");
			jsonObject.put("price",299);
		}else{
			jsonObject.put("name", "error,goodsId error!");
		}
		
		jsonObject.put("goodsId", goodsId);
		jsonObject.put("amount", amount);
		return jsonObject;

	}
	
	/**
	 * 单个商品总价
	 * @return
	 */
	@Column(name ="PRICE",nullable=true,length=36)
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	
	
}
