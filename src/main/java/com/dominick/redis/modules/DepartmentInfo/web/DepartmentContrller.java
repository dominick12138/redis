package com.dominick.redis.modules.DepartmentInfo.web;

import com.dominick.redis.modules.DepartmentInfo.entity.Department;
import com.dominick.redis.modules.DepartmentInfo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author dominick
 * @2019/8/29 - 15:20
 * @function:
 */


public class DepartmentContrller {
	@Autowired
	DepartmentService departmentService;

	@GetMapping("/dept/{id}")
	public Department getDepartment(@PathVariable("id") Integer id){
		return departmentService.getDeptById(id);
	}

	@GetMapping("/addDept")
	public Department insertDept(Department department){
		departmentService.insertDept(department);
		return department;
	}


	@GetMapping("/list")
	public List<Department> listDept(Department department){
		return departmentService.getList();
	}

	@GetMapping("/delete/{id}")
	public int deleteDept(@PathVariable("id") Integer id){
		return departmentService.deleteDeptById(id);
	}

	@GetMapping("/dept")
	public Department updateDept(Department department){
		departmentService.updateDept(department);
		return department;
	}
}
