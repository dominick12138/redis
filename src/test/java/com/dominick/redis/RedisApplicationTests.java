package com.dominick.redis;

import com.dominick.redis.modules.EmployeeInfo.entity.Employee;
import com.dominick.redis.modules.EmployeeInfo.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {

//	@Autowired
//	DeptServiceImpl deptService;

	@Autowired
	EmployeeService employeeService;
//	@Autowired
//	StringRedisTemplate stringRedisTemplate;		//操作的k-v都是字符串的

//	@Autowired
//	RedisTemplate redisTemplate;	//操作的k-v都是对象的

//	@Autowired
//	RedisTemplate<Object, Object> entityRedisTemplate;		//操作的k-v都是对象的，配置了对象转Jackson


	@Test
	public void contextLoads() {
//		Department department = departmentServiceImpl.getDeptById(1);

//		stringRedisTemplate.opsForValue().append("msg","Hello world");

//		redisTemplate.opsForValue().set("dept-auto",departmentServiceImpl.getDeptById(101));

//		redisTemplate.opsForValue().set("emp-config",deptService.getDeptById(101));

		Employee employee  = new Employee();
		employee.setdId(101);
		System.out.println("Test the dept data:" + employeeService.get(employee));
		System.out.println("Test the dept data2:" + employeeService.get(101).toString());

//		System.out.println("Test the emp data:" + empService.getEmpById(101));

//		redisTemplate.opsForValue().set("dept-config",departmentServiceImpl.getDeptById(1));

	}


}
