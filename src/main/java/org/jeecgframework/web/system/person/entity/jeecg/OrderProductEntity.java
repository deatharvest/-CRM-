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
 * @Description: 订单产品明细
 * @author zhangdaihao
 * @date 2014-10-23 14:53:29
 * @version V1.0   
 *
 */
@Entity
@Table(name = "jeecg_order_product", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class OrderProductEntity implements java.io.Serializable {
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
	/**gopContent*/
	private java.lang.String gopContent;
	/**gopCount*/
	private java.lang.Integer gopCount;
	/**gopOnePrice*/
	private BigDecimal gopOnePrice;
	/**gopProductName*/
	private java.lang.String gopProductName;
	/**gopProductType*/
	private java.lang.String gopProductType;
	/**gopSumPrice*/
	private BigDecimal gopSumPrice;
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
	 *@return: java.lang.String  gopContent
	 */
	@Column(name ="GOP_CONTENT",nullable=true,length=66)
	public java.lang.String getGopContent(){
		return this.gopContent;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  gopContent
	 */
	public void setGopContent(java.lang.String gopContent){
		this.gopContent = gopContent;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  gopCount
	 */
	@Column(name ="GOP_COUNT",nullable=true,precision=10,scale=0)
	public java.lang.Integer getGopCount(){
		return this.gopCount;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  gopCount
	 */
	public void setGopCount(java.lang.Integer gopCount){
		this.gopCount = gopCount;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  gopOnePrice
	 */
	@Column(name ="GOP_ONE_PRICE",nullable=true,precision=10,scale=2)
	public BigDecimal getGopOnePrice(){
		return this.gopOnePrice;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  gopOnePrice
	 */
	public void setGopOnePrice(BigDecimal gopOnePrice){
		this.gopOnePrice = gopOnePrice;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  gopProductName
	 */
	@Column(name ="GOP_PRODUCT_NAME",nullable=true,length=33)
	public java.lang.String getGopProductName(){
		return this.gopProductName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  gopProductName
	 */
	public void setGopProductName(java.lang.String gopProductName){
		this.gopProductName = gopProductName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  gopProductType
	 */
	@Column(name ="GOP_PRODUCT_TYPE",nullable=false,length=1)
	public java.lang.String getGopProductType(){
		return this.gopProductType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  gopProductType
	 */
	public void setGopProductType(java.lang.String gopProductType){
		this.gopProductType = gopProductType;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  gopSumPrice
	 */
	@Column(name ="GOP_SUM_PRICE",nullable=true,precision=10,scale=2)
	public BigDecimal getGopSumPrice(){
		return this.gopSumPrice;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  gopSumPrice
	 */
	public void setGopSumPrice(BigDecimal gopSumPrice){
		this.gopSumPrice = gopSumPrice;
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
