package org.jeecgframework.web.system.person.controller.person;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.pojo.base.TSUser;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import org.jeecgframework.web.system.person.entity.person.PersonEntity;
import org.jeecgframework.web.system.person.service.person.PersonServiceI;

/**   
 * @Title: Controller
 * @Description: 员工管理
 * @author zhangdaihao
 * @date 2014-07-25 10:42:02
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/personController")
public class PersonController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(PersonController.class);

	@Autowired
	private PersonServiceI personService;
	@Autowired
	private SystemService systemService;
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	/**
	 * 员工管理列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "person")
	public ModelAndView person(HttpServletRequest request) {
		return new ModelAndView("system/person/person/personList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(PersonEntity person,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(PersonEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, person, request.getParameterMap());
		this.personService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除员工管理
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(PersonEntity person, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		person = systemService.getEntity(PersonEntity.class, person.getId());
		message = "员工管理删除成功";
		personService.delete(person);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加员工管理
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(PersonEntity person, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(person.getId())) {
			message = "员工管理更新成功";
			PersonEntity t = personService.get(PersonEntity.class, person.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(person, t);
				personService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "员工管理更新失败";
			}
		} else {
			message = "员工管理添加成功";
			personService.save(person);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 员工管理列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(PersonEntity person, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(person.getId())) {
			person = personService.getEntity(PersonEntity.class, person.getId());
			req.setAttribute("personPage", person);
		}
		return new ModelAndView("system/person/person/person");
	}
}
