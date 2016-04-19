package org.jeecgframework.web.system.person.service.impl.person;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.jeecgframework.web.system.person.service.person.PersonServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("personService")
@Transactional
public class PersonServiceImpl extends CommonServiceImpl implements PersonServiceI {
	
}