package com.dominick.redis.mapper;


import com.dominick.redis.modules.EmployeeInfo.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * @author Dominick.huang
 */

//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    @Select("select * from employee where id = #{id}")
    Employee getEmpById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into employee(last_name,email,gender,d_id) values(#{lastName},#{gender}#{email},#{dId})")
    int insertEmp(Employee employee);
}
