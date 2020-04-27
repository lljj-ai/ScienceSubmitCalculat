package nuc.edu.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nuc.edu.cn.mapper.InsertPaperMesMapper;
import nuc.edu.cn.pojo.Paper;
import nuc.edu.cn.pojo.TeacherAndPaper;
import nuc.edu.cn.service.InsertPaperMesService;
@Service
public class InsertPaperMesServiceImp implements InsertPaperMesService{
    @Autowired
    InsertPaperMesMapper insertPaperMesMapper;
    //文献表的插入
	@Override
	public Paper InsertPaperMes(Paper paper) {
		 insertPaperMesMapper.InsertPaperMe(paper);
		 return paper;
	}
	//连接表的插入
	@Override
	public TeacherAndPaper InsertRecod(TeacherAndPaper teacherAndPaper) {
		// TODO Auto-generated method stub
		 insertPaperMesMapper.InsetRecord(teacherAndPaper);
		 return teacherAndPaper;
	}
        
}
