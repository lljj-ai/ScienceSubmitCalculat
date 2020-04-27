package nuc.edu.cn.mapper;

import org.apache.ibatis.annotations.Mapper;

import nuc.edu.cn.pojo.Teacher;

import java.util.List;

@Mapper
public interface TeacherMapper {
    public List<Teacher> selectAllTeacher();
    public int deleteTeacherById(int teacherId);
    public int updateTeacherById(Teacher teacher);
    public int insertTeacher(Teacher teacher);
    public Teacher selectOneTeacher(int teacherId);
}
