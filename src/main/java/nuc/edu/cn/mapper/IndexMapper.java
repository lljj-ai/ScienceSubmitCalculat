package nuc.edu.cn.mapper;

import org.apache.ibatis.annotations.Mapper;

import nuc.edu.cn.pojo.Manager;
import nuc.edu.cn.pojo.Teacher;

@Mapper
public interface IndexMapper {
       public Teacher selectTeacher(Teacher teacher);
       public Manager selectManager(Manager manager);
}
