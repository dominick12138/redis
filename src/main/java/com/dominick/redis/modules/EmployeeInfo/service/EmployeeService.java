package com.dominick.redis.modules.EmployeeInfo.service;

import com.dominick.redis.modules.EmployeeInfo.dao.EmployeeDao;
import com.dominick.redis.modules.EmployeeInfo.entity.Employee;
import com.dominick.redis.framework.service.CrudService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * @author dominick
 * @2019/8/28 - 16:52
 * @function:
 */
@Service
@Transactional(readOnly = true)
public class EmployeeService extends CrudService<EmployeeDao,Employee> {

	public Employee get(Serializable id){
		return super.get(id);
	}

	public int insert(Employee employee){
		return super.inset(employee);
	}

	public Employee update(Employee employee){
		return super.update(employee);
	}

	public int delete(Serializable id){
		return super.delete(id);
	}

}
