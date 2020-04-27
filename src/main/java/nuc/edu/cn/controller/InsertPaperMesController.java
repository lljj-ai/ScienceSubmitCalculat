package nuc.edu.cn.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import nuc.edu.cn.pojo.Paper;
import nuc.edu.cn.pojo.TeacherAndPaper;
import nuc.edu.cn.service.InsertPaperMesService;

@Controller
@RequestMapping("/insertPaper")
public class InsertPaperMesController {
	@Autowired
	InsertPaperMesService insertPaperMesService;
	@PostMapping("/ie")//提交论文
         public String InsertPaperMes(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
         	String paperName=request.getParameter("paper_name");
         	String language=request.getParameter("language");
         	int subjectClassId=Integer.parseInt(request.getParameter("subject_class_id"));
         	String projectSourceId=request.getParameter("project_source_id");
         	int projectId=Integer.parseInt(request.getParameter("project_id"));
         	String researchType=request.getParameter("research_type");
         	String magazineName=request.getParameter("magazine_name");
         	String magazineGrade=request.getParameter("magazine_grade");
         	String country=request.getParameter("country");
         	Paper paper=new Paper(paperName,language,subjectClassId,projectSourceId,projectId,
	    			 researchType,magazineName,magazineGrade,country);
         	Paper pap=insertPaperMesService.InsertPaperMes(paper);//文献表的插入
         	TeacherAndPaper teacherAndPaper=new TeacherAndPaper
         	((int)request.getSession().getAttribute("userid"),pap.getPaperId());
         	insertPaperMesService.InsertRecod(teacherAndPaper);//文献教师链接表的插入
         	return "redirect:/update";
}
}
