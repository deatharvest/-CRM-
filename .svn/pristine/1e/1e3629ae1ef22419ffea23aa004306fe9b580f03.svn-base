package com.business.rebate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**   
 * @Title: Entity
 * @Description: 返利详情
 * @author onlineGenerator
 * @date 2016-04-11 17:16:27
 * @version V1.0   
 *
 */
@Entity
@Table(name = "x_rebate_info", schema = "")
@SuppressWarnings("serial")
public class XRebateInfoEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**外键关联*/
	private java.lang.String fckId;
	/**订单号*/
	private java.lang.String orderNumber;
	/**时间*/
	private java.util.Date date;
	/**总金额*/
	private java.lang.String totalPrice;
	/**返利金额*/
	private java.lang.String rebatePrice;
	/**饭利率*/
	private java.lang.String rebateRate;
	
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
	 *@return: java.lang.String  外键关联
	 */
	@Column(name ="FCK_ID",nullable=false,length=36)
	public java.lang.String getFckId(){
		return this.fckId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  外键关联
	 */
	public void setFckId(java.lang.String fckId){
		this.fckId = fckId;
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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  时间
	 */
	@Column(name ="DATE",nullable=true,length=36)
	public java.util.Date getDate(){
		return this.date;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  时间
	 */
	public void setDate(java.util.Date date){
		this.date = date;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  总金额
	 */
	@Column(name ="TOTAL_PRICE",nullable=true,length=200)
	public java.lang.String getTotalPrice(){
		return this.totalPrice;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  总金额
	 */
	public void setTotalPrice(java.lang.String totalPrice){
		this.totalPrice = totalPrice;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  返利金额
	 */
	@Column(name ="REBATE_PRICE",nullable=true,length=200)
	public java.lang.String getRebatePrice(){
		return this.rebatePrice;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  返利金额
	 */
	public void setRebatePrice(java.lang.String rebatePrice){
		this.rebatePrice = rebatePrice;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  饭利率
	 */
	@Column(name ="REBATE_RATE",nullable=true,length=36)
	public java.lang.String getRebateRate(){
		return this.rebateRate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  饭利率
	 */
	public void setRebateRate(java.lang.String rebateRate){
		this.rebateRate = rebateRate;
	}
}
