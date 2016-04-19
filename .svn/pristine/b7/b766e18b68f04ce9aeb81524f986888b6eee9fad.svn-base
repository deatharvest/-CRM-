package com.business.notice.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;

/**   
 * @Title: Entity
 * @Description: 公告
 * @author onlineGenerator
 * @date 2016-04-04 14:57:51
 * @version V1.0   
 *
 */
@Entity
@Table(name = "x_notice", schema = "")
@SuppressWarnings("serial")
public class XNoticeEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**发布时间*/
	private java.util.Date issuedTime;
	/**新闻属性*/
	private java.lang.String attribute;
	/**标题*/
	private java.lang.String title;
	/**作者*/
	private java.lang.String author;
	/**内容*/
	private java.lang.String msg;
	
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
	 *@return: java.lang.String  发布时间
	 */
	@Column(name ="ISSUED_TIME",nullable=true,length=50)
	public java.util.Date getIssuedTime(){
		return this.issuedTime;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  发布时间
	 */
	public void setIssuedTime(java.util.Date issuedTime){
		this.issuedTime = issuedTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  新闻属性
	 */
	@Column(name ="ATTRIBUTE",nullable=true,length=50)
	public java.lang.String getAttribute(){
		return this.attribute;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  新闻属性
	 */
	public void setAttribute(java.lang.String attribute){
		this.attribute = attribute;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  标题
	 */
	@Column(name ="TITLE",nullable=true,length=50)
	public java.lang.String getTitle(){
		return this.title;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  标题
	 */
	public void setTitle(java.lang.String title){
		this.title = title;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  作者
	 */
	@Column(name ="AUTHOR",nullable=true,length=50)
	public java.lang.String getAuthor(){
		return this.author;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  作者
	 */
	public void setAuthor(java.lang.String author){
		this.author = author;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  内容
	 */
	@Column(name ="MSG",nullable=true,length=2000)
	public java.lang.String getMsg(){
		return this.msg;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  内容
	 */
	public void setMsg(java.lang.String msg){
		this.msg = msg;
	}
}
