package nuc.edu.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import nuc.edu.cn.pojo.Department;

@Mapper
public interface DepartmentMapper {
	
	List<Department> selectAllDepartment();
    int deleteDepartmentById(int departmentId);
    int updateDepartmentById(Department department);
    int insertDepartment(Department department);
    Department selectOneDepartment(int departmentId);

}
