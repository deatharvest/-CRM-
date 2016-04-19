package com.business.notice.dao;

import java.util.List;

import org.jeecgframework.minidao.annotation.Arguments;
import org.jeecgframework.minidao.annotation.MiniDao;
import org.jeecgframework.minidao.annotation.ResultType;
import org.jeecgframework.minidao.hibernate.MiniDaoSupportHiber;

import com.business.notice.entity.XNoticeEntity;

@MiniDao
public interface XNoticeDao extends MiniDaoSupportHiber<XNoticeEntity> {

	@Arguments("xNotice")
	@ResultType("com.business.notice.entity.XNoticeEntity")
	public List<XNoticeEntity> getALLEntities(XNoticeEntity xNotice);
}
