package nuc.edu.cn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nuc.edu.cn.mapper.TeacherMapper;
import nuc.edu.cn.pojo.Teacher;
import nuc.edu.cn.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
    TeacherMapper teacherMapper;
	
	@Override
	public List<Teacher> selectAllTeacher() {
		// TODO Auto-generated method stub
		return teacherMapper.selectAllTeacher();
	}

	@Override
	public int deleteTeacherById(int teacherId) {
		// TODO Auto-generated method stub
		return teacherMapper.deleteTeacherById(teacherId);
	}

	public int updateTeacherById(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherMapper.updateTeacherById(teacher);
	}

	public int insertTeacher(Teacher teacher) {
		return teacherMapper.insertTeacher(teacher);
	}
	@Override
	public Teacher selectOneTeacher(int teacherId) {
		// TODO Auto-generated method stub
		return teacherMapper.selectOneTeacher(teacherId);
	}

}
