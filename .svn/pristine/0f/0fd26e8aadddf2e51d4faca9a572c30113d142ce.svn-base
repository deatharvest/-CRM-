package jeecg.system.service.impl;

import org.jeecgframework.web.system.pojo.base.TSFunction;
import org.jeecgframework.web.system.pojo.base.TSIcon;
import org.jeecgframework.web.system.service.RepairService;

import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/** 
 * @Description 修复数据库Service
 * @ClassName: RepairService
 * @author tanghan
 * @date 2013-7-19 下午01:31:00  
 */ 
@Service("repairService")
@Transactional
public class RepairServiceImpl extends CommonServiceImpl implements RepairService{
        
	/** 
	 * @Description  先清空数据库，然后再修复数据库
	 * @author tanghan 2013-7-19  
	 */
	
	public void deleteAndRepair() {
		
	}

	/** 
	 * @Description  修复数据库
	 * @author tanghan 2013-7-19  
	 */
	
		synchronized public void repair() {
		repaireIcon(); //修复图标
		repairAttachment();  //修改附件
		repairDepart();
		repairMenu();// 修复菜单权限【权限控制到菜单级别】
		repairRole();// 修复角色
		repairUser();// 修复用户
//		repairRoleAuth();// 修复角色和权限的关系
//		repairUserRole();// 修复用户和角色的关系
//		repairDict();// 修复字典
//		repairOrg();// 修复组织机构
	}

/** 
	 * @Description 
	 * @author tanghan 2013-7-28  
	 */
	private void repairCgFormField() {
					//表单[订单主信息] - 字段清单
			CgFormHeadEntity jform_order_main = commonDao.findByProperty(CgFormHeadEntity.class, "tableName", "jform_order_main").get(0);
	        CgFormFieldEntity jform_order_main_id = new CgFormFieldEntity();
	        jform_order_main_id.setFieldName("id");
	        jform_order_main_id.setTable(jform_order_main);
	        jform_order_main_id.setFieldLength(0);
	        jform_order_main_id.setIsKey("Y");
	        jform_order_main_id.setIsNull("N");
	        jform_order_main_id.setIsQuery("N");
	        jform_order_main_id.setIsShow("N");
	        jform_order_main_id.setShowType("text");
	        jform_order_main_id.setLength(36);
	        jform_order_main_id.setType("string");
	        jform_order_main_id.setOrderNum(0);
	        jform_order_main_id.setPointLength(0);
	        jform_order_main_id.setQueryMode("single");
	        jform_order_main_id.setContent("主键");
	        jform_order_main_id.setCreateBy("admin");
	        jform_order_main_id.setCreateDate(new Date());
	        jform_order_main_id.setCreateName("管理员");
	        jform_order_main_id.setDictField("");
	        jform_order_main_id.setDictTable("");
	        jform_order_main_id.setMainTable("");
	        jform_order_main_id.setMainField("");
	        commonDao.saveOrUpdate(jform_order_main_id);
	        
	        CgFormFieldEntity jform_order_main_order_code = new CgFormFieldEntity();
	        jform_order_main_order_code.setFieldName("order_code");
	        jform_order_main_order_code.setTable(jform_order_main);
	        jform_order_main_order_code.setFieldLength(0);
	        jform_order_main_order_code.setIsKey("N");
	        jform_order_main_order_code.setIsNull("Y");
	        jform_order_main_order_code.setIsQuery("Y");
	        jform_order_main_order_code.setIsShow("Y");
	        jform_order_main_order_code.setShowType("text");
	        jform_order_main_order_code.setLength(50);
	        jform_order_main_order_code.setType("string");
	        jform_order_main_order_code.setOrderNum(1);
	        jform_order_main_order_code.setPointLength(0);
	        jform_order_main_order_code.setQueryMode("single");
	        jform_order_main_order_code.setContent("订单号");
	        jform_order_main_order_code.setCreateBy("admin");
	        jform_order_main_order_code.setCreateDate(new Date());
	        jform_order_main_order_code.setCreateName("管理员");
	        jform_order_main_order_code.setDictField("");
	        jform_order_main_order_code.setDictTable("");
	        jform_order_main_order_code.setMainTable("");
	        jform_order_main_order_code.setMainField("");
	        commonDao.saveOrUpdate(jform_order_main_order_code);
	        
	        CgFormFieldEntity jform_order_main_order_date = new CgFormFieldEntity();
	        jform_order_main_order_date.setFieldName("order_date");
	        jform_order_main_order_date.setTable(jform_order_main);
	        jform_order_main_order_date.setFieldLength(0);
	        jform_order_main_order_date.setIsKey("N");
	        jform_order_main_order_date.setIsNull("Y");
	        jform_order_main_order_date.setIsQuery("Y");
	        jform_order_main_order_date.setIsShow("Y");
	        jform_order_main_order_date.setShowType("date");
	        jform_order_main_order_date.setLength(20);
	        jform_order_main_order_date.setType("Date");
	        jform_order_main_order_date.setOrderNum(2);
	        jform_order_main_order_date.setPointLength(0);
	        jform_order_main_order_date.setQueryMode("single");
	        jform_order_main_order_date.setContent("订单日期");
	        jform_order_main_order_date.setCreateBy("admin");
	        jform_order_main_order_date.setCreateDate(new Date());
	        jform_order_main_order_date.setCreateName("管理员");
	        jform_order_main_order_date.setDictField("");
	        jform_order_main_order_date.setDictTable("");
	        jform_order_main_order_date.setMainTable("");
	        jform_order_main_order_date.setMainField("");
	        commonDao.saveOrUpdate(jform_order_main_order_date);
	        
	        CgFormFieldEntity jform_order_main_order_money = new CgFormFieldEntity();
	        jform_order_main_order_money.setFieldName("order_money");
	        jform_order_main_order_money.setTable(jform_order_main);
	        jform_order_main_order_money.setFieldLength(0);
	        jform_order_main_order_money.setIsKey("N");
	        jform_order_main_order_money.setIsNull("Y");
	        jform_order_main_order_money.setIsQuery("Y");
	        jform_order_main_order_money.setIsShow("Y");
	        jform_order_main_order_money.setShowType("text");
	        jform_order_main_order_money.setLength(10);
	        jform_order_main_order_money.setType("double");
	        jform_order_main_order_money.setOrderNum(3);
	        jform_order_main_order_money.setPointLength(3);
	        jform_order_main_order_money.setQueryMode("single");
	        jform_order_main_order_money.setContent("订单金额");
	        jform_order_main_order_money.setCreateBy("admin");
	        jform_order_main_order_money.setCreateDate(new Date());
	        jform_order_main_order_money.setCreateName("管理员");
	        jform_order_main_order_money.setDictField("");
	        jform_order_main_order_money.setDictTable("");
	        jform_order_main_order_money.setMainTable("");
	        jform_order_main_order_money.setMainField("");
	        commonDao.saveOrUpdate(jform_order_main_order_money);
	        
	        CgFormFieldEntity jform_order_main_content = new CgFormFieldEntity();
	        jform_order_main_content.setFieldName("content");
	        jform_order_main_content.setTable(jform_order_main);
	        jform_order_main_content.setFieldLength(0);
	        jform_order_main_content.setIsKey("N");
	        jform_order_main_content.setIsNull("Y");
	        jform_order_main_content.setIsQuery("Y");
	        jform_order_main_content.setIsShow("Y");
	        jform_order_main_content.setShowType("text");
	        jform_order_main_content.setLength(255);
	        jform_order_main_content.setType("string");
	        jform_order_main_content.setOrderNum(4);
	        jform_order_main_content.setPointLength(0);
	        jform_order_main_content.setQueryMode("single");
	        jform_order_main_content.setContent("备注");
	        jform_order_main_content.setCreateBy("admin");
	        jform_order_main_content.setCreateDate(new Date());
	        jform_order_main_content.setCreateName("管理员");
	        jform_order_main_content.setDictField("");
	        jform_order_main_content.setDictTable("");
	        jform_order_main_content.setMainTable("");
	        jform_order_main_content.setMainField("");
	        commonDao.saveOrUpdate(jform_order_main_content);
	        
			//表单[请假单] - 字段清单
			CgFormHeadEntity jform_leave = commonDao.findByProperty(CgFormHeadEntity.class, "tableName", "jform_leave").get(0);
	        CgFormFieldEntity jform_leave_id = new CgFormFieldEntity();
	        jform_leave_id.setFieldName("id");
	        jform_leave_id.setTable(jform_leave);
	        jform_leave_id.setFieldLength(0);
	        jform_leave_id.setIsKey("Y");
	        jform_leave_id.setIsNull("N");
	        jform_leave_id.setIsQuery("N");
	        jform_leave_id.setIsShow("N");
	        jform_leave_id.setShowType("text");
	        jform_leave_id.setLength(36);
	        jform_leave_id.setType("string");
	        jform_leave_id.setOrderNum(0);
	        jform_leave_id.setPointLength(0);
	        jform_leave_id.setQueryMode("single");
	        jform_leave_id.setContent("主键");
	        jform_leave_id.setCreateBy("admin");
	        jform_leave_id.setCreateDate(new Date());
	        jform_leave_id.setCreateName("管理员");
	        jform_leave_id.setDictField("");
	        jform_leave_id.setDictTable("");
	        jform_leave_id.setMainTable("");
	        jform_leave_id.setMainField("");
	        commonDao.saveOrUpdate(jform_leave_id);
	        
	        CgFormFieldEntity jform_leave_title = new CgFormFieldEntity();
	        jform_leave_title.setFieldName("title");
	        jform_leave_title.setTable(jform_leave);
	        jform_leave_title.setFieldLength(0);
	        jform_leave_title.setIsKey("N");
	        jform_leave_title.setIsNull("N");
	        jform_leave_title.setIsQuery("N");
	        jform_leave_title.setIsShow("Y");
	        jform_leave_title.setShowType("text");
	        jform_leave_title.setLength(50);
	        jform_leave_title.setType("string");
	        jform_leave_title.setOrderNum(1);
	        jform_leave_title.setPointLength(0);
	        jform_leave_title.setQueryMode("single");
	        jform_leave_title.setContent("请假标题");
	        jform_leave_title.setCreateBy("admin");
	        jform_leave_title.setCreateDate(new Date());
	        jform_leave_title.setCreateName("管理员");
	        jform_leave_title.setDictField("");
	        jform_leave_title.setDictTable("");
	        jform_leave_title.setMainTable("");
	        jform_leave_title.setMainField("");
	        commonDao.saveOrUpdate(jform_leave_title);
	        
	        CgFormFieldEntity jform_leave_people = new CgFormFieldEntity();
	        jform_leave_people.setFieldName("people");
	        jform_leave_people.setTable(jform_leave);
	        jform_leave_people.setFieldLength(0);
	        jform_leave_people.setIsKey("N");
	        jform_leave_people.setIsNull("N");
	        jform_leave_people.setIsQuery("Y");
	        jform_leave_people.setIsShow("Y");
	        jform_leave_people.setShowType("text");
	        jform_leave_people.setLength(20);
	        jform_leave_people.setType("string");
	        jform_leave_people.setOrderNum(2);
	        jform_leave_people.setPointLength(0);
	        jform_leave_people.setQueryMode("single");
	        jform_leave_people.setContent("请假人");
	        jform_leave_people.setCreateBy("admin");
	        jform_leave_people.setCreateDate(new Date());
	        jform_leave_people.setCreateName("管理员");
	        jform_leave_people.setDictField("");
	        jform_leave_people.setDictTable("");
	        jform_leave_people.setMainTable("");
	        jform_leave_people.setMainField("");
	        commonDao.saveOrUpdate(jform_leave_people);
	        
	        CgFormFieldEntity jform_leave_sex = new CgFormFieldEntity();
	        jform_leave_sex.setFieldName("sex");
	        jform_leave_sex.setTable(jform_leave);
	        jform_leave_sex.setFieldLength(0);
	        jform_leave_sex.setIsKey("N");
	        jform_leave_sex.setIsNull("N");
	        jform_leave_sex.setIsQuery("Y");
	        jform_leave_sex.setIsShow("Y");
	        jform_leave_sex.setShowType("list");
	        jform_leave_sex.setLength(10);
	        jform_leave_sex.setType("string");
	        jform_leave_sex.setOrderNum(3);
	        jform_leave_sex.setPointLength(0);
	        jform_leave_sex.setQueryMode("single");
	        jform_leave_sex.setContent("性别");
	        jform_leave_sex.setCreateBy("admin");
	        jform_leave_sex.setCreateDate(new Date());
	        jform_leave_sex.setCreateName("管理员");
	        jform_leave_sex.setDictField("sex");
	        jform_leave_sex.setDictTable("");
	        jform_leave_sex.setMainTable("");
	        jform_leave_sex.setMainField("");
	        commonDao.saveOrUpdate(jform_leave_sex);
	        
	        CgFormFieldEntity jform_leave_begindate = new CgFormFieldEntity();
	        jform_leave_begindate.setFieldName("begindate");
	        jform_leave_begindate.setTable(jform_leave);
	        jform_leave_begindate.setFieldLength(0);
	        jform_leave_begindate.setIsKey("N");
	        jform_leave_begindate.setIsNull("N");
	        jform_leave_begindate.setIsQuery("N");
	        jform_leave_begindate.setIsShow("Y");
	        jform_leave_begindate.setShowType("date");
	        jform_leave_begindate.setLength(0);
	        jform_leave_begindate.setType("Date");
	        jform_leave_begindate.setOrderNum(4);
	        jform_leave_begindate.setPointLength(0);
	        jform_leave_begindate.setQueryMode("group");
	        jform_leave_begindate.setContent("请假开始时间");
	        jform_leave_begindate.setCreateBy("admin");
	        jform_leave_begindate.setCreateDate(new Date());
	        jform_leave_begindate.setCreateName("管理员");
	        jform_leave_begindate.setDictField("");
	        jform_leave_begindate.setDictTable("");
	        jform_leave_begindate.setMainTable("");
	        jform_leave_begindate.setMainField("");
	        commonDao.saveOrUpdate(jform_leave_begindate);
	        
	        CgFormFieldEntity jform_leave_enddate = new CgFormFieldEntity();
	        jform_leave_enddate.setFieldName("enddate");
	        jform_leave_enddate.setTable(jform_leave);
	        jform_leave_enddate.setFieldLength(0);
	        jform_leave_enddate.setIsKey("N");
	        jform_leave_enddate.setIsNull("N");
	        jform_leave_enddate.setIsQuery("N");
	        jform_leave_enddate.setIsShow("Y");
	        jform_leave_enddate.setShowType("datetime");
	        jform_leave_enddate.setLength(0);
	        jform_leave_enddate.setType("Date");
	        jform_leave_enddate.setOrderNum(5);
	        jform_leave_enddate.setPointLength(0);
	        jform_leave_enddate.setQueryMode("group");
	        jform_leave_enddate.setContent("请假结束时间");
	        jform_leave_enddate.setCreateBy("admin");
	        jform_leave_enddate.setCreateDate(new Date());
	        jform_leave_enddate.setCreateName("管理员");
	        jform_leave_enddate.setDictField("");
	        jform_leave_enddate.setDictTable("");
	        jform_leave_enddate.setMainTable("");
	        jform_leave_enddate.setMainField("");
	        commonDao.saveOrUpdate(jform_leave_enddate);
	        
	        CgFormFieldEntity jform_leave_hol_dept = new CgFormFieldEntity();
	        jform_leave_hol_dept.setFieldName("hol_dept");
	        jform_leave_hol_dept.setTable(jform_leave);
	        jform_leave_hol_dept.setFieldLength(0);
	        jform_leave_hol_dept.setIsKey("N");
	        jform_leave_hol_dept.setIsNull("N");
	        jform_leave_hol_dept.setIsQuery("N");
	        jform_leave_hol_dept.setIsShow("Y");
	        jform_leave_hol_dept.setShowType("list");
	        jform_leave_hol_dept.setLength(32);
	        jform_leave_hol_dept.setType("string");
	        jform_leave_hol_dept.setOrderNum(7);
	        jform_leave_hol_dept.setPointLength(0);
	        jform_leave_hol_dept.setQueryMode("single");
	        jform_leave_hol_dept.setContent("所属部门");
	        jform_leave_hol_dept.setCreateBy("admin");
	        jform_leave_hol_dept.setCreateDate(new Date());
	        jform_leave_hol_dept.setCreateName("管理员");
	        jform_leave_hol_dept.setDictField("id");
	        jform_leave_hol_dept.setDictTable("t_s_depart");
	        jform_leave_hol_dept.setMainTable("");
	        jform_leave_hol_dept.setMainField("");
	        commonDao.saveOrUpdate(jform_leave_hol_dept);
	        
	        CgFormFieldEntity jform_leave_hol_reson = new CgFormFieldEntity();
	        jform_leave_hol_reson.setFieldName("hol_reson");
	        jform_leave_hol_reson.setTable(jform_leave);
	        jform_leave_hol_reson.setFieldLength(0);
	        jform_leave_hol_reson.setIsKey("N");
	        jform_leave_hol_reson.setIsNull("N");
	        jform_leave_hol_reson.setIsQuery("N");
	        jform_leave_hol_reson.setIsShow("Y");
	        jform_leave_hol_reson.setShowType("text");
	        jform_leave_hol_reson.setLength(255);
	        jform_leave_hol_reson.setType("string");
	        jform_leave_hol_reson.setOrderNum(8);
	        jform_leave_hol_reson.setPointLength(0);
	        jform_leave_hol_reson.setQueryMode("single");
	        jform_leave_hol_reson.setContent("请假原因");
	        jform_leave_hol_reson.setCreateBy("admin");
	        jform_leave_hol_reson.setCreateDate(new Date());
	        jform_leave_hol_reson.setCreateName("管理员");
	        jform_leave_hol_reson.setDictField("");
	        jform_leave_hol_reson.setDictTable("");
	        jform_leave_hol_reson.setMainTable("");
	        jform_leave_hol_reson.setMainField("");
	        commonDao.saveOrUpdate(jform_leave_hol_reson);
	        
	        CgFormFieldEntity jform_leave_dep_leader = new CgFormFieldEntity();
	        jform_leave_dep_leader.setFieldName("dep_leader");
	        jform_leave_dep_leader.setTable(jform_leave);
	        jform_leave_dep_leader.setFieldLength(0);
	        jform_leave_dep_leader.setIsKey("N");
	        jform_leave_dep_leader.setIsNull("N");
	        jform_leave_dep_leader.setIsQuery("N");
	        jform_leave_dep_leader.setIsShow("Y");
	        jform_leave_dep_leader.setShowType("text");
	        jform_leave_dep_leader.setLength(20);
	        jform_leave_dep_leader.setType("string");
	        jform_leave_dep_leader.setOrderNum(9);
	        jform_leave_dep_leader.setPointLength(0);
	        jform_leave_dep_leader.setQueryMode("single");
	        jform_leave_dep_leader.setContent("部门审批人");
	        jform_leave_dep_leader.setCreateBy("admin");
	        jform_leave_dep_leader.setCreateDate(new Date());
	        jform_leave_dep_leader.setCreateName("管理员");
	        jform_leave_dep_leader.setDictField("");
	        jform_leave_dep_leader.setDictTable("");
	        jform_leave_dep_leader.setMainTable("");
	        jform_leave_dep_leader.setMainField("");
	        commonDao.saveOrUpdate(jform_leave_dep_leader);
	        
	        CgFormFieldEntity jform_leave_content = new CgFormFieldEntity();
	        jform_leave_content.setFieldName("content");
	        jform_leave_content.setTable(jform_leave);
	        jform_leave_content.setFieldLength(0);
	        jform_leave_content.setIsKey("N");
	        jform_leave_content.setIsNull("N");
	        jform_leave_content.setIsQuery("N");
	        jform_leave_content.setIsShow("Y");
	        jform_leave_content.setShowType("text");
	        jform_leave_content.setLength(255);
	        jform_leave_content.setType("string");
	        jform_leave_content.setOrderNum(10);
	        jform_leave_content.setPointLength(0);
	        jform_leave_content.setQueryMode("single");
	        jform_leave_content.setContent("部门审批意见");
	        jform_leave_content.setCreateBy("admin");
	        jform_leave_content.setCreateDate(new Date());
	        jform_leave_content.setCreateName("管理员");
	        jform_leave_content.setDictField("");
	        jform_leave_content.setDictTable("");
	        jform_leave_content.setMainTable("");
	        jform_leave_content.setMainField("");
	        commonDao.saveOrUpdate(jform_leave_content);
	        
	        CgFormFieldEntity jform_leave_day_num = new CgFormFieldEntity();
	        jform_leave_day_num.setFieldName("day_num");
	        jform_leave_day_num.setTable(jform_leave);
	        jform_leave_day_num.setFieldLength(120);
	        jform_leave_day_num.setIsKey("N");
	        jform_leave_day_num.setIsNull("Y");
	        jform_leave_day_num.setIsQuery("N");
	        jform_leave_day_num.setIsShow("Y");
	        jform_leave_day_num.setShowType("text");
	        jform_leave_day_num.setLength(10);
	        jform_leave_day_num.setType("int");
	        jform_leave_day_num.setOrderNum(6);
	        jform_leave_day_num.setPointLength(0);
	        jform_leave_day_num.setQueryMode("single");
	        jform_leave_day_num.setContent("请假天数");
	        jform_leave_day_num.setCreateBy("admin");
	        jform_leave_day_num.setCreateDate(new Date());
	        jform_leave_day_num.setCreateName("管理员");
	        jform_leave_day_num.setDictField("");
	        jform_leave_day_num.setDictTable("");
	        jform_leave_day_num.setMainTable("");
	        jform_leave_day_num.setMainField("");
	        commonDao.saveOrUpdate(jform_leave_day_num);
	        
			//表单[订单客户信息] - 字段清单
			CgFormHeadEntity jform_order_customer = commonDao.findByProperty(CgFormHeadEntity.class, "tableName", "jform_order_customer").get(0);
	        CgFormFieldEntity jform_order_customer_id = new CgFormFieldEntity();
	        jform_order_customer_id.setFieldName("id");
	        jform_order_customer_id.setTable(jform_order_customer);
	        jform_order_customer_id.setFieldLength(0);
	        jform_order_customer_id.setIsKey("Y");
	        jform_order_customer_id.setIsNull("N");
	        jform_order_customer_id.setIsQuery("N");
	        jform_order_customer_id.setIsShow("N");
	        jform_order_customer_id.setShowType("text");
	        jform_order_customer_id.setLength(36);
	        jform_order_customer_id.setType("string");
	        jform_order_customer_id.setOrderNum(0);
	        jform_order_customer_id.setPointLength(0);
	        jform_order_customer_id.setQueryMode("single");
	        jform_order_customer_id.setContent("主键");
	        jform_order_customer_id.setCreateBy("admin");
	        jform_order_customer_id.setCreateDate(new Date());
	        jform_order_customer_id.setCreateName("管理员");
	        jform_order_customer_id.setDictField("");
	        jform_order_customer_id.setDictTable("");
	        jform_order_customer_id.setMainTable("");
	        jform_order_customer_id.setMainField("");
	        commonDao.saveOrUpdate(jform_order_customer_id);
	        
	        CgFormFieldEntity jform_order_customer_name = new CgFormFieldEntity();
	        jform_order_customer_name.setFieldName("name");
	        jform_order_customer_name.setTable(jform_order_customer);
	        jform_order_customer_name.setFieldLength(0);
	        jform_order_customer_name.setIsKey("N");
	        jform_order_customer_name.setIsNull("Y");
	        jform_order_customer_name.setIsQuery("Y");
	        jform_order_customer_name.setIsShow("Y");
	        jform_order_customer_name.setShowType("text");
	        jform_order_customer_name.setLength(32);
	        jform_order_customer_name.setType("string");
	        jform_order_customer_name.setOrderNum(1);
	        jform_order_customer_name.setPointLength(0);
	        jform_order_customer_name.setQueryMode("single");
	        jform_order_customer_name.setContent("客户名");
	        jform_order_customer_name.setCreateBy("admin");
	        jform_order_customer_name.setCreateDate(new Date());
	        jform_order_customer_name.setCreateName("管理员");
	        jform_order_customer_name.setDictField("");
	        jform_order_customer_name.setDictTable("");
	        jform_order_customer_name.setMainTable("");
	        jform_order_customer_name.setMainField("");
	        commonDao.saveOrUpdate(jform_order_customer_name);
	        
	        CgFormFieldEntity jform_order_customer_money = new CgFormFieldEntity();
	        jform_order_customer_money.setFieldName("money");
	        jform_order_customer_money.setTable(jform_order_customer);
	        jform_order_customer_money.setFieldLength(0);
	        jform_order_customer_money.setIsKey("N");
	        jform_order_customer_money.setIsNull("Y");
	        jform_order_customer_money.setIsQuery("Y");
	        jform_order_customer_money.setIsShow("Y");
	        jform_order_customer_money.setShowType("text");
	        jform_order_customer_money.setLength(10);
	        jform_order_customer_money.setType("double");
	        jform_order_customer_money.setOrderNum(2);
	        jform_order_customer_money.setPointLength(2);
	        jform_order_customer_money.setQueryMode("group");
	        jform_order_customer_money.setContent("单价");
	        jform_order_customer_money.setCreateBy("admin");
	        jform_order_customer_money.setCreateDate(new Date());
	        jform_order_customer_money.setCreateName("管理员");
	        jform_order_customer_money.setDictField("");
	        jform_order_customer_money.setDictTable("");
	        jform_order_customer_money.setMainTable("");
	        jform_order_customer_money.setMainField("");
	        commonDao.saveOrUpdate(jform_order_customer_money);
	        
	        CgFormFieldEntity jform_order_customer_fk_id = new CgFormFieldEntity();
	        jform_order_customer_fk_id.setFieldName("fk_id");
	        jform_order_customer_fk_id.setTable(jform_order_customer);
	        jform_order_customer_fk_id.setFieldLength(120);
	        jform_order_customer_fk_id.setIsKey("N");
	        jform_order_customer_fk_id.setIsNull("N");
	        jform_order_customer_fk_id.setIsQuery("Y");
	        jform_order_customer_fk_id.setIsShow("N");
	        jform_order_customer_fk_id.setShowType("text");
	        jform_order_customer_fk_id.setLength(36);
	        jform_order_customer_fk_id.setType("string");
	        jform_order_customer_fk_id.setOrderNum(5);
	        jform_order_customer_fk_id.setPointLength(0);
	        jform_order_customer_fk_id.setQueryMode("single");
	        jform_order_customer_fk_id.setContent("外键");
	        jform_order_customer_fk_id.setCreateBy("admin");
	        jform_order_customer_fk_id.setCreateDate(new Date());
	        jform_order_customer_fk_id.setCreateName("管理员");
	        jform_order_customer_fk_id.setDictField("");
	        jform_order_customer_fk_id.setDictTable("");
	        jform_order_customer_fk_id.setMainTable("jform_order_main");
	        jform_order_customer_fk_id.setMainField("id");
	        commonDao.saveOrUpdate(jform_order_customer_fk_id);
	        
	        CgFormFieldEntity jform_order_customer_telphone = new CgFormFieldEntity();
	        jform_order_customer_telphone.setFieldName("telphone");
	        jform_order_customer_telphone.setTable(jform_order_customer);
	        jform_order_customer_telphone.setFieldLength(120);
	        jform_order_customer_telphone.setIsKey("N");
	        jform_order_customer_telphone.setIsNull("Y");
	        jform_order_customer_telphone.setIsQuery("Y");
	        jform_order_customer_telphone.setIsShow("Y");
	        jform_order_customer_telphone.setShowType("text");
	        jform_order_customer_telphone.setLength(32);
	        jform_order_customer_telphone.setType("string");
	        jform_order_customer_telphone.setOrderNum(4);
	        jform_order_customer_telphone.setPointLength(0);
	        jform_order_customer_telphone.setQueryMode("single");
	        jform_order_customer_telphone.setContent("电话");
	        jform_order_customer_telphone.setCreateBy("admin");
	        jform_order_customer_telphone.setCreateDate(new Date());
	        jform_order_customer_telphone.setCreateName("管理员");
	        jform_order_customer_telphone.setDictField("");
	        jform_order_customer_telphone.setDictTable("");
	        jform_order_customer_telphone.setMainTable("");
	        jform_order_customer_telphone.setMainField("");
	        commonDao.saveOrUpdate(jform_order_customer_telphone);
	        
	        CgFormFieldEntity jform_order_customer_sex = new CgFormFieldEntity();
	        jform_order_customer_sex.setFieldName("sex");
	        jform_order_customer_sex.setTable(jform_order_customer);
	        jform_order_customer_sex.setFieldLength(120);
	        jform_order_customer_sex.setIsKey("N");
	        jform_order_customer_sex.setIsNull("Y");
	        jform_order_customer_sex.setIsQuery("Y");
	        jform_order_customer_sex.setIsShow("Y");
	        jform_order_customer_sex.setShowType("radio");
	        jform_order_customer_sex.setLength(4);
	        jform_order_customer_sex.setType("string");
	        jform_order_customer_sex.setOrderNum(3);
	        jform_order_customer_sex.setPointLength(0);
	        jform_order_customer_sex.setQueryMode("single");
	        jform_order_customer_sex.setContent("性别");
	        jform_order_customer_sex.setCreateBy("admin");
	        jform_order_customer_sex.setCreateDate(new Date());
	        jform_order_customer_sex.setCreateName("管理员");
	        jform_order_customer_sex.setDictField("sex");
	        jform_order_customer_sex.setDictTable("");
	        jform_order_customer_sex.setMainTable("");
	        jform_order_customer_sex.setMainField("");
	        commonDao.saveOrUpdate(jform_order_customer_sex);
	        
			//表单[订单机票信息] - 字段清单
			CgFormHeadEntity jform_order_ticket = commonDao.findByProperty(CgFormHeadEntity.class, "tableName", "jform_order_ticket").get(0);
	        CgFormFieldEntity jform_order_ticket_id = new CgFormFieldEntity();
	        jform_order_ticket_id.setFieldName("id");
	        jform_order_ticket_id.setTable(jform_order_ticket);
	        jform_order_ticket_id.setFieldLength(120);
	        jform_order_ticket_id.setIsKey("Y");
	        jform_order_ticket_id.setIsNull("N");
	        jform_order_ticket_id.setIsQuery("N");
	        jform_order_ticket_id.setIsShow("N");
	        jform_order_ticket_id.setShowType("checkbox");
	        jform_order_ticket_id.setLength(36);
	        jform_order_ticket_id.setType("string");
	        jform_order_ticket_id.setOrderNum(0);
	        jform_order_ticket_id.setPointLength(0);
	        jform_order_ticket_id.setQueryMode("single");
	        jform_order_ticket_id.setContent("主键");
	        jform_order_ticket_id.setCreateBy("admin");
	        jform_order_ticket_id.setCreateDate(new Date());
	        jform_order_ticket_id.setCreateName("管理员");
	        jform_order_ticket_id.setDictField("");
	        jform_order_ticket_id.setDictTable("");
	        jform_order_ticket_id.setMainTable("");
	        jform_order_ticket_id.setMainField("");
	        commonDao.saveOrUpdate(jform_order_ticket_id);
	        
	        CgFormFieldEntity jform_order_ticket_ticket_code = new CgFormFieldEntity();
	        jform_order_ticket_ticket_code.setFieldName("ticket_code");
	        jform_order_ticket_ticket_code.setTable(jform_order_ticket);
	        jform_order_ticket_ticket_code.setFieldLength(120);
	        jform_order_ticket_ticket_code.setIsKey("N");
	        jform_order_ticket_ticket_code.setIsNull("N");
	        jform_order_ticket_ticket_code.setIsQuery("Y");
	        jform_order_ticket_ticket_code.setIsShow("Y");
	        jform_order_ticket_ticket_code.setShowType("text");
	        jform_order_ticket_ticket_code.setLength(100);
	        jform_order_ticket_ticket_code.setType("string");
	        jform_order_ticket_ticket_code.setOrderNum(1);
	        jform_order_ticket_ticket_code.setPointLength(0);
	        jform_order_ticket_ticket_code.setQueryMode("single");
	        jform_order_ticket_ticket_code.setContent("航班号");
	        jform_order_ticket_ticket_code.setCreateBy("admin");
	        jform_order_ticket_ticket_code.setCreateDate(new Date());
	        jform_order_ticket_ticket_code.setCreateName("管理员");
	        jform_order_ticket_ticket_code.setDictField("");
	        jform_order_ticket_ticket_code.setDictTable("");
	        jform_order_ticket_ticket_code.setMainTable("");
	        jform_order_ticket_ticket_code.setMainField("");
	        commonDao.saveOrUpdate(jform_order_ticket_ticket_code);
	        
	        CgFormFieldEntity jform_order_ticket_tickect_date = new CgFormFieldEntity();
	        jform_order_ticket_tickect_date.setFieldName("tickect_date");
	        jform_order_ticket_tickect_date.setTable(jform_order_ticket);
	        jform_order_ticket_tickect_date.setFieldLength(120);
	        jform_order_ticket_tickect_date.setIsKey("N");
	        jform_order_ticket_tickect_date.setIsNull("N");
	        jform_order_ticket_tickect_date.setIsQuery("Y");
	        jform_order_ticket_tickect_date.setIsShow("Y");
	        jform_order_ticket_tickect_date.setShowType("datetime");
	        jform_order_ticket_tickect_date.setLength(10);
	        jform_order_ticket_tickect_date.setType("Date");
	        jform_order_ticket_tickect_date.setOrderNum(2);
	        jform_order_ticket_tickect_date.setPointLength(0);
	        jform_order_ticket_tickect_date.setQueryMode("single");
	        jform_order_ticket_tickect_date.setContent("航班时间");
	        jform_order_ticket_tickect_date.setCreateBy("admin");
	        jform_order_ticket_tickect_date.setCreateDate(new Date());
	        jform_order_ticket_tickect_date.setCreateName("管理员");
	        jform_order_ticket_tickect_date.setDictField("");
	        jform_order_ticket_tickect_date.setDictTable("");
	        jform_order_ticket_tickect_date.setMainTable("");
	        jform_order_ticket_tickect_date.setMainField("");
	        commonDao.saveOrUpdate(jform_order_ticket_tickect_date);
	        
	        CgFormFieldEntity jform_order_ticket_fck_id = new CgFormFieldEntity();
	        jform_order_ticket_fck_id.setFieldName("fck_id");
	        jform_order_ticket_fck_id.setTable(jform_order_ticket);
	        jform_order_ticket_fck_id.setFieldLength(120);
	        jform_order_ticket_fck_id.setIsKey("N");
	        jform_order_ticket_fck_id.setIsNull("N");
	        jform_order_ticket_fck_id.setIsQuery("N");
	        jform_order_ticket_fck_id.setIsShow("N");
	        jform_order_ticket_fck_id.setShowType("text");
	        jform_order_ticket_fck_id.setLength(36);
	        jform_order_ticket_fck_id.setType("string");
	        jform_order_ticket_fck_id.setOrderNum(3);
	        jform_order_ticket_fck_id.setPointLength(0);
	        jform_order_ticket_fck_id.setQueryMode("single");
	        jform_order_ticket_fck_id.setContent("外键");
	        jform_order_ticket_fck_id.setCreateBy("admin");
	        jform_order_ticket_fck_id.setCreateDate(new Date());
	        jform_order_ticket_fck_id.setCreateName("管理员");
	        jform_order_ticket_fck_id.setDictField("");
	        jform_order_ticket_fck_id.setDictTable("");
	        jform_order_ticket_fck_id.setMainTable("jform_order_main");
	        jform_order_ticket_fck_id.setMainField("id");
	        commonDao.saveOrUpdate(jform_order_ticket_fck_id);
	        
			//表单[价格认证机构统计表] - 字段清单
			CgFormHeadEntity jform_price1 = commonDao.findByProperty(CgFormHeadEntity.class, "tableName", "jform_price1").get(0);
	        CgFormFieldEntity jform_price1_id = new CgFormFieldEntity();
	        jform_price1_id.setFieldName("id");
	        jform_price1_id.setTable(jform_price1);
	        jform_price1_id.setFieldLength(0);
	        jform_price1_id.setIsKey("Y");
	        jform_price1_id.setIsNull("N");
	        jform_price1_id.setIsQuery("N");
	        jform_price1_id.setIsShow("N");
	        jform_price1_id.setShowType("text");
	        jform_price1_id.setLength(36);
	        jform_price1_id.setType("string");
	        jform_price1_id.setOrderNum(0);
	        jform_price1_id.setPointLength(0);
	        jform_price1_id.setQueryMode("single");
	        jform_price1_id.setContent("主键");
	        jform_price1_id.setCreateBy("admin");
	        jform_price1_id.setCreateDate(new Date());
	        jform_price1_id.setCreateName("管理员");
	        jform_price1_id.setDictField("");
	        jform_price1_id.setDictTable("");
	        jform_price1_id.setMainTable("");
	        jform_price1_id.setMainField("");
	        commonDao.saveOrUpdate(jform_price1_id);
	        
	        CgFormFieldEntity jform_price1_a = new CgFormFieldEntity();
	        jform_price1_a.setFieldName("a");
	        jform_price1_a.setTable(jform_price1);
	        jform_price1_a.setFieldLength(0);
	        jform_price1_a.setIsKey("N");
	        jform_price1_a.setIsNull("N");
	        jform_price1_a.setIsQuery("Y");
	        jform_price1_a.setIsShow("Y");
	        jform_price1_a.setShowType("text");
	        jform_price1_a.setLength(10);
	        jform_price1_a.setType("double");
	        jform_price1_a.setOrderNum(1);
	        jform_price1_a.setPointLength(2);
	        jform_price1_a.setQueryMode("group");
	        jform_price1_a.setContent("机构合计");
	        jform_price1_a.setCreateBy("admin");
	        jform_price1_a.setCreateDate(new Date());
	        jform_price1_a.setCreateName("管理员");
	        jform_price1_a.setDictField("");
	        jform_price1_a.setDictTable("");
	        jform_price1_a.setMainTable("");
	        jform_price1_a.setMainField("");
	        commonDao.saveOrUpdate(jform_price1_a);
	        
	        CgFormFieldEntity jform_price1_b1 = new CgFormFieldEntity();
	        jform_price1_b1.setFieldName("b1");
	        jform_price1_b1.setTable(jform_price1);
	        jform_price1_b1.setFieldLength(0);
	        jform_price1_b1.setIsKey("N");
	        jform_price1_b1.setIsNull("N");
	        jform_price1_b1.setIsQuery("N");
	        jform_price1_b1.setIsShow("Y");
	        jform_price1_b1.setShowType("text");
	        jform_price1_b1.setLength(10);
	        jform_price1_b1.setType("double");
	        jform_price1_b1.setOrderNum(2);
	        jform_price1_b1.setPointLength(2);
	        jform_price1_b1.setQueryMode("group");
	        jform_price1_b1.setContent("行政小计");
	        jform_price1_b1.setCreateBy("admin");
	        jform_price1_b1.setCreateDate(new Date());
	        jform_price1_b1.setCreateName("管理员");
	        jform_price1_b1.setDictField("");
	        jform_price1_b1.setDictTable("");
	        jform_price1_b1.setMainTable("");
	        jform_price1_b1.setMainField("");
	        commonDao.saveOrUpdate(jform_price1_b1);
	        
	        CgFormFieldEntity jform_price1_b11 = new CgFormFieldEntity();
	        jform_price1_b11.setFieldName("b11");
	        jform_price1_b11.setTable(jform_price1);
	        jform_price1_b11.setFieldLength(0);
	        jform_price1_b11.setIsKey("N");
	        jform_price1_b11.setIsNull("N");
	        jform_price1_b11.setIsQuery("N");
	        jform_price1_b11.setIsShow("Y");
	        jform_price1_b11.setShowType("text");
	        jform_price1_b11.setLength(100);
	        jform_price1_b11.setType("string");
	        jform_price1_b11.setOrderNum(3);
	        jform_price1_b11.setPointLength(0);
	        jform_price1_b11.setQueryMode("group");
	        jform_price1_b11.setContent("行政省");
	        jform_price1_b11.setCreateBy("admin");
	        jform_price1_b11.setCreateDate(new Date());
	        jform_price1_b11.setCreateName("管理员");
	        jform_price1_b11.setDictField("");
	        jform_price1_b11.setDictTable("");
	        jform_price1_b11.setMainTable("");
	        jform_price1_b11.setMainField("");
	        commonDao.saveOrUpdate(jform_price1_b11);
	        
	        CgFormFieldEntity jform_price1_b12 = new CgFormFieldEntity();
	        jform_price1_b12.setFieldName("b12");
	        jform_price1_b12.setTable(jform_price1);
	        jform_price1_b12.setFieldLength(0);
	        jform_price1_b12.setIsKey("N");
	        jform_price1_b12.setIsNull("N");
	        jform_price1_b12.setIsQuery("N");
	        jform_price1_b12.setIsShow("Y");
	        jform_price1_b12.setShowType("text");
	        jform_price1_b12.setLength(100);
	        jform_price1_b12.setType("string");
	        jform_price1_b12.setOrderNum(4);
	        jform_price1_b12.setPointLength(0);
	        jform_price1_b12.setQueryMode("group");
	        jform_price1_b12.setContent("行政市");
	        jform_price1_b12.setCreateBy("admin");
	        jform_price1_b12.setCreateDate(new Date());
	        jform_price1_b12.setCreateName("管理员");
	        jform_price1_b12.setDictField("");
	        jform_price1_b12.setDictTable("");
	        jform_price1_b12.setMainTable("");
	        jform_price1_b12.setMainField("");
	        commonDao.saveOrUpdate(jform_price1_b12);
	        
	        CgFormFieldEntity jform_price1_b13 = new CgFormFieldEntity();
	        jform_price1_b13.setFieldName("b13");
	        jform_price1_b13.setTable(jform_price1);
	        jform_price1_b13.setFieldLength(0);
	        jform_price1_b13.setIsKey("N");
	        jform_price1_b13.setIsNull("N");
	        jform_price1_b13.setIsQuery("N");
	        jform_price1_b13.setIsShow("Y");
	        jform_price1_b13.setShowType("text");
	        jform_price1_b13.setLength(100);
	        jform_price1_b13.setType("string");
	        jform_price1_b13.setOrderNum(5);
	        jform_price1_b13.setPointLength(0);
	        jform_price1_b13.setQueryMode("single");
	        jform_price1_b13.setContent("行政县");
	        jform_price1_b13.setCreateBy("admin");
	        jform_price1_b13.setCreateDate(new Date());
	        jform_price1_b13.setCreateName("管理员");
	        jform_price1_b13.setDictField("");
	        jform_price1_b13.setDictTable("");
	        jform_price1_b13.setMainTable("");
	        jform_price1_b13.setMainField("");
	        commonDao.saveOrUpdate(jform_price1_b13);
	        
	        CgFormFieldEntity jform_price1_b2 = new CgFormFieldEntity();
	        jform_price1_b2.setFieldName("b2");
	        jform_price1_b2.setTable(jform_price1);
	        jform_price1_b2.setFieldLength(0);
	        jform_price1_b2.setIsKey("N");
	        jform_price1_b2.setIsNull("N");
	        jform_price1_b2.setIsQuery("N");
	        jform_price1_b2.setIsShow("Y");
	        jform_price1_b2.setShowType("text");
	        jform_price1_b2.setLength(10);
	        jform_price1_b2.setType("double");
	        jform_price1_b2.setOrderNum(6);
	        jform_price1_b2.setPointLength(2);
	        jform_price1_b2.setQueryMode("single");
	        jform_price1_b2.setContent("事业合计");
	        jform_price1_b2.setCreateBy("admin");
	        jform_price1_b2.setCreateDate(new Date());
	        jform_price1_b2.setCreateName("管理员");
	        jform_price1_b2.setDictField("");
	        jform_price1_b2.setDictTable("");
	        jform_price1_b2.setMainTable("");
	        jform_price1_b2.setMainField("");
	        commonDao.saveOrUpdate(jform_price1_b2);
	        
	        CgFormFieldEntity jform_price1_b3 = new CgFormFieldEntity();
	        jform_price1_b3.setFieldName("b3");
	        jform_price1_b3.setTable(jform_price1);
	        jform_price1_b3.setFieldLength(0);
	        jform_price1_b3.setIsKey("N");
	        jform_price1_b3.setIsNull("N");
	        jform_price1_b3.setIsQuery("N");
	        jform_price1_b3.setIsShow("Y");
	        jform_price1_b3.setShowType("text");
	        jform_price1_b3.setLength(10);
	        jform_price1_b3.setType("double");
	        jform_price1_b3.setOrderNum(7);
	        jform_price1_b3.setPointLength(2);
	        jform_price1_b3.setQueryMode("single");
	        jform_price1_b3.setContent("参公小计");
	        jform_price1_b3.setCreateBy("admin");
	        jform_price1_b3.setCreateDate(new Date());
	        jform_price1_b3.setCreateName("管理员");
	        jform_price1_b3.setDictField("");
	        jform_price1_b3.setDictTable("");
	        jform_price1_b3.setMainTable("");
	        jform_price1_b3.setMainField("");
	        commonDao.saveOrUpdate(jform_price1_b3);
	        
	        CgFormFieldEntity jform_price1_b31 = new CgFormFieldEntity();
	        jform_price1_b31.setFieldName("b31");
	        jform_price1_b31.setTable(jform_price1);
	        jform_price1_b31.setFieldLength(0);
	        jform_price1_b31.setIsKey("N");
	        jform_price1_b31.setIsNull("N");
	        jform_price1_b31.setIsQuery("N");
	        jform_price1_b31.setIsShow("Y");
	        jform_price1_b31.setShowType("text");
	        jform_price1_b31.setLength(100);
	        jform_price1_b31.setType("string");
	        jform_price1_b31.setOrderNum(8);
	        jform_price1_b31.setPointLength(0);
	        jform_price1_b31.setQueryMode("single");
	        jform_price1_b31.setContent("参公省");
	        jform_price1_b31.setCreateBy("admin");
	        jform_price1_b31.setCreateDate(new Date());
	        jform_price1_b31.setCreateName("管理员");
	        jform_price1_b31.setDictField("");
	        jform_price1_b31.setDictTable("");
	        jform_price1_b31.setMainTable("");
	        jform_price1_b31.setMainField("");
	        commonDao.saveOrUpdate(jform_price1_b31);
	        
	        CgFormFieldEntity jform_price1_b32 = new CgFormFieldEntity();
	        jform_price1_b32.setFieldName("b32");
	        jform_price1_b32.setTable(jform_price1);
	        jform_price1_b32.setFieldLength(0);
	        jform_price1_b32.setIsKey("N");
	        jform_price1_b32.setIsNull("N");
	        jform_price1_b32.setIsQuery("N");
	        jform_price1_b32.setIsShow("Y");
	        jform_price1_b32.setShowType("text");
	        jform_price1_b32.setLength(100);
	        jform_price1_b32.setType("string");
	        jform_price1_b32.setOrderNum(9);
	        jform_price1_b32.setPointLength(0);
	        jform_price1_b32.setQueryMode("single");
	        jform_price1_b32.setContent("参公市");
	        jform_price1_b32.setCreateBy("admin");
	        jform_price1_b32.setCreateDate(new Date());
	        jform_price1_b32.setCreateName("管理员");
	        jform_price1_b32.setDictField("");
	        jform_price1_b32.setDictTable("");
	        jform_price1_b32.setMainTable("");
	        jform_price1_b32.setMainField("");
	        commonDao.saveOrUpdate(jform_price1_b32);
	        
	        CgFormFieldEntity jform_price1_b33 = new CgFormFieldEntity();
	        jform_price1_b33.setFieldName("b33");
	        jform_price1_b33.setTable(jform_price1);
	        jform_price1_b33.setFieldLength(0);
	        jform_price1_b33.setIsKey("N");
	        jform_price1_b33.setIsNull("N");
	        jform_price1_b33.setIsQuery("N");
	        jform_price1_b33.setIsShow("Y");
	        jform_price1_b33.setShowType("text");
	        jform_price1_b33.setLength(100);
	        jform_price1_b33.setType("string");
	        jform_price1_b33.setOrderNum(10);
	        jform_price1_b33.setPointLength(0);
	        jform_price1_b33.setQueryMode("single");
	        jform_price1_b33.setContent("参公县");
	        jform_price1_b33.setCreateBy("admin");
	        jform_price1_b33.setCreateDate(new Date());
	        jform_price1_b33.setCreateName("管理员");
	        jform_price1_b33.setDictField("");
	        jform_price1_b33.setDictTable("");
	        jform_price1_b33.setMainTable("");
	        jform_price1_b33.setMainField("");
	        commonDao.saveOrUpdate(jform_price1_b33);
	        
	        CgFormFieldEntity jform_price1_c1 = new CgFormFieldEntity();
	        jform_price1_c1.setFieldName("c1");
	        jform_price1_c1.setTable(jform_price1);
	        jform_price1_c1.setFieldLength(0);
	        jform_price1_c1.setIsKey("N");
	        jform_price1_c1.setIsNull("N");
	        jform_price1_c1.setIsQuery("N");
	        jform_price1_c1.setIsShow("Y");
	        jform_price1_c1.setShowType("text");
	        jform_price1_c1.setLength(10);
	        jform_price1_c1.setType("double");
	        jform_price1_c1.setOrderNum(11);
	        jform_price1_c1.setPointLength(2);
	        jform_price1_c1.setQueryMode("single");
	        jform_price1_c1.setContent("全额拨款");
	        jform_price1_c1.setCreateBy("admin");
	        jform_price1_c1.setCreateDate(new Date());
	        jform_price1_c1.setCreateName("管理员");
	        jform_price1_c1.setDictField("");
	        jform_price1_c1.setDictTable("");
	        jform_price1_c1.setMainTable("");
	        jform_price1_c1.setMainField("");
	        commonDao.saveOrUpdate(jform_price1_c1);
	        
	        CgFormFieldEntity jform_price1_c2 = new CgFormFieldEntity();
	        jform_price1_c2.setFieldName("c2");
	        jform_price1_c2.setTable(jform_price1);
	        jform_price1_c2.setFieldLength(0);
	        jform_price1_c2.setIsKey("N");
	        jform_price1_c2.setIsNull("N");
	        jform_price1_c2.setIsQuery("N");
	        jform_price1_c2.setIsShow("Y");
	        jform_price1_c2.setShowType("text");
	        jform_price1_c2.setLength(10);
	        jform_price1_c2.setType("double");
	        jform_price1_c2.setOrderNum(12);
	        jform_price1_c2.setPointLength(2);
	        jform_price1_c2.setQueryMode("single");
	        jform_price1_c2.setContent("差额拨款");
	        jform_price1_c2.setCreateBy("admin");
	        jform_price1_c2.setCreateDate(new Date());
	        jform_price1_c2.setCreateName("管理员");
	        jform_price1_c2.setDictField("");
	        jform_price1_c2.setDictTable("");
	        jform_price1_c2.setMainTable("");
	        jform_price1_c2.setMainField("");
	        commonDao.saveOrUpdate(jform_price1_c2);
	        
	        CgFormFieldEntity jform_price1_c3 = new CgFormFieldEntity();
	        jform_price1_c3.setFieldName("c3");
	        jform_price1_c3.setTable(jform_price1);
	        jform_price1_c3.setFieldLength(0);
	        jform_price1_c3.setIsKey("N");
	        jform_price1_c3.setIsNull("N");
	        jform_price1_c3.setIsQuery("N");
	        jform_price1_c3.setIsShow("Y");
	        jform_price1_c3.setShowType("text");
	        jform_price1_c3.setLength(10);
	        jform_price1_c3.setType("double");
	        jform_price1_c3.setOrderNum(13);
	        jform_price1_c3.setPointLength(2);
	        jform_price1_c3.setQueryMode("single");
	        jform_price1_c3.setContent("自收自支");
	        jform_price1_c3.setCreateBy("admin");
	        jform_price1_c3.setCreateDate(new Date());
	        jform_price1_c3.setCreateName("管理员");
	        jform_price1_c3.setDictField("");
	        jform_price1_c3.setDictTable("");
	        jform_price1_c3.setMainTable("");
	        jform_price1_c3.setMainField("");
	        commonDao.saveOrUpdate(jform_price1_c3);
	        
	        CgFormFieldEntity jform_price1_d = new CgFormFieldEntity();
	        jform_price1_d.setFieldName("d");
	        jform_price1_d.setTable(jform_price1);
	        jform_price1_d.setFieldLength(0);
	        jform_price1_d.setIsKey("N");
	        jform_price1_d.setIsNull("N");
	        jform_price1_d.setIsQuery("Y");
	        jform_price1_d.setIsShow("Y");
	        jform_price1_d.setShowType("text");
	        jform_price1_d.setLength(10);
	        jform_price1_d.setType("int");
	        jform_price1_d.setOrderNum(14);
	        jform_price1_d.setPointLength(2);
	        jform_price1_d.setQueryMode("single");
	        jform_price1_d.setContent("经费合计");
	        jform_price1_d.setCreateBy("admin");
	        jform_price1_d.setCreateDate(new Date());
	        jform_price1_d.setCreateName("管理员");
	        jform_price1_d.setDictField("");
	        jform_price1_d.setDictTable("");
	        jform_price1_d.setMainTable("");
	        jform_price1_d.setMainField("");
	        commonDao.saveOrUpdate(jform_price1_d);
	        
	        CgFormFieldEntity jform_price1_d1 = new CgFormFieldEntity();
	        jform_price1_d1.setFieldName("d1");
	        jform_price1_d1.setTable(jform_price1);
	        jform_price1_d1.setFieldLength(0);
	        jform_price1_d1.setIsKey("N");
	        jform_price1_d1.setIsNull("N");
	        jform_price1_d1.setIsQuery("N");
	        jform_price1_d1.setIsShow("Y");
	        jform_price1_d1.setShowType("text");
	        jform_price1_d1.setLength(1,000);
	        jform_price1_d1.setType("string");
	        jform_price1_d1.setOrderNum(15);
	        jform_price1_d1.setPointLength(0);
	        jform_price1_d1.setQueryMode("single");
	        jform_price1_d1.setContent("机构资质");
	        jform_price1_d1.setCreateBy("admin");
	        jform_price1_d1.setCreateDate(new Date());
	        jform_price1_d1.setCreateName("管理员");
	        jform_price1_d1.setDictField("");
	        jform_price1_d1.setDictTable("");
	        jform_price1_d1.setMainTable("");
	        jform_price1_d1.setMainField("");
	        commonDao.saveOrUpdate(jform_price1_d1);
	        
	}


