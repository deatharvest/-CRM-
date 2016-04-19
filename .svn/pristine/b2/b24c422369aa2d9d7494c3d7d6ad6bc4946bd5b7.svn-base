package org.jeecgframework.web.system.person.page.jeecg;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.jeecgframework.web.system.person.entity.jeecg.OrderCustomsEntity;
import org.jeecgframework.web.system.person.entity.jeecg.OrderProductEntity;


/**   
 * @Title: Entity
 * @Description: 订单主数据
 * @author zhangdaihao
 * @date 2014-10-23 14:53:31
 * @version V1.0   
 *
 */
@Entity
@Table(name = "jeecg_order_main", schema = "")
@SuppressWarnings("serial")
public class OrderMainPage implements java.io.Serializable {
	/**保存-订单客户明细*/
	private List<OrderCustomsEntity> orderCustomsList = new ArrayList<OrderCustomsEntity>();
	@Transient
	public List<OrderCustomsEntity> getOrderCustomsList() {
		return orderCustomsList;
	}
	public void setOrderCustomsList(List<OrderCustomsEntity> orderCustomsList) {
		this.orderCustomsList = orderCustomsList;
	}
	/**保存-订单产品明细*/
	private List<OrderProductEntity> orderProductList = new ArrayList<OrderProductEntity>();
	@Transient
	public List<OrderProductEntity> getOrderProductList() {
		return orderProductList;
	}
	public void setOrderProductList(List<OrderProductEntity> orderProductList) {
		this.orderProductList = orderProductList;
	}


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
	/**goAllPrice*/
	private BigDecimal goAllPrice;
	/**goContactName*/
	private java.lang.String goContactName;
	/**goContent*/
	private java.lang.String goContent;
	/**goOrderCode*/
	private java.lang.String goOrderCode;
	/**goOrderCount*/
	private java.lang.Integer goOrderCount;
	/**goReturnPrice*/
	private BigDecimal goReturnPrice;
	/**goTelphone*/
	private java.lang.String goTelphone;
	/**goderType*/
	private java.lang.String goderType;
	/**modifier*/
	private java.lang.String modifier;
	/**modifierName*/
	private java.lang.String modifierName;
	/**modifyDt*/
	private java.util.Date modifyDt;
	/**usertype*/
	private java.lang.String usertype;
	
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
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  goAllPrice
	 */
	@Column(name ="GO_ALL_PRICE",nullable=true,precision=10,scale=2)
	public BigDecimal getGoAllPrice(){
		return this.goAllPrice;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  goAllPrice
	 */
	public void setGoAllPrice(BigDecimal goAllPrice){
		this.goAllPrice = goAllPrice;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  goContactName
	 */
	@Column(name ="GO_CONTACT_NAME",nullable=true,length=16)
	public java.lang.String getGoContactName(){
		return this.goContactName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  goContactName
	 */
	public void setGoContactName(java.lang.String goContactName){
		this.goContactName = goContactName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  goContent
	 */
	@Column(name ="GO_CONTENT",nullable=true,length=66)
	public java.lang.String getGoContent(){
		return this.goContent;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  goContent
	 */
	public void setGoContent(java.lang.String goContent){
		this.goContent = goContent;
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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  goOrderCount
	 */
	@Column(name ="GO_ORDER_COUNT",nullable=true,precision=10,scale=0)
	public java.lang.Integer getGoOrderCount(){
		return this.goOrderCount;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  goOrderCount
	 */
	public void setGoOrderCount(java.lang.Integer goOrderCount){
		this.goOrderCount = goOrderCount;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  goReturnPrice
	 */
	@Column(name ="GO_RETURN_PRICE",nullable=true,precision=10,scale=2)
	public BigDecimal getGoReturnPrice(){
		return this.goReturnPrice;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  goReturnPrice
	 */
	public void setGoReturnPrice(BigDecimal goReturnPrice){
		this.goReturnPrice = goReturnPrice;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  goTelphone
	 */
	@Column(name ="GO_TELPHONE",nullable=true,length=11)
	public java.lang.String getGoTelphone(){
		return this.goTelphone;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  goTelphone
	 */
	public void setGoTelphone(java.lang.String goTelphone){
		this.goTelphone = goTelphone;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  goderType
	 */
	@Column(name ="GODER_TYPE",nullable=true,length=255)
	public java.lang.String getGoderType(){
		return this.goderType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  goderType
	 */
	public void setGoderType(java.lang.String goderType){
		this.goderType = goderType;
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
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  usertype
	 */
	@Column(name ="USERTYPE",nullable=true,length=255)
	public java.lang.String getUsertype(){
		return this.usertype;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  usertype
	 */
	public void setUsertype(java.lang.String usertype){
		this.usertype = usertype;
	}
}
