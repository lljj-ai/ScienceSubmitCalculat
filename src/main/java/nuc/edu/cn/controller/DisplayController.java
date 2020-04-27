package nuc.edu.cn.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import nuc.edu.cn.pojo.Connection;
import nuc.edu.cn.pojo.Paper;
import nuc.edu.cn.pojo.Teacher;
import nuc.edu.cn.pojo.TeacherAndPaper;
import nuc.edu.cn.pojo.University;
import nuc.edu.cn.service.DisplayService;
@Controller
@RequestMapping("/displayTeacher")
public class DisplayController {
	@Autowired
	DisplayService displayService;
	@GetMapping("/aa")//用户模块显示登录的用户的个人基本信息
	public String displayTeacher1(HttpServletRequest request,HttpServletResponse response){
        int userid=(int)request.getSession().getAttribute("userid");
        Teacher teacher=new Teacher(userid);
        Teacher tea=displayService.displayTeacher(teacher);
        request.getSession().setAttribute("tea",tea);
		return "redirect:/display";
	}
	@GetMapping("/bb")//用户模块显示提交的文献与教师的对应信息
	public String displayPaper(HttpServletRequest request) {
		List<TeacherAndPaper> teacherAndPaper=displayService.displayPaper();
		request.getSession().setAttribute("list",teacherAndPaper);
		 return "redirect:/showAndVerify";
	}
	@GetMapping("/cc")//主页显示大学信息
	public String universityShow(HttpServletRequest request) {
		List<University> university=displayService.universityShow();
		request.getSession().setAttribute("list",university);
		return "redirect:/universityShow";
	}
	@GetMapping("/dd")//主页显示文献完整信息
	public String paperShow(HttpServletRequest request) {
		List<Paper> paper=displayService.paperShow();
		request.getSession().setAttribute("list",paper);
		return "redirect:/paperShow";
}
	@GetMapping("/ee")//主页显示完整的连接信息
	public String largeShow(HttpServletRequest request){
		List<Connection> connection=displayService.largeShow();
		request.getSession().setAttribute("list",connection);
		return "redirect:/largeShow";
	}
	@GetMapping("/ff")//根据输入的名称进行模糊查询
	public String inquireShow(HttpServletRequest request,HttpServletResponse response){	
		String value=request.getParameter("papername");
		List<Paper> paper=displayService.inquirePaper(value);
		request.getSession().setAttribute("list",paper);
		return "redirect:/inquireShow";
	}
	@GetMapping("/gg")//主页显示文献数量信息
	public String countShow(HttpServletRequest request){
        Paper paper=new Paper(displayService.countShow());
		request.getSession().setAttribute("list",paper);
		return "redirect:/countShow";
	}
}