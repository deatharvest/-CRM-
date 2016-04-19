package com.business.inventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**   
 * @Title: Entity
 * @Description: 酒类库存
 * @author onlineGenerator
 * @date 2016-04-05 15:13:55
 * @version V1.0   
 *
 */
@Entity
@Table(name = "x_inventory", schema = "")
@SuppressWarnings("serial")
public class XInventoryEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**经销商ID*/
	private java.lang.String dealerId;
	/**酒ID*/
	private java.lang.String goodsId;
	/**数量*/
	private java.lang.String amount;

	/**保留字段*/
	private java.lang.String temp;
	
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
	 *@return: java.lang.String  经销商ID
	 */
	@Column(name ="DEALER_ID",nullable=true,length=36)
	public java.lang.String getDealerId(){
		return this.dealerId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  经销商ID
	 */
	public void setDealerId(java.lang.String dealerId){
		this.dealerId = dealerId;
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
	 *@return: java.lang.String  保留字段
	 */
	@Column(name ="TEMP",nullable=true)
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
}
