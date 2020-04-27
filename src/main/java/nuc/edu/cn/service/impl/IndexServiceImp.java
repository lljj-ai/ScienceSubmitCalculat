package nuc.edu.cn.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import nuc.edu.cn.mapper.IndexMapper;
import nuc.edu.cn.pojo.Manager;
import nuc.edu.cn.pojo.Teacher;
import nuc.edu.cn.service.IndexService;
@Service
@RequestMapping("/bac")
public class IndexServiceImp implements IndexService{
      @Autowired
      IndexMapper indexMapper;
      @GetMapping("teacherIndex")
      public boolean isTeacherSuccess(Teacher teacher){
    	    if(indexMapper.selectTeacher(teacher)!=null) {
    	    	return true;
    	    }else {
    	    	return false;
    	    }
      }
      @GetMapping("managerIndex")
      public boolean isManagerSuccess(Manager manager){
  	    if(indexMapper.selectManager(manager)!=null) {
  	    	return true;
  	    }else {
  	    	return false;
  	    }
    }
}
