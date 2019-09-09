package com.dominick.redis.modules.DepartmentInfo.service;

import com.dominick.redis.framework.service.CrudService;
import com.dominick.redis.modules.DepartmentInfo.dao.DepartmentDao;
import com.dominick.redis.modules.DepartmentInfo.entity.Department;
import com.dominick.redis.modules.EmployeeInfo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService extends CrudService<DepartmentDao,Department> {
	@Autowired
	DepartmentDao departmentDao;

//	@Cacheable(value = "listDept")
	public List<Department> getList() {
		System.out.println("查数据库了，获取了List");
		return super.getList();
	}

//	@Cacheable(cacheNames = "getDept", key = "#id")
	public Department getDeptById(Integer id) {
		System.out.println("查询数据库了！");
		/*
		//可以行內获取缓存名，将特定的信息存入缓存
		Cache cache = cacheManager.getCache("getDept");
		cache.put("getDept","查询数据库了！");
		*/
		return super.get(id);
	}

//	@CacheEvict(value = "listDept",allEntries = true)
//	@Caching(
//			//删除了所有的listDept，和getDept缓存中的key=#id的value
//			evict = {
//				@CacheEvict(value = "listDept",allEntries = true),
//				@CacheEvict(value = "getDept",key = "#id")
//			}
//	)
	public int deleteDeptById(Integer id) {
		System.out.println("删除了数据，删除缓存！");
		return super.delete(id);
	}

	public int insertDept(Department department) {
		return super.insert(department);
	}

//	@CachePut(cacheNames = "getDept",key = "#result.id")
	public Department updateDept(Department department) {
		System.out.println("更新数据库并且更新缓存！");
		super.update(department);
		return department;
	}



}
