package com.dominick.redis.modules.EmployeeInfo.service;//package com.dominick.redis.service.impl;
///**
//    @author dominick
//    @2019/5/10 - 16:52
//    @function:
// */
//
//
//import com.dominick.redis.mapper.DepartmentMapper;
//import com.dominick.redis.modules.EmployeeInfo.entity.Department;
//import com.dominick.redis.service.DepartmentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.CacheManager;
//import org.springframework.cache.annotation.CacheEvict;
//import org.springframework.cache.annotation.CachePut;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.cache.annotation.Caching;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class DepartmentServiceImpl implements DepartmentService {
//	@Autowired
//	DepartmentMapper departmentMapper;
////
////	@Autowired
////	RedisTemplate<Object, Object> entityRedisTemplate;		//操作的k-v都是对象的，配置了对象转Jackson
//
//	@Autowired
//	CacheManager cacheManager;
//
//	@Override
//	@Cacheable(value = "listDept")
//	public List<Department> getList() {
//		System.out.println("查数据库了，获取了List");
//		return departmentMapper.getList();
//	}
//
//	@Override
//	@Cacheable(cacheNames = "getDept", key = "#id")
//	public Department getDeptById(Integer id) {
//		System.out.println("查询数据库了！");
//		/*
//		//可以行內获取缓存名，将特定的信息存入缓存
//		Cache cache = cacheManager.getCache("getDept");
//		cache.put("getDept","查询数据库了！");
//		*/
//		return departmentMapper.getDeptById(id);
//	}
//
//	@Override
//	@CacheEvict(value = "listDept",allEntries = true)
//	@Caching(
//			//删除了所有的listDept，和getDept缓存中的key=#id的value
//			evict = {
//				@CacheEvict(value = "listDept",allEntries = true),
//				@CacheEvict(value = "getDept",key = "#id")
//			}
//	)
//	public int deleteDeptById(Integer id) {
//		System.out.println("删除了数据，删除缓存！");
//		return departmentMapper.deleteDeptById(id);
//	}
//
//	@Override
//	public int insertDept(Department department) {
//		return departmentMapper.insertDept(department);
//	}
//
//	@Override
//	@CachePut(cacheNames = "getDept",key = "#result.id")
//	public Department updateDept(Department department) {
//		System.out.println("更新数据库并且更新缓存！");
//		departmentMapper.updateDept(department);
//		return department;
//	}
//
//}
