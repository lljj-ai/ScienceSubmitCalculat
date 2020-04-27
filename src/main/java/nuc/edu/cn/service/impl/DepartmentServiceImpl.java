package nuc.edu.cn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nuc.edu.cn.mapper.DepartmentMapper;
import nuc.edu.cn.pojo.Department;
import nuc.edu.cn.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
    DepartmentMapper departmentMapper;
	
	@Override
	public List<Department> selectAllDepartment() {
		// TODO Auto-generated method stub
		return departmentMapper.selectAllDepartment();
	}

	@Override
	public int deleteDepartmentById(int departmentId) {
		// TODO Auto-generated method stub
		return departmentMapper.deleteDepartmentById(departmentId);
	}

	@Override
	public int updateDepartmentById(Department department) {
		// TODO Auto-generated method stub
		return departmentMapper.updateDepartmentById(department);
	}

	@Override
	public Department selectOneDepartment(int departmentId) {
		// TODO Auto-generated method stub
		return departmentMapper.selectOneDepartment(departmentId);
	}

	@Override
	public int insertDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentMapper.insertDepartment(department);
	}

}
