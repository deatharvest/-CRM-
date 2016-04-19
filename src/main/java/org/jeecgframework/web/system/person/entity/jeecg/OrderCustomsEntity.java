package org.jeecgframework.web.system.person.entity.jeecg;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;

/**   
 * @Title: Entity
 * @Description: 订单客户明细
 * @author zhangdaihao
 * @date 2014-10-23 14:53:29
 * @version V1.0   
 *
 */
@Entity
@Table(name = "jeecg_order_custom", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class OrderCustomsEntity implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**createDt*/
	private java.util.Date createDt;
	/**crtuser*/
	private java.lang.String crtuser;
	/**crtuserName*/
	private java.lang.String crtuserName;
	/**delDt*/
	private java.util.Date delDt;
	/**delflag*/
	private java.lang.Integer delflag;
	/**goOrderCode*/
	private java.lang.String goOrderCode;
	/**gocBussContent*/
	private java.lang.String gocBussContent;
	/**gocContent*/
	private java.lang.String gocContent;
	/**gocCusName*/
	private java.lang.String gocCusName;
	/**gocIdcard*/
	private java.lang.String gocIdcard;
	/**gocPassportCode*/
	private java.lang.String gocPassportCode;
	/**gocSex*/
	private java.lang.String gocSex;
	/**modifier*/
	private java.lang.String modifier;
	/**modifierName*/
	private java.lang.String modifierName;
	/**modifyDt*/
	private java.util.Date modifyDt;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  id
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=false,length=32)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  id
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  createDt
	 */
	@Column(name ="CREATE_DT",nullable=true)
	public java.util.Date getCreateDt(){
		return this.createDt;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  createDt
	 */
	public void setCreateDt(java.util.Date createDt){
		this.createDt = createDt;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  crtuser
	 */
	@Column(name ="CRTUSER",nullable=true,length=12)
	public java.lang.String getCrtuser(){
		return this.crtuser;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  crtuser
	 */
	public void setCrtuser(java.lang.String crtuser){
		this.crtuser = crtuser;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  crtuserName
	 */
	@Column(name ="CRTUSER_NAME",nullable=true,length=10)
	public java.lang.String getCrtuserName(){
		return this.crtuserName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  crtuserName
	 */
	public void setCrtuserName(java.lang.String crtuserName){
		this.crtuserName = crtuserName;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  delDt
	 */
	@Column(name ="DEL_DT",nullable=true)
	public java.util.Date getDelDt(){
		return this.delDt;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  delDt
	 */
	public void setDelDt(java.util.Date delDt){
		this.delDt = delDt;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  delflag
	 */
	@Column(name ="DELFLAG",nullable=true,precision=10,scale=0)
	public java.lang.Integer getDelflag(){
		return this.delflag;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  delflag
	 */
	public void setDelflag(java.lang.Integer delflag){
		this.delflag = delflag;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  goOrderCode
	 */
	@Column(name ="GO_ORDER_CODE",nullable=false,length=12)
	public java.lang.String getGoOrderCode(){
		return this.goOrderCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  goOrderCode
	 */
	public void setGoOrderCode(java.lang.String goOrderCode){
		this.goOrderCode = goOrderCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  gocBussContent
	 */
	@Column(name ="GOC_BUSS_CONTENT",nullable=true,length=33)
	public java.lang.String getGocBussContent(){
		return this.gocBussContent;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  gocBussContent
	 */
	public void setGocBussContent(java.lang.String gocBussContent){
		this.gocBussContent = gocBussContent;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  gocContent
	 */
	@Column(name ="GOC_CONTENT",nullable=true,length=66)
	public java.lang.String getGocContent(){
		return this.gocContent;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  gocContent
	 */
	public void setGocContent(java.lang.String gocContent){
		this.gocContent = gocContent;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  gocCusName
	 */
	@Column(name ="GOC_CUS_NAME",nullable=true,length=16)
	public java.lang.String getGocCusName(){
		return this.gocCusName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  gocCusName
	 */
	public void setGocCusName(java.lang.String gocCusName){
		this.gocCusName = gocCusName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  gocIdcard
	 */
	@Column(name ="GOC_IDCARD",nullable=true,length=18)
	public java.lang.String getGocIdcard(){
		return this.gocIdcard;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  gocIdcard
	 */
	public void setGocIdcard(java.lang.String gocIdcard){
		this.gocIdcard = gocIdcard;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  gocPassportCode
	 */
	@Column(name ="GOC_PASSPORT_CODE",nullable=true,length=10)
	public java.lang.String getGocPassportCode(){
		return this.gocPassportCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  gocPassportCode
	 */
	public void setGocPassportCode(java.lang.String gocPassportCode){
		this.gocPassportCode = gocPassportCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  gocSex
	 */
	@Column(name ="GOC_SEX",nullable=true,length=255)
	public java.lang.String getGocSex(){
		return this.gocSex;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  gocSex
	 */
	public void setGocSex(java.lang.String gocSex){
		this.gocSex = gocSex;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  modifier
	 */
	@Column(name ="MODIFIER",nullable=true,length=12)
	public java.lang.String getModifier(){
		return this.modifier;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  modifier
	 */
	public void setModifier(java.lang.String modifier){
		this.modifier = modifier;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  modifierName
	 */
	@Column(name ="MODIFIER_NAME",nullable=true,length=10)
	public java.lang.String getModifierName(){
		return this.modifierName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  modifierName
	 */
	public void setModifierName(java.lang.String modifierName){
		this.modifierName = modifierName;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  modifyDt
	 */
	@Column(name ="MODIFY_DT",nullable=true)
	public java.util.Date getModifyDt(){
		return this.modifyDt;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  modifyDt
	 */
	public void setModifyDt(java.util.Date modifyDt){
		this.modifyDt = modifyDt;
	}
}
