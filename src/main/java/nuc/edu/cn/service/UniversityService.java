package nuc.edu.cn.service;

import java.util.List;

import nuc.edu.cn.pojo.University;

public interface UniversityService {
	
	public List<University> selectAllUniversity();
    public int deleteUniversityById(int universityId);
    public int updateUniversityById(University university);
    public int insertUniversity(University university);
    public University selectOneUniversity(int universityId);

}