    	/** 
	 * @Description 
	 * @author tanghan 2013-7-28  
	 */
	private void repairFormHead() {
	 	CgFormHeadEntity cgHead1  = new CgFormHeadEntity();
		cgHead1.setTableName("jform_order_main");
		cgHead1.setIsTree("N");
		cgHead1.setIsPagination("Y");
		cgHead1.setIsCheckbox("N");
		cgHead1.setQuerymode("group");
		cgHead1.setIsDbSynch("N");
		cgHead1.setContent("订单主信息");
		cgHead1.setCreateBy("admin");
		cgHead1.setCreateDate(new Date());
		cgHead1.setJsPlugIn("0");
		cgHead1.setSqlPlugIn("0");
		cgHead1.setCreateName("管理员");
		cgHead1.setJformVersion("57");
		cgHead1.setJformType(2);
		commonDao.saveOrUpdate(cgHead1);
		
	 	CgFormHeadEntity cgHead2  = new CgFormHeadEntity();
		cgHead2.setTableName("jform_leave");
		cgHead2.setIsTree("N");
		cgHead2.setIsPagination("Y");
		cgHead2.setIsCheckbox("N");
		cgHead2.setQuerymode("group");
		cgHead2.setIsDbSynch("N");
		cgHead2.setContent("请假单");
		cgHead2.setCreateBy("admin");
		cgHead2.setCreateDate(new Date());
		cgHead2.setJsPlugIn("0");
		cgHead2.setSqlPlugIn("0");
		cgHead2.setCreateName("管理员");
		cgHead2.setJformVersion("51");
		cgHead2.setJformType(1);
		commonDao.saveOrUpdate(cgHead2);
		
	 	CgFormHeadEntity cgHead3  = new CgFormHeadEntity();
		cgHead3.setTableName("jform_order_customer");
		cgHead3.setIsTree("N");
		cgHead3.setIsPagination("Y");
		cgHead3.setIsCheckbox("Y");
		cgHead3.setQuerymode("single");
		cgHead3.setIsDbSynch("N");
		cgHead3.setContent("订单客户信息");
		cgHead3.setCreateBy("admin");
		cgHead3.setCreateDate(new Date());
		cgHead3.setJsPlugIn("0");
		cgHead3.setSqlPlugIn("0");
		cgHead3.setCreateName("管理员");
		cgHead3.setJformVersion("16");
		cgHead3.setJformType(3);
		commonDao.saveOrUpdate(cgHead3);
		
	 	CgFormHeadEntity cgHead4  = new CgFormHeadEntity();
		cgHead4.setTableName("jform_order_ticket");
		cgHead4.setIsTree("N");
		cgHead4.setIsPagination("Y");
		cgHead4.setIsCheckbox("N");
		cgHead4.setQuerymode("single");
		cgHead4.setIsDbSynch("N");
		cgHead4.setContent("订单机票信息");
		cgHead4.setCreateBy("admin");
		cgHead4.setCreateDate(new Date());
		cgHead4.setJsPlugIn("0");
		cgHead4.setSqlPlugIn("0");
		cgHead4.setCreateName("管理员");
		cgHead4.setJformVersion("20");
		cgHead4.setJformType(3);
		commonDao.saveOrUpdate(cgHead4);
		
	 	CgFormHeadEntity cgHead5  = new CgFormHeadEntity();
		cgHead5.setTableName("jform_price1");
		cgHead5.setIsTree("N");
		cgHead5.setIsPagination("Y");
		cgHead5.setIsCheckbox("N");
		cgHead5.setQuerymode("group");
		cgHead5.setIsDbSynch("N");
		cgHead5.setContent("价格认证机构统计表");
		cgHead5.setCreateBy("admin");
		cgHead5.setCreateDate(new Date());
		cgHead5.setJsPlugIn("0");
		cgHead5.setSqlPlugIn("0");
		cgHead5.setCreateName("管理员");
		cgHead5.setJformVersion("3");
		cgHead5.setJformType(1);
		commonDao.saveOrUpdate(cgHead5);
		
	}

