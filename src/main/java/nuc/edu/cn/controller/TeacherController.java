package nuc.edu.cn.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import nuc.edu.cn.pojo.Teacher;
import nuc.edu.cn.service.TeacherService;

@RequestMapping("/teacher")
@Controller
public class TeacherController {
	
	@Autowired
	TeacherService teacherservice;
	
	@RequestMapping("/selectAllTeacher")
    public String selectAllTeacher(HttpServletRequest request) {
		request.getSession().setAttribute("teachers",teacherservice.selectAllTeacher());
        return "redirect:/manageTeacher";
    }
	
	@RequestMapping("/selectOneTeacher")
	public String selectOneTeacher(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap){
		int teacherId=Integer.valueOf(request.getParameter("teacherId"));
        Teacher teacher=teacherservice.selectOneTeacher(teacherId);
        request.getSession().setAttribute("teacher",teacher);
		return "redirect:/selectOneTeacher";
	}
	
	
	@RequestMapping("/insertTeacher")
	public String insertTeacher(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException{
		String teacherName=request.getParameter("teacherName");
		int universityId=Integer.parseInt(request.getParameter("universityId"));
		int departmentId=Integer.parseInt(request.getParameter("departmentId"));
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phoneNum=request.getParameter("phoneNum");
		String teacherGrade=request.getParameter("teacherGrade");
		Teacher teacher=new Teacher(teacherName,password,universityId,departmentId,
				email,phoneNum,teacherGrade);
		teacherservice.insertTeacher(teacher);
		return "redirect:selectAllTeacher";
	}
	
	@RequestMapping("/InsertTeacher")
    public String insertTeacher() { 
        return "redirect:/insertTeacher";
    }

    @RequestMapping("/deleteTeacherById")
    public String deleteTeacherById(int teacherId){
    	teacherservice.deleteTeacherById(teacherId);
        return "redirect:selectAllTeacher";
    }


    @GetMapping("/updateTeacherById")
    public String updateTeacherById(HttpServletRequest request,HttpServletResponse response){
    	int teacherId=Integer.valueOf(request.getParameter("teacherId"));
    	String teacherName=request.getParameter("teacherName");
    	int universityId=Integer.valueOf(request.getParameter("universityId"));
    	int departmentId=Integer.valueOf(request.getParameter("departmentId"));
    	Teacher teacher=new Teacher(teacherId, teacherName,universityId,departmentId);
    	teacherservice.updateTeacherById(teacher);
    	return "redirect:selectAllTeacher";
    }
    
    @RequestMapping("/updateTeacher")
    public String updateTeacherById(int teacherId ,HttpServletRequest request) {
    	request.getSession().setAttribute("teacher",teacherservice.selectOneTeacher(teacherId));
        return "redirect:/updateTeacher";
    }
    
}
