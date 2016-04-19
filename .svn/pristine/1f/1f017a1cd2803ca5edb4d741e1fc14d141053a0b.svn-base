package com.business.dealer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * x_dealer	
 */



/**   
 * @Title: Entity
 * @Description: x经销商信息
 * @author onlineGenerator
 * @date 2016-03-24 14:01:10
 * @version V1.0   
 *
 */

@Entity
@Table(name = "x_dealer", schema = "")
@SuppressWarnings("serial")

public class XDealerEntity implements java.io.Serializable {
	
	/**主键*/
	private java.lang.String id;
	/**经销商ID*/
	private java.lang.String dealerId;
	/**经销商名称*/
	private java.lang.String dealerName;
	/**地址*/
	private java.lang.String address;
	/**联系电话*/
	private java.lang.String phone;
	/**状态*/
	private java.lang.Integer status;
	
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=false,length=36)	
	public java.lang.String getId() {
		return id;
	}
	
	
	public void setId(java.lang.String id) {
		this.id = id;
	}
	/*
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  经销商名称
	 */
	@Column(name ="Dealer_NAME",nullable=true)	
	public java.lang.String getDealerName() {
		return dealerName;
	}
	public void setDealerName(java.lang.String dealerName) {
		this.dealerName = dealerName;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  地址
	 */
	@Column(name ="ADDRESS",nullable=true)	
	public java.lang.String getAddress() {
		return address;
	}
	public void setAddress(java.lang.String address) {
		this.address = address;
	}
	
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  联系电话
	 */
	@Column(name ="PHONE",nullable=true)	
	public java.lang.String getPhone() {
		return phone;
	}
	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}
	
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  状态
	 */
	@Column(name ="STATUS",nullable=true)
	public java.lang.Integer getStatus() {
		return status;
	}
	public void setStatus(java.lang.Integer status) {
		this.status = status;
	}

	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  状态
	 */
	@Column(name ="DEALER_ID",nullable=true)
	public java.lang.String getDealerId() {
		return dealerId;
	}


	public void setDealerId(java.lang.String dealerId) {
		this.dealerId = dealerId;
	}
	
	
	
}
