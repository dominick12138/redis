package com.dominick.redis.config.mapper;

import com.dominick.redis.modules.DepartmentInfo.entity.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;


/**
 * @author Dominick.huang
 */
//指定这是一个操作数据库的mapper
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department")
    public List<Department> getList();

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
