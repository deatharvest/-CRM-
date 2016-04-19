package com.business.goods.dao;

import java.util.List;

import org.jeecgframework.minidao.annotation.Arguments;
import org.jeecgframework.minidao.annotation.MiniDao;
import org.jeecgframework.minidao.annotation.ResultType;
import org.jeecgframework.minidao.annotation.Sql;
import org.jeecgframework.minidao.hibernate.MiniDaoSupportHiber;

import com.business.goods.entity.XGoodsEntity;

@MiniDao
public interface XGoodsDao extends MiniDaoSupportHiber<XGoodsEntity> {
	
	@Arguments("xGoods")
	@ResultType("com.business.goods.entity.XGoodsEntity")
	public List<XGoodsEntity> getALLEntities(XGoodsEntity xGoods);
	
	
	@Sql("SELECT * FROM x_goods x WHERE x.goods_id = :goodsId")
	@Arguments("goodsId")
	@ResultType("com.business.goods.entity.XGoodsEntity")
	public XGoodsEntity getEntityByGoodsId(String goodsId);
}
