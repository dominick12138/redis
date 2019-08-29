package com.dominick.redis.modules.EmployeeInfo.dao;


import com.dominick.redis.framework.persistence.annotation.MyBatisDao;
import com.dominick.redis.modules.EmployeeInfo.entity.Employee;
import com.dominick.redis.framework.persistence.CrudDao;

/**
 * @author dominick
 * @2019/8/28 - 15:50
 * @function:
 */
@MyBatisDao
public interface EmployeeDao extends CrudDao<Employee> {
}