		/** 
		 * @Description 
		 * @author tanghan 2013-7-28  
		 */
		private void repairCkEditor() {
		}
 

    /** 
	 * @Description 
	 * @author tanghan 2013-7-28  
	 */
	private void repairLog() {
		TSUser admin = commonDao.findByProperty(TSUser.class, "signatureFile", "images/renfang/qm/licf.gif").get(0);
		try {
          TSLog log1 = new TSLog();
          log1.setLogcontent("用户: admin登录成功");
          log1.setBroswer("Chrome");
          log1.setNote("169.254.200.136");
          log1.setTSUser(admin);
          log1.setOperatetime(DataUtils.parseTimestamp("2013-4-24 16:22:00", "yyyy-MM-dd HH:mm"));
          log1.setOperatetype((short)1);
          log1.setLoglevel((short)1);
          commonDao.saveOrUpdate(log1);
          
          TSLog log2 = new TSLog();
          log2.setLogcontent("用户: admin登录成功");
          log2.setBroswer("Chrome");
          log2.setNote("10.10.10.1");
          log2.setTSUser(admin);
          log2.setOperatetime(DataUtils.parseTimestamp("2013-4-24 17:12:00", "yyyy-MM-dd HH:mm"));
          log2.setOperatetype((short)1);
          log2.setLoglevel((short)1);
          commonDao.saveOrUpdate(log2);
          
          TSLog log3 = new TSLog();
          log3.setLogcontent("用户: admin登录成功");
          log3.setBroswer("Chrome");
          log3.setNote("169.254.218.201");
          log3.setTSUser(admin);
          log3.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:37:00", "yyyy-MM-dd HH:mm"));
          log3.setOperatetype((short)1);
          log3.setLoglevel((short)1);
          commonDao.saveOrUpdate(log3);
          
          TSLog log4 = new TSLog();
          log4.setLogcontent("用户admin已退出");
          log4.setBroswer("Chrome");
          log4.setNote("169.254.218.201");
          log4.setTSUser(admin);
          log4.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:38:00", "yyyy-MM-dd HH:mm"));
          log4.setOperatetype((short)1);
          log4.setLoglevel((short)2);
          commonDao.saveOrUpdate(log4);
          
          TSLog log5 = new TSLog();
          log5.setLogcontent("用户: admin登录成功");
          log5.setBroswer("MSIE 9.0");
          log5.setNote("169.254.218.201");
          log5.setTSUser(admin);
          log5.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:38:00", "yyyy-MM-dd HH:mm"));
          log5.setOperatetype((short)1);
          log5.setLoglevel((short)1);
          commonDao.saveOrUpdate(log5);
          
          TSLog log6 = new TSLog();
          log6.setLogcontent("JeecgDemo例子: 12被删除 成功");
          log6.setBroswer("MSIE 9.0");
          log6.setNote("169.254.218.201");
          log6.setTSUser(admin);
          log6.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:39:00", "yyyy-MM-dd HH:mm"));
          log6.setOperatetype((short)1);
          log6.setLoglevel((short)4);
          commonDao.saveOrUpdate(log6);
          
          TSLog log7 = new TSLog();
          log7.setLogcontent("JeecgDemo例子: 12被删除 成功");
          log7.setBroswer("MSIE 9.0");
          log7.setNote("169.254.218.201");
          log7.setTSUser(admin);
          log7.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:39:00", "yyyy-MM-dd HH:mm"));
          log7.setOperatetype((short)1);
          log7.setLoglevel((short)4);
          commonDao.saveOrUpdate(log7);
          
          TSLog log8 = new TSLog();
          log8.setLogcontent("JeecgDemo例子: 12被删除 成功");
          log8.setBroswer("Chrome");
          log8.setNote("169.254.218.201");
          log8.setTSUser(admin);
          log8.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:39:00", "yyyy-MM-dd HH:mm"));
          log8.setOperatetype((short)1);
          log8.setLoglevel((short)4);
          commonDao.saveOrUpdate(log8);
          
          TSLog log9 = new TSLog();
          log9.setLogcontent("权限: 单表模型被更新成功");
          log9.setBroswer("MSIE 9.0");
          log9.setNote("169.254.218.201");
          log9.setTSUser(admin);
          log9.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:39:00", "yyyy-MM-dd HH:mm"));
          log9.setOperatetype((short)1);
          log9.setLoglevel((short)5);
          commonDao.saveOrUpdate(log9);
          
          TSLog log10 = new TSLog();
          log10.setLogcontent("删除成功");
          log10.setBroswer("Chrome");
          log10.setNote("169.254.218.201");
          log10.setTSUser(admin);
          log10.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:39:00", "yyyy-MM-dd HH:mm"));
          log10.setOperatetype((short)1);
          log10.setLoglevel((short)4);
          commonDao.saveOrUpdate(log10);
          
          TSLog log11 = new TSLog();
          log11.setLogcontent("删除成功");
          log11.setBroswer("MSIE 9.0");
          log11.setNote("169.254.218.201");
          log11.setTSUser(admin);
          log11.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:39:00", "yyyy-MM-dd HH:mm"));
          log11.setOperatetype((short)1);
          log11.setLoglevel((short)4);
          commonDao.saveOrUpdate(log11);
          
          TSLog log12 = new TSLog();
          log12.setLogcontent("删除成功");
          log12.setBroswer("Chrome");
          log12.setNote("169.254.218.201");
          log12.setTSUser(admin);
          log12.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:39:00", "yyyy-MM-dd HH:mm"));
          log12.setOperatetype((short)1);
          log12.setLoglevel((short)4);
          commonDao.saveOrUpdate(log12);
          
          TSLog log13 = new TSLog();
          log13.setLogcontent("删除成功");
          log13.setBroswer("Firefox");
          log13.setNote("169.254.218.201");
          log13.setTSUser(admin);
          log13.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:39:00", "yyyy-MM-dd HH:mm"));
          log13.setOperatetype((short)1);
          log13.setLoglevel((short)4);
          commonDao.saveOrUpdate(log13);
          
          TSLog log14 = new TSLog();
          log14.setLogcontent("添加成功");
          log14.setBroswer("Chrome");
          log14.setNote("169.254.218.201");
          log14.setTSUser(admin);
          log14.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:40:00", "yyyy-MM-dd HH:mm"));
          log14.setOperatetype((short)1);
          log14.setLoglevel((short)3);
          commonDao.saveOrUpdate(log14);
          
          TSLog log15 = new TSLog();
          log15.setLogcontent("更新成功");
          log15.setBroswer("Chrome");
          log15.setNote("169.254.218.201");
          log15.setTSUser(admin);
          log15.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:40:00", "yyyy-MM-dd HH:mm"));
          log15.setOperatetype((short)1);
          log15.setLoglevel((short)5);
          commonDao.saveOrUpdate(log15);
          
          TSLog log16 = new TSLog();
          log16.setLogcontent("JeecgDemo例子: 12被添加成功");
          log16.setBroswer("Chrome");
          log16.setNote("169.254.218.201");
          log16.setTSUser(admin);
          log16.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:40:00", "yyyy-MM-dd HH:mm"));
          log16.setOperatetype((short)1);
          log16.setLoglevel((short)3);
          commonDao.saveOrUpdate(log16);
          
          TSLog log17 = new TSLog();
          log17.setLogcontent("部门: 信息部被更新成功");
          log17.setBroswer("Chrome");
          log17.setNote("169.254.218.201");
          log17.setTSUser(admin);
          log17.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:41:00", "yyyy-MM-dd HH:mm"));
          log17.setOperatetype((short)1);
          log17.setLoglevel((short)5);
          commonDao.saveOrUpdate(log17);
          
          TSLog log18 = new TSLog();
          log18.setLogcontent("部门: 设计部被更新成功");
          log18.setBroswer("Chrome");
          log18.setNote("169.254.218.201");
          log18.setTSUser(admin);
          log18.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:41:00", "yyyy-MM-dd HH:mm"));
          log18.setOperatetype((short)1);
          log18.setLoglevel((short)5);
          commonDao.saveOrUpdate(log18);
          
          TSLog log19 = new TSLog();
          log19.setLogcontent("类型: 信息部流程被更新成功");
          log19.setBroswer("Chrome");
          log19.setNote("169.254.218.201");
          log19.setTSUser(admin);
          log19.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:46:00", "yyyy-MM-dd HH:mm"));
          log19.setOperatetype((short)1);
          log19.setLoglevel((short)5);
          commonDao.saveOrUpdate(log19);
          
          TSLog log20 = new TSLog();
          log20.setLogcontent("用户: admin登录成功");
          log20.setBroswer("Chrome");
          log20.setNote("169.254.218.201");
          log20.setTSUser(admin);
          log20.setOperatetime(DataUtils.parseTimestamp("2013-3-10 15:48:00", "yyyy-MM-dd HH:mm"));
          log20.setOperatetype((short)1);
          log20.setLoglevel((short)1);
          commonDao.saveOrUpdate(log20);
          
          TSLog log21 = new TSLog();
          log21.setLogcontent("用户: admin登录成功");
          log21.setBroswer("Firefox");
          log21.setNote("169.254.218.201");
          log21.setTSUser(admin);
          log21.setOperatetime(DataUtils.parseTimestamp("2013-3-21 23:23:00", "yyyy-MM-dd HH:mm"));
          log21.setOperatetype((short)1);
          log21.setLoglevel((short)1);
          commonDao.saveOrUpdate(log21);
          
          TSLog log22 = new TSLog();
          log22.setLogcontent("用户: admin登录成功");
          log22.setBroswer("Chrome");
          log22.setNote("169.254.218.201");
          log22.setTSUser(admin);
          log22.setOperatetime(DataUtils.parseTimestamp("2013-3-21 23:26:00", "yyyy-MM-dd HH:mm"));
          log22.setOperatetype((short)1);
          log22.setLoglevel((short)1);
          commonDao.saveOrUpdate(log22);
          
          TSLog log23 = new TSLog();
          log23.setLogcontent("权限: 一对多实例被添加成功");
          log23.setBroswer("Chrome");
          log23.setNote("169.254.218.201");
          log23.setTSUser(admin);
          log23.setOperatetime(DataUtils.parseTimestamp("2013-3-21 23:28:00", "yyyy-MM-dd HH:mm"));
          log23.setOperatetype((short)1);
          log23.setLoglevel((short)3);
          commonDao.saveOrUpdate(log23);
          
          TSLog log24 = new TSLog();
          log24.setLogcontent("用户: admin登录成功");
          log24.setBroswer("Chrome");
          log24.setNote("169.254.218.201");
          log24.setTSUser(admin);
          log24.setOperatetime(DataUtils.parseTimestamp("2013-3-22 8:25:00", "yyyy-MM-dd HH:mm"));
          log24.setOperatetype((short)1);
          log24.setLoglevel((short)1);
          commonDao.saveOrUpdate(log24);
          
          TSLog log25 = new TSLog();
          log25.setLogcontent("用户: admin登录成功");
          log25.setBroswer("Firefox");
          log25.setNote("169.254.218.201");
          log25.setTSUser(admin);
          log25.setOperatetime(DataUtils.parseTimestamp("2013-3-22 9:05:00", "yyyy-MM-dd HH:mm"));
          log25.setOperatetype((short)1);
          log25.setLoglevel((short)1);
          commonDao.saveOrUpdate(log25);
          
          TSLog log26 = new TSLog();
          log26.setLogcontent("用户: admin登录成功");
          log26.setBroswer("Chrome");
          log26.setNote("169.254.218.201");
          log26.setTSUser(admin);
          log26.setOperatetime(DataUtils.parseTimestamp("2013-3-22 9:09:00", "yyyy-MM-dd HH:mm"));
          log26.setOperatetype((short)1);
          log26.setLoglevel((short)1);
          commonDao.saveOrUpdate(log26);
          
          TSLog log27 = new TSLog();
          log27.setLogcontent("用户: admin登录成功");
          log27.setBroswer("MSIE 8.0");
          log27.setNote("169.254.218.201");
          log27.setTSUser(admin);
          log27.setOperatetime(DataUtils.parseTimestamp("2013-3-22 9:28:00", "yyyy-MM-dd HH:mm"));
          log27.setOperatetype((short)1);
          log27.setLoglevel((short)1);
          commonDao.saveOrUpdate(log27);
          
          TSLog log28 = new TSLog();
          log28.setLogcontent("用户: admin登录成功");
          log28.setBroswer("Firefox");
          log28.setNote("169.254.218.201");
          log28.setTSUser(admin);
          log28.setOperatetime(DataUtils.parseTimestamp("2013-3-22 10:32:00", "yyyy-MM-dd HH:mm"));
          log28.setOperatetype((short)1);
          log28.setLoglevel((short)1);
          commonDao.saveOrUpdate(log28);
          
          TSLog log29 = new TSLog();
          log29.setLogcontent("物品: 笔记本添加成功");
          log29.setBroswer("Chrome");
          log29.setNote("169.254.218.201");
          log29.setTSUser(admin);
          log29.setOperatetime(DataUtils.parseTimestamp("2013-3-22 10:35:00", "yyyy-MM-dd HH:mm"));
          log29.setOperatetype((short)1);
          log29.setLoglevel((short)3);
          commonDao.saveOrUpdate(log29);
          
          TSLog log30 = new TSLog();
          log30.setLogcontent("用户: admin登录成功");
          log30.setBroswer("Firefox");
          log30.setNote("169.254.218.201");
          log30.setTSUser(admin);
          log30.setOperatetime(DataUtils.parseTimestamp("2013-3-22 10:41:00", "yyyy-MM-dd HH:mm"));
          log30.setOperatetype((short)1);
          log30.setLoglevel((short)1);
          commonDao.saveOrUpdate(log30);
          
          TSLog log31 = new TSLog();
          log31.setLogcontent("用户: admin登录成功");
          log31.setBroswer("Firefox");
          log31.setNote("169.254.218.201");
          log31.setTSUser(admin);
          log31.setOperatetime(DataUtils.parseTimestamp("2013-3-22 16:11:00", "yyyy-MM-dd HH:mm"));
          log31.setOperatetype((short)1);
          log31.setLoglevel((short)1);
          commonDao.saveOrUpdate(log31);
          
          TSLog log32 = new TSLog();
          log32.setLogcontent("用户: admin登录成功");
          log32.setBroswer("Chrome");
          log32.setNote("169.254.218.201");
          log32.setTSUser(admin);
          log32.setOperatetime(DataUtils.parseTimestamp("2013-3-22 21:49:00", "yyyy-MM-dd HH:mm"));
          log32.setOperatetype((short)1);
          log32.setLoglevel((short)1);
          commonDao.saveOrUpdate(log32);
          
          TSLog log33 = new TSLog();
          log33.setLogcontent("用户: admin登录成功");
          log33.setBroswer("Chrome");
          log33.setNote("169.254.218.201");
          log33.setTSUser(admin);
          log33.setOperatetime(DataUtils.parseTimestamp("2013-3-22 23:17:00", "yyyy-MM-dd HH:mm"));
          log33.setOperatetype((short)1);
          log33.setLoglevel((short)1);
          commonDao.saveOrUpdate(log33);
          
          TSLog log34 = new TSLog();
          log34.setLogcontent("用户: admin登录成功");
          log34.setBroswer("Chrome");
          log34.setNote("169.254.218.201");
          log34.setTSUser(admin);
          log34.setOperatetime(DataUtils.parseTimestamp("2013-3-22 23:27:00", "yyyy-MM-dd HH:mm"));
          log34.setOperatetype((short)1);
          log34.setLoglevel((short)1);
          commonDao.saveOrUpdate(log34);
          
          TSLog log35 = new TSLog();
          log35.setLogcontent("用户: admin登录成功");
          log35.setBroswer("Chrome");
          log35.setNote("169.254.218.201");
          log35.setTSUser(admin);
          log35.setOperatetime(DataUtils.parseTimestamp("2013-3-23 0:16:00", "yyyy-MM-dd HH:mm"));
          log35.setOperatetype((short)1);
          log35.setLoglevel((short)1);
          commonDao.saveOrUpdate(log35);
          
          TSLog log36 = new TSLog();
          log36.setLogcontent("用户: admin登录成功");
          log36.setBroswer("Chrome");
          log36.setNote("169.254.218.201");
          log36.setTSUser(admin);
          log36.setOperatetime(DataUtils.parseTimestamp("2013-3-23 0:22:00", "yyyy-MM-dd HH:mm"));
          log36.setOperatetype((short)1);
          log36.setLoglevel((short)1);
          commonDao.saveOrUpdate(log36);
          
          TSLog log37 = new TSLog();
          log37.setLogcontent("用户: admin登录成功");
          log37.setBroswer("Firefox");
          log37.setNote("169.254.218.201");
          log37.setTSUser(admin);
          log37.setOperatetime(DataUtils.parseTimestamp("2013-3-23 0:31:00", "yyyy-MM-dd HH:mm"));
          log37.setOperatetype((short)1);
          log37.setLoglevel((short)1);
          commonDao.saveOrUpdate(log37);
          
          TSLog log38 = new TSLog();
          log38.setLogcontent("用户: admin登录成功");
          log38.setBroswer("Chrome");
          log38.setNote("169.254.218.201");
          log38.setTSUser(admin);
          log38.setOperatetime(DataUtils.parseTimestamp("2013-3-23 14:23:00", "yyyy-MM-dd HH:mm"));
          log38.setOperatetype((short)1);
          log38.setLoglevel((short)1);
          commonDao.saveOrUpdate(log38);
          
          TSLog log39 = new TSLog();
          log39.setLogcontent("流程参数: 主任审批被添加成功");
          log39.setBroswer("Chrome");
          log39.setNote("169.254.218.201");
          log39.setTSUser(admin);
          log39.setOperatetime(DataUtils.parseTimestamp("2013-3-23 15:05:00", "yyyy-MM-dd HH:mm"));
          log39.setOperatetype((short)1);
          log39.setLoglevel((short)3);
          commonDao.saveOrUpdate(log39);
          
          TSLog log40 = new TSLog();
          log40.setLogcontent("业务参数: 入职申请被添加成功");
          log40.setBroswer("Firefox");
          log40.setNote("169.254.218.201");
          log40.setTSUser(admin);
          log40.setOperatetime(DataUtils.parseTimestamp("2013-3-23 15:05:00", "yyyy-MM-dd HH:mm"));
          log40.setOperatetype((short)1);
          log40.setLoglevel((short)3);
          commonDao.saveOrUpdate(log40);
          
          TSLog log41 = new TSLog();
          log41.setLogcontent("权限: 入职申请被添加成功");
          log41.setBroswer("Chrome");
          log41.setNote("169.254.218.201");
          log41.setTSUser(admin);
          log41.setOperatetime(DataUtils.parseTimestamp("2013-3-23 15:12:00", "yyyy-MM-dd HH:mm"));
          log41.setOperatetype((short)1);
          log41.setLoglevel((short)3);
          commonDao.saveOrUpdate(log41);
          
          TSLog log42 = new TSLog();
          log42.setLogcontent("权限: 入职办理被添加成功");
          log42.setBroswer("Firefox");
          log42.setNote("169.254.218.201");
          log42.setTSUser(admin);
          log42.setOperatetime(DataUtils.parseTimestamp("2013-3-23 15:13:00", "yyyy-MM-dd HH:mm"));
          log42.setOperatetype((short)1);
          log42.setLoglevel((short)3);
          commonDao.saveOrUpdate(log42);
          
          TSLog log43 = new TSLog();
          log43.setLogcontent("用户: admin登录成功");
          log43.setBroswer("Chrome");
          log43.setNote("10.10.10.1");
          log43.setTSUser(admin);
          log43.setOperatetime(DataUtils.parseTimestamp("2013-5-6 15:27:00", "yyyy-MM-dd HH:mm"));
          log43.setOperatetype((short)1);
          log43.setLoglevel((short)1);
          commonDao.saveOrUpdate(log43);
          
          TSLog log44 = new TSLog();
          log44.setLogcontent("用户: admin登录成功");
          log44.setBroswer("MSIE 8.0");
          log44.setNote("192.168.197.1");
          log44.setTSUser(admin);
          log44.setOperatetime(DataUtils.parseTimestamp("2013-7-7 15:16:00", "yyyy-MM-dd HH:mm"));
          log44.setOperatetype((short)1);
          log44.setLoglevel((short)1);
          commonDao.saveOrUpdate(log44);
          
          TSLog log45 = new TSLog();
          log45.setLogcontent("用户: admin登录成功");
          log45.setBroswer("MSIE 8.0");
          log45.setNote("192.168.197.1");
          log45.setTSUser(admin);
          log45.setOperatetime(DataUtils.parseTimestamp("2013-7-7 16:02:00", "yyyy-MM-dd HH:mm"));
          log45.setOperatetype((short)1);
          log45.setLoglevel((short)1);
          commonDao.saveOrUpdate(log45);
          
          TSLog log46 = new TSLog();
          log46.setLogcontent("用户: admin登录成功");
          log46.setBroswer("MSIE 8.0");
          log46.setNote("192.168.197.1");
          log46.setTSUser(admin);
          log46.setOperatetime(DataUtils.parseTimestamp("2013-7-7 16:07:00", "yyyy-MM-dd HH:mm"));
          log46.setOperatetype((short)1);
          log46.setLoglevel((short)1);
          commonDao.saveOrUpdate(log46);
          
          TSLog log47 = new TSLog();
          log47.setLogcontent("用户: admin登录成功");
          log47.setBroswer("MSIE 8.0");
          log47.setNote("192.168.197.1");
          log47.setTSUser(admin);
          log47.setOperatetime(DataUtils.parseTimestamp("2013-7-7 16:09:00", "yyyy-MM-dd HH:mm"));
          log47.setOperatetype((short)1);
          log47.setLoglevel((short)1);
          commonDao.saveOrUpdate(log47);
          
          TSLog log48 = new TSLog();
          log48.setLogcontent("用户: admin登录成功");
          log48.setBroswer("MSIE 8.0");
          log48.setNote("192.168.197.1");
          log48.setTSUser(admin);
          log48.setOperatetime(DataUtils.parseTimestamp("2013-7-7 16:11:00", "yyyy-MM-dd HH:mm"));
          log48.setOperatetype((short)1);
          log48.setLoglevel((short)1);
          commonDao.saveOrUpdate(log48);
          
          TSLog log49 = new TSLog();
          log49.setLogcontent("用户: admin登录成功");
          log49.setBroswer("MSIE 8.0");
          log49.setNote("192.168.197.1");
          log49.setTSUser(admin);
          log49.setOperatetime(DataUtils.parseTimestamp("2013-7-7 16:13:00", "yyyy-MM-dd HH:mm"));
          log49.setOperatetype((short)1);
          log49.setLoglevel((short)1);
          commonDao.saveOrUpdate(log49);
          
          TSLog log50 = new TSLog();
          log50.setLogcontent("用户: admin登录成功");
          log50.setBroswer("MSIE 8.0");
          log50.setNote("192.168.197.1");
          log50.setTSUser(admin);
          log50.setOperatetime(DataUtils.parseTimestamp("2013-7-7 16:16:00", "yyyy-MM-dd HH:mm"));
          log50.setOperatetype((short)1);
          log50.setLoglevel((short)1);
          commonDao.saveOrUpdate(log50);
          
          TSLog log51 = new TSLog();
          log51.setLogcontent("用户: admin登录成功");
          log51.setBroswer("MSIE 8.0");
          log51.setNote("192.168.197.1");
          log51.setTSUser(admin);
          log51.setOperatetime(DataUtils.parseTimestamp("2013-7-7 16:19:00", "yyyy-MM-dd HH:mm"));
          log51.setOperatetype((short)1);
          log51.setLoglevel((short)1);
          commonDao.saveOrUpdate(log51);
          
          TSLog log52 = new TSLog();
          log52.setLogcontent("用户: admin登录成功");
          log52.setBroswer("MSIE 8.0");
          log52.setNote("192.168.197.1");
          log52.setTSUser(admin);
          log52.setOperatetime(DataUtils.parseTimestamp("2013-7-7 16:27:00", "yyyy-MM-dd HH:mm"));
          log52.setOperatetype((short)1);
          log52.setLoglevel((short)1);
          commonDao.saveOrUpdate(log52);
          
          TSLog log53 = new TSLog();
          log53.setLogcontent("用户: admin登录成功");
          log53.setBroswer("MSIE 8.0");
          log53.setNote("192.168.197.1");
          log53.setTSUser(admin);
          log53.setOperatetime(DataUtils.parseTimestamp("2013-7-7 16:42:00", "yyyy-MM-dd HH:mm"));
          log53.setOperatetype((short)1);
          log53.setLoglevel((short)1);
          commonDao.saveOrUpdate(log53);
          
          TSLog log54 = new TSLog();
          log54.setLogcontent("用户: admin登录成功");
          log54.setBroswer("MSIE 8.0");
          log54.setNote("192.168.197.1");
          log54.setTSUser(admin);
          log54.setOperatetime(DataUtils.parseTimestamp("2013-7-7 16:44:00", "yyyy-MM-dd HH:mm"));
          log54.setOperatetype((short)1);
          log54.setLoglevel((short)1);
          commonDao.saveOrUpdate(log54);
          
          TSLog log55 = new TSLog();
          log55.setLogcontent("用户: admin登录成功");
          log55.setBroswer("MSIE 8.0");
          log55.setNote("192.168.197.1");
          log55.setTSUser(admin);
          log55.setOperatetime(DataUtils.parseTimestamp("2013-7-7 16:49:00", "yyyy-MM-dd HH:mm"));
          log55.setOperatetype((short)1);
          log55.setLoglevel((short)1);
          commonDao.saveOrUpdate(log55);
          
          TSLog log56 = new TSLog();
          log56.setLogcontent("用户: admin登录成功");
          log56.setBroswer("MSIE 8.0");
          log56.setNote("192.168.197.1");
          log56.setTSUser(admin);
          log56.setOperatetime(DataUtils.parseTimestamp("2013-7-7 16:50:00", "yyyy-MM-dd HH:mm"));
          log56.setOperatetype((short)1);
          log56.setLoglevel((short)1);
          commonDao.saveOrUpdate(log56);
          
          TSLog log57 = new TSLog();
          log57.setLogcontent("用户: admin登录成功");
          log57.setBroswer("MSIE 8.0");
          log57.setNote("192.168.197.1");
          log57.setTSUser(admin);
          log57.setOperatetime(DataUtils.parseTimestamp("2013-7-7 16:53:00", "yyyy-MM-dd HH:mm"));
          log57.setOperatetype((short)1);
          log57.setLoglevel((short)1);
          commonDao.saveOrUpdate(log57);
          
          TSLog log58 = new TSLog();
          log58.setLogcontent("修改成功");
          log58.setBroswer("MSIE 8.0");
          log58.setNote("192.168.197.1");
          log58.setTSUser(admin);
          log58.setOperatetime(DataUtils.parseTimestamp("2013-7-7 16:56:00", "yyyy-MM-dd HH:mm"));
          log58.setOperatetype((short)1);
          log58.setLoglevel((short)5);
          commonDao.saveOrUpdate(log58);
          
          TSLog log59 = new TSLog();
          log59.setLogcontent("用户: admin登录成功");
          log59.setBroswer("MSIE 8.0");
          log59.setNote("192.168.197.1");
          log59.setTSUser(admin);
          log59.setOperatetime(DataUtils.parseTimestamp("2013-7-7 16:59:00", "yyyy-MM-dd HH:mm"));
          log59.setOperatetype((short)1);
          log59.setLoglevel((short)1);
          commonDao.saveOrUpdate(log59);
          
          TSLog log60 = new TSLog();
          log60.setLogcontent("创建成功");
          log60.setBroswer("MSIE 8.0");
          log60.setNote("192.168.197.1");
          log60.setTSUser(admin);
          log60.setOperatetime(DataUtils.parseTimestamp("2013-7-7 17:22:00", "yyyy-MM-dd HH:mm"));
          log60.setOperatetype((short)1);
          log60.setLoglevel((short)3);
          commonDao.saveOrUpdate(log60);
          
          TSLog log61 = new TSLog();
          log61.setLogcontent("修改成功");
          log61.setBroswer("MSIE 8.0");
          log61.setNote("192.168.197.1");
          log61.setTSUser(admin);
          log61.setOperatetime(DataUtils.parseTimestamp("2013-7-7 17:26:00", "yyyy-MM-dd HH:mm"));
          log61.setOperatetype((short)1);
          log61.setLoglevel((short)5);
          commonDao.saveOrUpdate(log61);
          
          TSLog log62 = new TSLog();
          log62.setLogcontent("删除成功");
          log62.setBroswer("MSIE 8.0");
          log62.setNote("192.168.197.1");
          log62.setTSUser(admin);
          log62.setOperatetime(DataUtils.parseTimestamp("2013-7-7 17:31:00", "yyyy-MM-dd HH:mm"));
          log62.setOperatetype((short)1);
          log62.setLoglevel((short)4);
          commonDao.saveOrUpdate(log62);
          
          TSLog log63 = new TSLog();
          log63.setLogcontent("修改成功");
          log63.setBroswer("MSIE 8.0");
          log63.setNote("192.168.197.1");
          log63.setTSUser(admin);
          log63.setOperatetime(DataUtils.parseTimestamp("2013-7-7 17:35:00", "yyyy-MM-dd HH:mm"));
          log63.setOperatetype((short)1);
          log63.setLoglevel((short)5);
          commonDao.saveOrUpdate(log63);
          
          TSLog log64 = new TSLog();
          log64.setLogcontent("用户: admin登录成功");
          log64.setBroswer("MSIE 8.0");
          log64.setNote("192.168.197.1");
          log64.setTSUser(admin);
          log64.setOperatetime(DataUtils.parseTimestamp("2013-7-7 17:46:00", "yyyy-MM-dd HH:mm"));
          log64.setOperatetype((short)1);
          log64.setLoglevel((short)1);
          commonDao.saveOrUpdate(log64);
          
          TSLog log65 = new TSLog();
          log65.setLogcontent("用户: admin登录成功");
          log65.setBroswer("MSIE 8.0");
          log65.setNote("192.168.197.1");
          log65.setTSUser(admin);
          log65.setOperatetime(DataUtils.parseTimestamp("2013-7-7 17:55:00", "yyyy-MM-dd HH:mm"));
          log65.setOperatetype((short)1);
          log65.setLoglevel((short)1);
          commonDao.saveOrUpdate(log65);
          
          TSLog log66 = new TSLog();
          log66.setLogcontent("用户: admin登录成功");
          log66.setBroswer("MSIE 8.0");
          log66.setNote("192.168.197.1");
          log66.setTSUser(admin);
          log66.setOperatetime(DataUtils.parseTimestamp("2013-7-7 18:08:00", "yyyy-MM-dd HH:mm"));
          log66.setOperatetype((short)1);
          log66.setLoglevel((short)1);
          commonDao.saveOrUpdate(log66);
          
          TSLog log67 = new TSLog();
          log67.setLogcontent("用户: admin登录成功");
          log67.setBroswer("MSIE 8.0");
          log67.setNote("192.168.197.1");
          log67.setTSUser(admin);
          log67.setOperatetime(DataUtils.parseTimestamp("2013-7-7 18:13:00", "yyyy-MM-dd HH:mm"));
          log67.setOperatetype((short)1);
          log67.setLoglevel((short)1);
          commonDao.saveOrUpdate(log67);
          
          TSLog log68 = new TSLog();
          log68.setLogcontent("用户: admin登录成功");
          log68.setBroswer("MSIE 8.0");
          log68.setNote("192.168.197.1");
          log68.setTSUser(admin);
          log68.setOperatetime(DataUtils.parseTimestamp("2013-7-7 18:15:00", "yyyy-MM-dd HH:mm"));
          log68.setOperatetype((short)1);
          log68.setLoglevel((short)1);
          commonDao.saveOrUpdate(log68);
          
          TSLog log69 = new TSLog();
          log69.setLogcontent("修改成功");
          log69.setBroswer("MSIE 8.0");
          log69.setNote("192.168.197.1");
          log69.setTSUser(admin);
          log69.setOperatetime(DataUtils.parseTimestamp("2013-7-7 18:28:00", "yyyy-MM-dd HH:mm"));
          log69.setOperatetype((short)1);
          log69.setLoglevel((short)5);
          commonDao.saveOrUpdate(log69);
          
          TSLog log70 = new TSLog();
          log70.setLogcontent("修改成功");
          log70.setBroswer("MSIE 8.0");
          log70.setNote("192.168.197.1");
          log70.setTSUser(admin);
          log70.setOperatetime(DataUtils.parseTimestamp("2013-7-7 18:29:00", "yyyy-MM-dd HH:mm"));
          log70.setOperatetype((short)1);
          log70.setLoglevel((short)5);
          commonDao.saveOrUpdate(log70);
          
          TSLog log71 = new TSLog();
          log71.setLogcontent("修改成功");
          log71.setBroswer("MSIE 8.0");
          log71.setNote("192.168.197.1");
          log71.setTSUser(admin);
          log71.setOperatetime(DataUtils.parseTimestamp("2013-7-7 18:30:00", "yyyy-MM-dd HH:mm"));
          log71.setOperatetype((short)1);
          log71.setLoglevel((short)5);
          commonDao.saveOrUpdate(log71);
          
          TSLog log72 = new TSLog();
          log72.setLogcontent("修改成功");
          log72.setBroswer("MSIE 8.0");
          log72.setNote("192.168.197.1");
          log72.setTSUser(admin);
          log72.setOperatetime(DataUtils.parseTimestamp("2013-7-7 18:31:00", "yyyy-MM-dd HH:mm"));
          log72.setOperatetype((short)1);
          log72.setLoglevel((short)5);
          commonDao.saveOrUpdate(log72);
          
          TSLog log73 = new TSLog();
          log73.setLogcontent("修改成功");
          log73.setBroswer("MSIE 8.0");
          log73.setNote("192.168.197.1");
          log73.setTSUser(admin);
          log73.setOperatetime(DataUtils.parseTimestamp("2013-7-7 18:31:00", "yyyy-MM-dd HH:mm"));
          log73.setOperatetype((short)1);
          log73.setLoglevel((short)5);
          commonDao.saveOrUpdate(log73);
          
          TSLog log74 = new TSLog();
          log74.setLogcontent("物品: 555添加成功");
          log74.setBroswer("MSIE 9.0");
          log74.setNote("192.168.1.103");
          log74.setTSUser(admin);
          log74.setOperatetime(DataUtils.parseTimestamp("2013-3-20 23:03:00", "yyyy-MM-dd HH:mm"));
          log74.setOperatetype((short)1);
          log74.setLoglevel((short)3);
          commonDao.saveOrUpdate(log74);
          
          TSLog log75 = new TSLog();
          log75.setLogcontent("用户: admin登录成功");
          log75.setBroswer("MSIE 9.0");
          log75.setNote("192.168.1.103");
          log75.setTSUser(admin);
          log75.setOperatetime(DataUtils.parseTimestamp("2013-3-20 23:19:00", "yyyy-MM-dd HH:mm"));
          log75.setOperatetype((short)1);
          log75.setLoglevel((short)1);
          commonDao.saveOrUpdate(log75);
          
          TSLog log76 = new TSLog();
          log76.setLogcontent("用户: admin登录成功");
          log76.setBroswer("MSIE 9.0");
          log76.setNote("192.168.1.103");
          log76.setTSUser(admin);
          log76.setOperatetime(DataUtils.parseTimestamp("2013-3-21 20:09:00", "yyyy-MM-dd HH:mm"));
          log76.setOperatetype((short)1);
          log76.setLoglevel((short)1);
          commonDao.saveOrUpdate(log76);
          
          TSLog log77 = new TSLog();
          log77.setLogcontent("用户: admin登录成功");
          log77.setBroswer("MSIE 9.0");
          log77.setNote("192.168.1.103");
          log77.setTSUser(admin);
          log77.setOperatetime(DataUtils.parseTimestamp("2013-3-21 20:27:00", "yyyy-MM-dd HH:mm"));
          log77.setOperatetype((short)1);
          log77.setLoglevel((short)1);
          commonDao.saveOrUpdate(log77);
          
          TSLog log78 = new TSLog();
          log78.setLogcontent("用户: admin登录成功");
          log78.setBroswer("MSIE 9.0");
          log78.setNote("192.168.1.103");
          log78.setTSUser(admin);
          log78.setOperatetime(DataUtils.parseTimestamp("2013-3-21 20:44:00", "yyyy-MM-dd HH:mm"));
          log78.setOperatetype((short)1);
          log78.setLoglevel((short)1);
          commonDao.saveOrUpdate(log78);
          
          TSLog log79 = new TSLog();
          log79.setLogcontent("用户: admin登录成功");
          log79.setBroswer("MSIE 9.0");
          log79.setNote("192.168.1.103");
          log79.setTSUser(admin);
          log79.setOperatetime(DataUtils.parseTimestamp("2013-3-21 20:54:00", "yyyy-MM-dd HH:mm"));
          log79.setOperatetype((short)1);
          log79.setLoglevel((short)1);
          commonDao.saveOrUpdate(log79);
          
          TSLog log80 = new TSLog();
          log80.setLogcontent("用户: admin登录成功");
          log80.setBroswer("MSIE 9.0");
          log80.setNote("192.168.1.103");
          log80.setTSUser(admin);
          log80.setOperatetime(DataUtils.parseTimestamp("2013-3-21 21:01:00", "yyyy-MM-dd HH:mm"));
          log80.setOperatetype((short)1);
          log80.setLoglevel((short)1);
          commonDao.saveOrUpdate(log80);
          
          TSLog log81 = new TSLog();
          log81.setLogcontent("用户: admin登录成功");
          log81.setBroswer("MSIE 9.0");
          log81.setNote("192.168.1.103");
          log81.setTSUser(admin);
          log81.setOperatetime(DataUtils.parseTimestamp("2013-3-21 21:13:00", "yyyy-MM-dd HH:mm"));
          log81.setOperatetype((short)1);
          log81.setLoglevel((short)1);
          commonDao.saveOrUpdate(log81);
          
          TSLog log82 = new TSLog();
          log82.setLogcontent("物品: 55添加成功");
          log82.setBroswer("MSIE 9.0");
          log82.setNote("192.168.1.103");
          log82.setTSUser(admin);
          log82.setOperatetime(DataUtils.parseTimestamp("2013-3-21 21:15:00", "yyyy-MM-dd HH:mm"));
          log82.setOperatetype((short)1);
          log82.setLoglevel((short)3);
          commonDao.saveOrUpdate(log82);
          
          TSLog log83 = new TSLog();
          log83.setLogcontent("用户: admin登录成功");
          log83.setBroswer("MSIE 9.0");
          log83.setNote("192.168.1.103");
          log83.setTSUser(admin);
          log83.setOperatetime(DataUtils.parseTimestamp("2013-3-21 21:22:00", "yyyy-MM-dd HH:mm"));
          log83.setOperatetype((short)1);
          log83.setLoglevel((short)1);
          commonDao.saveOrUpdate(log83);
          
          TSLog log84 = new TSLog();
          log84.setLogcontent("物品: 55添加成功");
          log84.setBroswer("MSIE 9.0");
          log84.setNote("192.168.1.103");
          log84.setTSUser(admin);
          log84.setOperatetime(DataUtils.parseTimestamp("2013-3-21 21:23:00", "yyyy-MM-dd HH:mm"));
          log84.setOperatetype((short)1);
          log84.setLoglevel((short)3);
          commonDao.saveOrUpdate(log84);
          
          TSLog log85 = new TSLog();
          log85.setLogcontent("物品: 33添加成功");
          log85.setBroswer("MSIE 9.0");
          log85.setNote("192.168.1.103");
          log85.setTSUser(admin);
          log85.setOperatetime(DataUtils.parseTimestamp("2013-3-21 21:23:00", "yyyy-MM-dd HH:mm"));
          log85.setOperatetype((short)1);
          log85.setLoglevel((short)3);
          commonDao.saveOrUpdate(log85);
          
          TSLog log86 = new TSLog();
          log86.setLogcontent("用户: admin登录成功");
          log86.setBroswer("MSIE 9.0");
          log86.setNote("192.168.1.103");
          log86.setTSUser(admin);
          log86.setOperatetime(DataUtils.parseTimestamp("2013-3-21 21:25:00", "yyyy-MM-dd HH:mm"));
          log86.setOperatetype((short)1);
          log86.setLoglevel((short)1);
          commonDao.saveOrUpdate(log86);
          
          TSLog log87 = new TSLog();
          log87.setLogcontent("用户: admin登录成功");
          log87.setBroswer("MSIE 9.0");
          log87.setNote("192.168.1.103");
          log87.setTSUser(admin);
          log87.setOperatetime(DataUtils.parseTimestamp("2013-3-21 21:27:00", "yyyy-MM-dd HH:mm"));
          log87.setOperatetype((short)1);
          log87.setLoglevel((short)1);
          commonDao.saveOrUpdate(log87);
          
          TSLog log88 = new TSLog();
          log88.setLogcontent("权限: 采购审批被添加成功");
          log88.setBroswer("MSIE 9.0");
          log88.setNote("192.168.1.103");
          log88.setTSUser(admin);
          log88.setOperatetime(DataUtils.parseTimestamp("2013-3-21 21:29:00", "yyyy-MM-dd HH:mm"));
          log88.setOperatetype((short)1);
          log88.setLoglevel((short)3);
          commonDao.saveOrUpdate(log88);
          
          TSLog log89 = new TSLog();
          log89.setLogcontent("权限: 采购审批被更新成功");
          log89.setBroswer("MSIE 9.0");
          log89.setNote("192.168.1.103");
          log89.setTSUser(admin);
          log89.setOperatetime(DataUtils.parseTimestamp("2013-3-21 21:29:00", "yyyy-MM-dd HH:mm"));
          log89.setOperatetype((short)1);
          log89.setLoglevel((short)5);
          commonDao.saveOrUpdate(log89);
          
          TSLog log90 = new TSLog();
          log90.setLogcontent("权限: 采购审批被更新成功");
          log90.setBroswer("MSIE 9.0");
          log90.setNote("192.168.1.103");
          log90.setTSUser(admin);
          log90.setOperatetime(DataUtils.parseTimestamp("2013-3-21 21:30:00", "yyyy-MM-dd HH:mm"));
          log90.setOperatetype((short)1);
          log90.setLoglevel((short)5);
          commonDao.saveOrUpdate(log90);
          
          TSLog log91 = new TSLog();
          log91.setLogcontent("用户: admin更新成功");
          log91.setBroswer("MSIE 9.0");
          log91.setNote("192.168.1.103");
          log91.setTSUser(admin);
          log91.setOperatetime(DataUtils.parseTimestamp("2013-3-21 21:31:00", "yyyy-MM-dd HH:mm"));
          log91.setOperatetype((short)1);
          log91.setLoglevel((short)5);
          commonDao.saveOrUpdate(log91);
          
          TSLog log92 = new TSLog();
          log92.setLogcontent("流程参数: 采购审批员审批被添加成功");
          log92.setBroswer("MSIE 9.0");
          log92.setNote("192.168.1.103");
          log92.setTSUser(admin);
          log92.setOperatetime(DataUtils.parseTimestamp("2013-3-21 21:36:00", "yyyy-MM-dd HH:mm"));
          log92.setOperatetype((short)1);
          log92.setLoglevel((short)3);
          commonDao.saveOrUpdate(log92);
          
          TSLog log93 = new TSLog();
          log93.setLogcontent("流程参数: 采购审批员审批被更新成功");
          log93.setBroswer("MSIE 9.0");
          log93.setNote("192.168.1.103");
          log93.setTSUser(admin);
          log93.setOperatetime(DataUtils.parseTimestamp("2013-3-21 21:36:00", "yyyy-MM-dd HH:mm"));
          log93.setOperatetype((short)1);
          log93.setLoglevel((short)5);
          commonDao.saveOrUpdate(log93);
          
          TSLog log94 = new TSLog();
          log94.setLogcontent("流程参数: 采购审批员审批被更新成功");
          log94.setBroswer("MSIE 9.0");
          log94.setNote("192.168.1.103");
          log94.setTSUser(admin);
          log94.setOperatetime(DataUtils.parseTimestamp("2013-3-21 21:37:00", "yyyy-MM-dd HH:mm"));
          log94.setOperatetype((short)1);
          log94.setLoglevel((short)5);
          commonDao.saveOrUpdate(log94);
          
          TSLog log95 = new TSLog();
          log95.setLogcontent("流程类别: 采购审批员审批被删除 成功");
          log95.setBroswer("MSIE 9.0");
          log95.setNote("192.168.1.103");
          log95.setTSUser(admin);
          log95.setOperatetime(DataUtils.parseTimestamp("2013-3-21 21:38:00", "yyyy-MM-dd HH:mm"));
          log95.setOperatetype((short)1);
          log95.setLoglevel((short)4);
          commonDao.saveOrUpdate(log95);
          
          TSLog log96 = new TSLog();
          log96.setLogcontent("物品: 44添加成功");
          log96.setBroswer("MSIE 9.0");
          log96.setNote("192.168.1.103");
          log96.setTSUser(admin);
          log96.setOperatetime(DataUtils.parseTimestamp("2013-3-21 21:43:00", "yyyy-MM-dd HH:mm"));
          log96.setOperatetype((short)1);
          log96.setLoglevel((short)3);
          commonDao.saveOrUpdate(log96);
          
          TSLog log97 = new TSLog();
          log97.setLogcontent("用户: admin登录成功");
          log97.setBroswer("MSIE 9.0");
          log97.setNote("192.168.1.105");
          log97.setTSUser(admin);
          log97.setOperatetime(DataUtils.parseTimestamp("2013-2-7 10:10:00", "yyyy-MM-dd HH:mm"));
          log97.setOperatetype((short)1);
          log97.setLoglevel((short)1);
          commonDao.saveOrUpdate(log97);
          
          TSLog log98 = new TSLog();
          log98.setLogcontent("权限: 上传下载被添加成功");
          log98.setBroswer("MSIE 9.0");
          log98.setNote("192.168.1.105");
          log98.setTSUser(admin);
          log98.setOperatetime(DataUtils.parseTimestamp("2013-2-7 11:07:00", "yyyy-MM-dd HH:mm"));
          log98.setOperatetype((short)1);
          log98.setLoglevel((short)3);
          commonDao.saveOrUpdate(log98);
          
          TSLog log99 = new TSLog();
          log99.setLogcontent("权限: 插件演示被删除成功");
          log99.setBroswer("MSIE 9.0");
          log99.setNote("192.168.1.105");
          log99.setTSUser(admin);
          log99.setOperatetime(DataUtils.parseTimestamp("2013-2-7 11:07:00", "yyyy-MM-dd HH:mm"));
          log99.setOperatetype((short)1);
          log99.setLoglevel((short)4);
          commonDao.saveOrUpdate(log99);
          
          TSLog log100 = new TSLog();
          log100.setLogcontent("用户: admin登录成功");
          log100.setBroswer("MSIE 9.0");
          log100.setNote("192.168.1.105");
          log100.setTSUser(admin);
          log100.setOperatetime(DataUtils.parseTimestamp("2013-2-7 11:07:00", "yyyy-MM-dd HH:mm"));
          log100.setOperatetype((short)1);
          log100.setLoglevel((short)1);
          commonDao.saveOrUpdate(log100);
          
        } catch (ParseException e) {
			e.printStackTrace();
		}
	}

