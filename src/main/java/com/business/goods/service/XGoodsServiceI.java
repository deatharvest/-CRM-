package com.business.goods.service;

import java.util.List;

import org.jeecgframework.core.common.service.CommonService;

import com.business.goods.entity.XGoodsEntity;

public interface XGoodsServiceI extends CommonService{
	
 	public List<XGoodsEntity> getALLEntities(XGoodsEntity xGoodsDao);
 	
 	
 	/**
 	 * 根据goodsId获得实体
 	 * @param goodsId
 	 * @return
 	 */
 	public Integer getPriceByGoodsId(String goodsId,String attribute);
}
