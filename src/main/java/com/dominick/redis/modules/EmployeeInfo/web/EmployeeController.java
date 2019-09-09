package com.dominick.redis.modules.EmployeeInfo.web;

import com.dominick.redis.modules.EmployeeInfo.entity.Employee;
import com.dominick.redis.modules.EmployeeInfo.service.EmployeeService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author dominick
 * @2019/5/10 - 17:05
 * @function:
 */

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;


	@GetMapping("/emp/{id}")
	public Employee getEmp(@PathVariable("id") Integer id){
//		System.out.println(employeeService.get(id));
		return employeeService.get(id);
	}

	@PutMapping("/emp/update")
	public Employee updateEmp(Employee employee){
		employeeService.update(employee);
		return employee;
	}

	@DeleteMapping("/emp/delete/{id}")
	public String  deleteEmp(@PathVariable("id") Integer id){
		employeeService.delete(id);
		return "success";
	}

	@GetMapping("/emp/lastName")
	public Employee selectByLastName(String lastName){
		return employeeService.selectByLastName(lastName);
	}

}
