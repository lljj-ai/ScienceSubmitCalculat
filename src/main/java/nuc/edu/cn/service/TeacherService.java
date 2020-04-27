package nuc.edu.cn.service;

import java.util.List;

import nuc.edu.cn.pojo.Teacher;

public interface TeacherService {
	
	public List<Teacher> selectAllTeacher();
    public int deleteTeacherById(int teacherId);
    public int updateTeacherById(Teacher teacher);
	public int insertTeacher(Teacher teacher);
    public Teacher selectOneTeacher(int teacherId);

}
