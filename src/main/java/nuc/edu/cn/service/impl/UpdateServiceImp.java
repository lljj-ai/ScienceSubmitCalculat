package nuc.edu.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nuc.edu.cn.mapper.UpdateMapper;
import nuc.edu.cn.pojo.Teacher;
import nuc.edu.cn.service.UpdateService;

@Service
public class UpdateServiceImp implements UpdateService{
    @Autowired
    UpdateMapper updateMapper;
	@Override
	public Teacher updateMes(Teacher teacher) {
		updateMapper.updateM(teacher);
		return teacher;
	}

	@Override
	public Teacher updatePas(Teacher teacher) {
		updateMapper.updateP(teacher);
		return teacher;
	}

}
