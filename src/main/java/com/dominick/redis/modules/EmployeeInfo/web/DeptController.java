package com.dominick.redis.modules.EmployeeInfo.web;//package com.dominick.redis.controller;
//
//import com.dominick.redis.modules.EmployeeInfo.entity.Department;
//import com.dominick.redis.service.impl.DeptServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class DeptController {
//
//    @Autowired
//    DeptServiceImpl deptServiceImpl;
//
//
//
//    @GetMapping("/dept/{id}")
//    public Department getDepartment(@PathVariable("id") Integer id){
//        return departmentServiceImpl.getDeptById(id);
//    }
//
//    @GetMapping("/addDept")
//    public Department insertDept(Department department){
//        departmentServiceImpl.insertDept(department);
//        return department;
//    }
//
//
//    @GetMapping("/list")
//    public List<Department> listDept(Department department){
//        return departmentServiceImpl.getList();
//    }
//
//    @GetMapping("/delete/{id}")
//    public int deleteDept(@PathVariable("id") Integer id){
//        return departmentServiceImpl.deleteDeptById(id);
//    }
//
//    @GetMapping("/dept")
//    public Department updateDept(Department department){
//        departmentServiceImpl.updateDept(department);
//        return department;
//    }
//
//
//
//}
