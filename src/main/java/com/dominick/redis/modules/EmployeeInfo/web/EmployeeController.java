package com.dominick.redis.modules.EmployeeInfo.web;

import com.dominick.redis.modules.EmployeeInfo.entity.Employee;
import com.dominick.redis.modules.EmployeeInfo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dominick
 * @2019/5/10 - 17:05
 * @function:
 */

@ResponseBody
@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/emp/{id}")
	public Employee getEmp(@PathVariable("id") Integer id){
		return employeeService.get(id);
	}


}