    /** 
	 * @Description 
	 * @author tanghan 2013-7-22  
	 */
	private void repairBaseUser() {
		TSDepart eiu = commonDao.findByProperty(TSDepart.class, "departname", "信息部").get(0);
		TSDepart RAndD = commonDao.findByProperty(TSDepart.class, "departname", "信息部").get(0);
        TSBaseUser tsBaseUser1 = new TSBaseUser();
        tsBaseUser1.setStatus((short)1);
        tsBaseUser1.setRealName("管理员");
        tsBaseUser1.setUserName("admin");
        tsBaseUser1.setPassword("c44b01947c9e6e3f");
        tsBaseUser1.setTSDepart(eiu);
        tsBaseUser1.setActivitiSync((short)1);
        commonDao.saveOrUpdate(tsBaseUser1);
        
        TSBaseUser tsBaseUser2 = new TSBaseUser();
        tsBaseUser2.setStatus((short)1);
        tsBaseUser2.setRealName("张代浩");
        tsBaseUser2.setUserName("scott");
        tsBaseUser2.setPassword("97c07a884bf272b5");
        tsBaseUser2.setTSDepart(eiu);
        tsBaseUser2.setActivitiSync((short)0);
        commonDao.saveOrUpdate(tsBaseUser2);
        
        TSBaseUser tsBaseUser3 = new TSBaseUser();
        tsBaseUser3.setStatus((short)1);
        tsBaseUser3.setRealName("采购员");
        tsBaseUser3.setUserName("cgy");
        tsBaseUser3.setPassword("f2322ec2fb9f40d1");
        tsBaseUser3.setTSDepart(eiu);
        tsBaseUser3.setActivitiSync((short)0);
        commonDao.saveOrUpdate(tsBaseUser3);
        
        TSBaseUser tsBaseUser4 = new TSBaseUser();
        tsBaseUser4.setStatus((short)1);
        tsBaseUser4.setRealName("采购审批员");
        tsBaseUser4.setUserName("cgspy");
        tsBaseUser4.setPassword("a324509dc1a3089a");
        tsBaseUser4.setTSDepart(eiu);
        tsBaseUser4.setActivitiSync((short)1);
        commonDao.saveOrUpdate(tsBaseUser4);
        
	}
 

