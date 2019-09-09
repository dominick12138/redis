package com.dominick.redis.modules.EmployeeInfo.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.dominick.redis.modules.EmployeeInfo.dao.EmployeeDao;
import com.dominick.redis.modules.EmployeeInfo.entity.Employee;
import com.dominick.redis.framework.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * @author dominick
 * @2019/8/28 - 16:52
 * @function:
 */
@Service
@Transactional(readOnly = false)
public class EmployeeService extends CrudService<EmployeeDao,Employee> {

	@Autowired
	EmployeeDao employeeDao;

	@Cacheable(cacheNames = "emp",key = "'[' +#id +']'"/*condition = "#id>1",unless = "#id==106"*/)  //将方法返回的结果缓存起来
	public Employee get(Serializable id){
		System.out.println("查询 id 号为 " + id + "的员工");
		return super.get(id);
	}

	public int insert(Employee employee){
		return super.insert(employee);
	}


	@CachePut(cacheNames = "emp",key = "'[' + #a0.id +']'")
	public Employee update(Employee employee){
		System.out.println("查库了，并更新了缓存Id:" + employee.getId());
		super.update(employee);
		return employee;
	}

	@CacheEvict(cacheNames = "emp",/*key = "'[' + #id +']'"*/ allEntries = true)
	public int delete(Serializable id){
		System.out.println("执行删除操作" + id);
		return super.delete(id);
	}

	//定义复杂的缓存规则
	@Caching(
			cacheable={
				@Cacheable(value = "emp",key = "#lastName")
			},
			put={
				@CachePut(value = "emp",key = "'[' + #result.id + ']'"),
				@CachePut(value = "emp",key = "#lastName")
			},
			evict = {

			}
	)
	public Employee selectByLastName(String  lastName){
		return employeeDao.selectByLastName(lastName);
	}


}
