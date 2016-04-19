package com.business.goods.service.impl;

import java.util.List;

import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.business.goods.dao.XGoodsDao;
import com.business.goods.entity.XGoodsEntity;
import com.business.goods.service.XGoodsServiceI;

@Service("xGoodsService")
@Transactional
public class XGoodsServiceImpl extends CommonServiceImpl implements XGoodsServiceI {
	
	@Autowired
	private XGoodsDao xGoodsDao;

	@Override
	public List<XGoodsEntity> getALLEntities(XGoodsEntity xGoods) {
		return xGoodsDao.getALLEntities(xGoods);
	}
	
	public Integer getPriceByGoodsId(String goodsId,String attribute) {
		XGoodsEntity xGoodsEntity = xGoodsDao.getEntityByGoodsId(goodsId);
		int price;
		if(attribute.equals("dealer")){
			price = Integer.parseInt(xGoodsEntity.getDiscountPrice());
		}else {
			price = Integer.parseInt(xGoodsEntity.getPrice());
		}
		
		return price;
	}
	

	
}