    /** 
	 * @Description 
	 * @author tanghan 2013-7-22  
	 */
	private void repairType() {
         TSType type1 = new TSType();
         type1.setTypename("菜单图标");
         type1.setTypecode("2");
         commonDao.saveOrUpdate(type1);
         
         TSType type2 = new TSType();
         type2.setTypename("系统图标");
         type2.setTypecode("1");
         commonDao.saveOrUpdate(type2);
         
         TSType type3 = new TSType();
         type3.setTypename("附件");
         type3.setTypecode("files");
         commonDao.saveOrUpdate(type3);
         
         TSType type4 = new TSType();
         type4.setTypename("优质订单");
         type4.setTypecode("1");
         commonDao.saveOrUpdate(type4);
         
         TSType type5 = new TSType();
         type5.setTypename("普通订单");
         type5.setTypecode("2");
         commonDao.saveOrUpdate(type5);
         
         TSType type6 = new TSType();
         type6.setTypename("签约客户");
         type6.setTypecode("1");
         commonDao.saveOrUpdate(type6);
         
         TSType type7 = new TSType();
         type7.setTypename("普通客户");
         type7.setTypecode("2");
         commonDao.saveOrUpdate(type7);
         
         TSType type8 = new TSType();
         type8.setTypename("特殊服务");
         type8.setTypecode("1");
         commonDao.saveOrUpdate(type8);
         
         TSType type9 = new TSType();
         type9.setTypename("普通服务");
         type9.setTypecode("2");
         commonDao.saveOrUpdate(type9);
         
         TSType type10 = new TSType();
         type10.setTypename("单条件查询");
         type10.setTypecode("single");
         commonDao.saveOrUpdate(type10);
         
         TSType type11 = new TSType();
         type11.setTypename("范围查询");
         type11.setTypecode("group");
         commonDao.saveOrUpdate(type11);
         
         TSType type12 = new TSType();
         type12.setTypename("是");
         type12.setTypecode("Y");
         commonDao.saveOrUpdate(type12);
         
         TSType type13 = new TSType();
         type13.setTypename("否");
         type13.setTypecode("N");
         commonDao.saveOrUpdate(type13);
         
         TSType type14 = new TSType();
         type14.setTypename("Integer");
         type14.setTypecode("Integer");
         commonDao.saveOrUpdate(type14);
         
         TSType type15 = new TSType();
         type15.setTypename("Date");
         type15.setTypecode("Date");
         commonDao.saveOrUpdate(type15);
         
         TSType type16 = new TSType();
         type16.setTypename("String");
         type16.setTypecode("String");
         commonDao.saveOrUpdate(type16);
         
         TSType type17 = new TSType();
         type17.setTypename("Long");
         type17.setTypecode("Long");
         commonDao.saveOrUpdate(type17);
         
         TSType type18 = new TSType();
         type18.setTypename("工作流引擎表");
         type18.setTypecode("act");
         commonDao.saveOrUpdate(type18);
         
         TSType type19 = new TSType();
         type19.setTypename("系统基础表");
         type19.setTypecode("t_s");
         commonDao.saveOrUpdate(type19);
         
         TSType type20 = new TSType();
         type20.setTypename("业务表");
         type20.setTypecode("t_b");
         commonDao.saveOrUpdate(type20);
         
         TSType type21 = new TSType();
         type21.setTypename("自定义引擎表");
         type21.setTypecode("t_p");
         commonDao.saveOrUpdate(type21);
         
         TSType type22 = new TSType();
         type22.setTypename("新闻");
         type22.setTypecode("news");
         commonDao.saveOrUpdate(type22);
         
         TSType type23 = new TSType();
         type23.setTypename("男性");
         type23.setTypecode("0");
         commonDao.saveOrUpdate(type23);
         
         TSType type24 = new TSType();
         type24.setTypename("女性");
         type24.setTypecode("1");
         commonDao.saveOrUpdate(type24);
         
	}

