package org.jeecgframework.web.system.person.service.jeecg;

import java.util.List;

import org.jeecgframework.core.common.service.CommonService;
import org.jeecgframework.web.system.person.entity.jeecg.OrderCustomsEntity;
import org.jeecgframework.web.system.person.entity.jeecg.OrderMainEntity;
import org.jeecgframework.web.system.person.entity.jeecg.OrderProductEntity;

public interface OrderMainServiceI extends CommonService{

	/**
	 * 添加一对多
	 * 
	 */
	public void addMain(OrderMainEntity orderMain,
	        List<OrderCustomsEntity> orderCustomsList,List<OrderProductEntity> orderProductList) ;
	/**
	 * 修改一对多
	 * 
	 */
	public void updateMain(OrderMainEntity orderMain,
	        List<OrderCustomsEntity> orderCustomsList,List<OrderProductEntity> orderProductList);
	public void delMain (OrderMainEntity orderMain);
}
