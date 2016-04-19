package com.business.store_information.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



//将XStoreInfoEntity   改为  XStoreInfoEntity
//将x_store_info         改为   x_store_info
//将

/**   
 * @Title: Entity
 * @Description: x经销商信息
 * @author onlineGenerator
 * @date 2016-03-24 14:01:10
 * @version V1.0   
 *
 */
@Entity
@Table(name = "x_store_info", schema = "")
@SuppressWarnings("serial")
public class XStoreInfoEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**门店ID*/
	private String storeId;

	/**店名称*/
	private java.lang.String storeName;
	/**地址*/
	private java.lang.String address;
	/**店主名*/
	private java.lang.String hostName;	
	/**联系电话*/
	private java.lang.String phone;
	/**门店状态*/
	private java.lang.String staus;
	
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
	
	@Column(name ="STORE_ID",nullable=true)
	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  门店名称
	 */
	@Column(name ="STORE_NAME",nullable=true)
	public java.lang.String getStoreName(){
		return this.storeName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  门店名称
	 */
	public void setStoreName(java.lang.String storeName){
		this.storeName = storeName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  地址
	 */
	@Column(name ="ADDRESS",nullable=true)
	public java.lang.String getAddress(){
		return this.address;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  地址
	 */
	public void setAddress(java.lang.String address){
		this.address = address;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  联系电话
	 */
	@Column(name ="PHONE",nullable=true)
	public java.lang.String getPhone(){
		return this.phone;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  联系电话
	 */
	public void setPhone(java.lang.String phone){
		this.phone = phone;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  状态
	 */
	@Column(name ="STAUS",nullable=true)
	public String getStaus(){
		return this.staus;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  状态
	 */
	public void setStaus(java.lang.String staus){
		this.staus = staus;
	}
	
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  店主名
	 */
	@Column(name ="HOST_NAME",nullable=true)
	public String getHostName(){
		return this.hostName;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  状态
	 */
	public void setHostName(String hostName){
		this.hostName = hostName;
	}
}
