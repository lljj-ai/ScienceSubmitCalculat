package nuc.edu.cn.mapper;

import org.apache.ibatis.annotations.Mapper;

import nuc.edu.cn.pojo.Teacher;

@Mapper
public interface UpdateMapper {
         public int updateM(Teacher teacher);
         public int updateP(Teacher teacher);
}
