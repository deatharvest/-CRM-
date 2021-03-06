package com.business.goods.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**   
 * @Title: Entity
 * @Description: X商品信息
 * @author onlineGenerator
 * @date 2016-03-24 14:01:10
 * @version V1.0   
 *
 */
@Entity
@Table(name = "x_goods", schema = "")
@SuppressWarnings("serial")
public class XGoodsEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**商品名称*/
	private java.lang.String name;
	/**商品ID*/
	private java.lang.String goodsId;
	/**价格*/
	private java.lang.String price;
	/**录入日期*/
	private java.lang.String entryTime;
	
	/**新增字段*/
	private java.lang.String inventory;
	
	/**折后价格*/
	private String discountPrice;
	
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
	 *@return: java.lang.String  经销商名称
	 */
	@Column(name ="NAME",nullable=true)
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  经销商名称
	 */
	public void setName(java.lang.String name){
		this.name = name;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  商品ID
	 */
	@Column(name ="GOODS_ID",nullable=true)
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
	 *@return: java.lang.String  价格
	 */
	@Column(name ="PRICE",nullable=true)
	public java.lang.String getPrice(){
		return this.price;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  价格
	 */
	public void setPrice(java.lang.String price){
		this.price = price;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  录入时间
	 */
	@Column(name ="ENTRY_TIME",nullable=true)
	public java.lang.String getEntryTime(){
		return this.entryTime;
	}
	
	
	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  录入时间
	 */
	public void setEntryTime(java.lang.String entryTime){
		this.entryTime = entryTime;
	}

	/**
	 * 
	 * 方法: 取得java.lang.String
	 * @return: java.lang.String 新增字段
	 * 新增字段getter方法
	 * 
	 * 
	 */
	@Column(name = "INVENTORY",nullable=true)
	public java.lang.String getInventory(){
		return this.inventory;
	}

	public void setInventory(java.lang.String inventory){
		this.inventory = inventory;
	}

	
	@Column(name = "DISCOUNT_PRICE",nullable=true)
	public String getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(String discountPrice) {
		this.discountPrice = discountPrice;
	}

}
