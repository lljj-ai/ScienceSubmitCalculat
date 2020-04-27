package nuc.edu.cn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import nuc.edu.cn.mapper.DisplayMapper;
import nuc.edu.cn.pojo.Connection;
import nuc.edu.cn.pojo.Paper;
import nuc.edu.cn.pojo.Teacher;
import nuc.edu.cn.pojo.TeacherAndPaper;
import nuc.edu.cn.pojo.University;
import nuc.edu.cn.service.DisplayService;
@Service
public class DisplayServiceImp implements DisplayService{
	@Autowired
	DisplayMapper displayMapper;
	//用户模块显示登录的用户的个人基本信息
    public Teacher displayTeacher( Teacher teacher) {
    	return displayMapper.displayTeacher(teacher);
    }
    //用户模块显示提交的文献与教师的对应信息 
	@Override
	public List<TeacherAndPaper> displayPaper() {
		return  displayMapper.displayPaper();
	}
	//主页显示大学信息
	@Override
	public List<University> universityShow() {
		return displayMapper.universityShow();
	}
	//主页显示文献完整信息
	@Override
	public List<Paper> paperShow() {
		return displayMapper.paperShow();
	}
	//主页显示完整的连接信息
	@Override
	public List<Connection> largeShow() {
		return displayMapper.largeShow();
	}
	//根据输入的名称进行模糊查询
	@Override
	public List<Paper> inquirePaper(String value) {
		return displayMapper.inquirePaper(value);
	}
	//统计文献的个数
	@Override
	public int countShow() {
		return displayMapper.countShow();
	}
}
