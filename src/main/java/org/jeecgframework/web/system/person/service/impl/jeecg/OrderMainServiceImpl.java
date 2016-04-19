package org.jeecgframework.web.system.person.service.impl.jeecg;

import java.util.List;

import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.web.system.person.entity.jeecg.OrderCustomsEntity;
import org.jeecgframework.web.system.person.entity.jeecg.OrderMainEntity;
import org.jeecgframework.web.system.person.entity.jeecg.OrderProductEntity;
import org.jeecgframework.web.system.person.service.jeecg.OrderMainServiceI;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service("orderMainService")
@Transactional
public class OrderMainServiceImpl extends CommonServiceImpl implements OrderMainServiceI {

	
	public void addMain(OrderMainEntity orderMain,
	        List<OrderCustomsEntity> orderCustomsList,List<OrderProductEntity> orderProductList){
			//保存主信息
			this.save(orderMain);
		
			/**保存-订单客户明细*/
			for(OrderCustomsEntity orderCustoms:orderCustomsList){
				//外键设置
				orderCustoms.setId(orderMain.getId());
				//外键设置
				orderCustoms.setGoOrderCode(orderMain.getGoOrderCode());
				this.save(orderCustoms);
			}
			/**保存-订单产品明细*/
			for(OrderProductEntity orderProduct:orderProductList){
				//外键设置
				orderProduct.setId(orderMain.getId());
				//外键设置
				orderProduct.setGoOrderCode(orderMain.getGoOrderCode());
				this.save(orderProduct);
			}
	}

	
	public void updateMain(OrderMainEntity orderMain,
	        List<OrderCustomsEntity> orderCustomsList,List<OrderProductEntity> orderProductList) {
		//保存订单主信息
		this.saveOrUpdate(orderMain);
		
		
		//===================================================================================
		//获取参数
		Object id0 = orderMain.getId();
		Object goOrderCode0 = orderMain.getGoOrderCode();
		Object id1 = orderMain.getId();
		Object goOrderCode1 = orderMain.getGoOrderCode();
		//===================================================================================
		//1.查询出数据库的明细数据-订单客户明细
	    String hql0 = "from OrderCustomsEntity where 1 = 1 AND id = ?  AND goOrderCode = ? ";
	    List<OrderCustomsEntity> orderCustomsOldList = this.findHql(hql0,id0,goOrderCode0);
		//2.筛选更新明细数据-订单客户明细
		for(OrderCustomsEntity oldE:orderCustomsOldList){
			boolean isUpdate = false;
				for(OrderCustomsEntity sendE:orderCustomsList){
					//需要更新的明细数据-订单客户明细
					if(oldE.getId().equals(sendE.getId())){
		    			try {
							MyBeanUtils.copyBeanNotNull2Bean(sendE,oldE);
							this.saveOrUpdate(oldE);
						} catch (Exception e) {
							e.printStackTrace();
							throw new BusinessException(e.getMessage());
						}
						isUpdate= true;
		    			break;
		    		}
		    	}
	    		if(!isUpdate){
		    		//如果数据库存在的明细，前台没有传递过来则是删除-订单客户明细
		    		super.delete(oldE);
	    		}
	    		
			}
		//3.持久化新增的数据-订单客户明细
		for(OrderCustomsEntity orderCustoms:orderCustomsList){
			if(orderCustoms.getId()==null){
				//外键设置
				orderCustoms.setId(orderMain.getId());
				orderCustoms.setGoOrderCode(orderMain.getGoOrderCode());
				this.save(orderCustoms);
			}
		}
		//===================================================================================
		//1.查询出数据库的明细数据-订单产品明细
	    String hql1 = "from OrderProductEntity where 1 = 1 AND id = ?  AND goOrderCode = ? ";
	    List<OrderProductEntity> orderProductOldList = this.findHql(hql1,id1,goOrderCode1);
		//2.筛选更新明细数据-订单产品明细
		for(OrderProductEntity oldE:orderProductOldList){
			boolean isUpdate = false;
				for(OrderProductEntity sendE:orderProductList){
					//需要更新的明细数据-订单产品明细
					if(oldE.getId().equals(sendE.getId())){
		    			try {
							MyBeanUtils.copyBeanNotNull2Bean(sendE,oldE);
							this.saveOrUpdate(oldE);
						} catch (Exception e) {
							e.printStackTrace();
							throw new BusinessException(e.getMessage());
						}
						isUpdate= true;
		    			break;
		    		}
		    	}
	    		if(!isUpdate){
		    		//如果数据库存在的明细，前台没有传递过来则是删除-订单产品明细
		    		super.delete(oldE);
	    		}
	    		
			}
		//3.持久化新增的数据-订单产品明细
		for(OrderProductEntity orderProduct:orderProductList){
			if(orderProduct.getId()==null){
				//外键设置
				orderProduct.setId(orderMain.getId());
				orderProduct.setGoOrderCode(orderMain.getGoOrderCode());
				this.save(orderProduct);
			}
		}
		
	}

	
	public void delMain(OrderMainEntity orderMain) {
		//删除主表信息
		this.delete(orderMain);
		
		//===================================================================================
		//获取参数
		Object id0 = orderMain.getId();
		Object goOrderCode0 = orderMain.getGoOrderCode();
		Object id1 = orderMain.getId();
		Object goOrderCode1 = orderMain.getGoOrderCode();
		//===================================================================================
		//删除-订单客户明细
	    String hql0 = "from OrderCustomsEntity where 1 = 1 AND id = ?  AND goOrderCode = ? ";
	    List<OrderCustomsEntity> orderCustomsOldList = this.findHql(hql0,id0,goOrderCode0);
		this.deleteAllEntitie(orderCustomsOldList);
		//===================================================================================
		//删除-订单产品明细
	    String hql1 = "from OrderProductEntity where 1 = 1 AND id = ?  AND goOrderCode = ? ";
	    List<OrderProductEntity> orderProductOldList = this.findHql(hql1,id1,goOrderCode1);
		this.deleteAllEntitie(orderProductOldList);
	}
	
}