	private void repairTypeAndGroup() {
		TSTypegroup tsTypegroup1 = new TSTypegroup();
		tsTypegroup1.setTypegroupname("图标类型");
		tsTypegroup1.setTypegroupcode("icontype");
		commonDao.saveOrUpdate(tsTypegroup1);
		TSTypegroup tsTypegroup2 = new TSTypegroup();
		tsTypegroup2.setTypegroupname("订单类型");
		tsTypegroup2.setTypegroupcode("order");
		commonDao.saveOrUpdate(tsTypegroup2);
		TSTypegroup tsTypegroup3 = new TSTypegroup();
		tsTypegroup3.setTypegroupname("客户类型");
		tsTypegroup3.setTypegroupcode("custom");
		commonDao.saveOrUpdate(tsTypegroup3);
		TSTypegroup tsTypegroup4 = new TSTypegroup();
		tsTypegroup4.setTypegroupname("服务项目类型");
		tsTypegroup4.setTypegroupcode("service");
		commonDao.saveOrUpdate(tsTypegroup4);
		TSTypegroup tsTypegroup5 = new TSTypegroup();
		tsTypegroup5.setTypegroupname("查询模式");
		tsTypegroup5.setTypegroupcode("searchmode");
		commonDao.saveOrUpdate(tsTypegroup5);
		TSTypegroup tsTypegroup6 = new TSTypegroup();
		tsTypegroup6.setTypegroupname("逻辑条件");
		tsTypegroup6.setTypegroupcode("yesorno");
		commonDao.saveOrUpdate(tsTypegroup6);
		TSTypegroup tsTypegroup7 = new TSTypegroup();
		tsTypegroup7.setTypegroupname("字段类型");
		tsTypegroup7.setTypegroupcode("fieldtype");
		commonDao.saveOrUpdate(tsTypegroup7);
		TSTypegroup tsTypegroup8 = new TSTypegroup();
		tsTypegroup8.setTypegroupname("数据表");
		tsTypegroup8.setTypegroupcode("database");
		commonDao.saveOrUpdate(tsTypegroup8);
		TSTypegroup tsTypegroup9 = new TSTypegroup();
		tsTypegroup9.setTypegroupname("文档分类");
		tsTypegroup9.setTypegroupcode("fieltype");
		commonDao.saveOrUpdate(tsTypegroup9);
		TSTypegroup tsTypegroup10 = new TSTypegroup();
		tsTypegroup10.setTypegroupname("性别类");
		tsTypegroup10.setTypegroupcode("sex");
		commonDao.saveOrUpdate(tsTypegroup10);
	}
	 
