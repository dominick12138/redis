//package com.dominick.redis.modules.EmployeeInfo.web;
//
//import com.dominick.redis.modules.EmployeeInfo.entity.Employee;
//import com.dominick.redis.service.impl.EmpServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
///**
// * @author dominick
// * @2019/5/10 - 17:05
// * @function:
// */
//
//@Controller
//public class EmpController {
//
//	@Autowired
//	EmpServiceImpl empService;
//
//	@GetMapping("/emp/{id}")
//	public Employee getEmp(@PathVariable("id") Integer id){
//		return empService.getEmpById(id);
//	}
//
//
//}
