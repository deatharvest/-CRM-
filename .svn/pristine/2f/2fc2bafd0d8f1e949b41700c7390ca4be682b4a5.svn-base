package com.business.rebate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**   
 * @Title: Entity
 * @Description: 返利表
 * @author onlineGenerator
 * @date 2016-04-11 17:16:27
 * @version V1.0   
 *
 */
@Entity
@Table(name = "x_rebate", schema = "")
@SuppressWarnings("serial")
public class XRebateEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**attribute*/
	private java.lang.String attribute;
	/**ID*/
	private java.lang.String vistorId;
	/**名称*/
	private java.lang.String name;
	
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
	 *@return: java.lang.String  attribute
	 */
	@Column(name ="ATTRIBUTE",nullable=true)
	public java.lang.String getAttribute(){
		return this.attribute;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  attribute
	 */
	public void setAttribute(java.lang.String attribute){
		this.attribute = attribute;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  ID
	 */
	@Column(name ="VISTOR_ID",nullable=true)
	public java.lang.String getVistorId(){
		return this.vistorId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  ID
	 */
	public void setVistorId(java.lang.String vistorId){
		this.vistorId = vistorId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  名称
	 */
	@Column(name ="NAME",nullable=true)
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  名称
	 */
	public void setName(java.lang.String name){
		this.name = name;
	}
}
