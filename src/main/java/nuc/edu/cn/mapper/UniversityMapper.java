package nuc.edu.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import nuc.edu.cn.pojo.University;

@Mapper
public interface UniversityMapper {
	
	List<University> selectAllUniversity();
    int deleteUniversityById(int universityId);
    int updateUniversityById(University university);
    int insertUniversity(University university);
    University selectOneUniversity(int universityId);

}