	/** 
	 * @Description 
	 * @author tanghan 2013-7-20  
	 */
	private void repairUser() {
       TSUser suser1 = new TSUser();
       suser1.setMobilePhone("
Expression pp.mobilePhone is undefined on line 195, column 40 in init.ftl.
The problematic instruction:
----------
==> ${pp.mobilePhone} [on line 195, column 38 in init.ftl]
----------

Java backtrace for programmers:
----------
freemarker.core.InvalidReferenceException: Expression pp.mobilePhone is undefined on line 195, column 40 in init.ftl.
	at freemarker.core.TemplateObject.assertNonNull(TemplateObject.java:125)
	at freemarker.core.Expression.getStringValue(Expression.java:118)
	at freemarker.core.Expression.getStringValue(Expression.java:93)
	at freemarker.core.DollarVariable.accept(DollarVariable.java:76)
	at freemarker.core.Environment.visit(Environment.java:221)
	at freemarker.core.MixedContent.accept(MixedContent.java:92)
	at freemarker.core.Environment.visit(Environment.java:221)
	at freemarker.core.IteratorBlock$Context.runLoop(IteratorBlock.java:179)
	at freemarker.core.Environment.visit(Environment.java:428)
	at freemarker.core.IteratorBlock.accept(IteratorBlock.java:102)
	at freemarker.core.Environment.visit(Environment.java:221)
	at freemarker.core.MixedContent.accept(MixedContent.java:92)
	at freemarker.core.Environment.visit(Environment.java:221)
	at freemarker.core.Environment.process(Environment.java:199)
	at freemarker.template.Template.process(Template.java:259)
	at test.JeecgInitDB.main(JeecgInitDB.java:285)
