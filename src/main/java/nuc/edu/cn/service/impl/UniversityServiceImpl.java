package nuc.edu.cn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nuc.edu.cn.mapper.UniversityMapper;
import nuc.edu.cn.pojo.University;
import nuc.edu.cn.service.UniversityService;

@Service
public class UniversityServiceImpl implements UniversityService {

	@Autowired
	UniversityMapper universityMapper;
	
	@Override
	public List<University> selectAllUniversity() {
		// TODO Auto-generated method stub
		return universityMapper.selectAllUniversity();
	}

	@Override
	public int deleteUniversityById(int universityId) {
		// TODO Auto-generated method stub
		return universityMapper.deleteUniversityById(universityId);
	}

	@Override
	public int updateUniversityById(University university) {
		// TODO Auto-generated method stub
		return universityMapper.updateUniversityById(university);
	}

	@Override
	public int insertUniversity(University university) {
		// TODO Auto-generated method stub
		return universityMapper.insertUniversity(university);
	}

	@Override
	public University selectOneUniversity(int universityId) {
		// TODO Auto-generated method stub
		return universityMapper.selectOneUniversity(universityId);
	}

}
