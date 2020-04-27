package nuc.edu.cn.service;

import java.util.List;

import nuc.edu.cn.pojo.Department;

public interface DepartmentService {
	
	public List<Department> selectAllDepartment();
    public int deleteDepartmentById(int departmentId);
    public int updateDepartmentById(Department department);
    public int insertDepartment(Department department);
    public Department selectOneDepartment(int departmentId);

}
