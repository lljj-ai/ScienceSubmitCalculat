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

import nuc.edu.cn.pojo.University;
import nuc.edu.cn.service.UniversityService;

@RequestMapping("/university")
@Controller
public class UniversityController {
	@Autowired
	UniversityService universityservice;
	
	@RequestMapping("/selectAllUniversity")
    public String selectAllUniversity(HttpServletRequest request) {
		request.getSession().setAttribute("universitys",universityservice.selectAllUniversity());
        return "redirect:/manageUniversity";
    }
	
	@RequestMapping("/selectOneUniversity")
	public String selectOneUniversity(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap){
		int universityId=Integer.valueOf(request.getParameter("universityId"));
		University university=universityservice.selectOneUniversity(universityId);
		request.getSession().setAttribute("university",university);
		return "redirect:/selectOneUniversity";
	}
	
	
	@RequestMapping("/insertUniversity")
	public String insertDepartment(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException{
		String universityName=request.getParameter("universityName");
		String universityGrade=request.getParameter("universityGrade");
		String universityType=request.getParameter("universityType");
		University university=new University(universityName,universityGrade,universityType);
		universityservice.insertUniversity(university);
		return "redirect:selectAllUniversity";
	}
	
	@RequestMapping("/InsertUniversity")
    public String insertUniversity() { 
        return "redirect:/insertUniversity";
    }

    @RequestMapping("/deleteUniversityById")
    public String deleteUniversityById(int universityId){
    	universityservice.deleteUniversityById(universityId);
        return "redirect:selectAllUniversity";
    }


    @GetMapping("/updateUniversityById")
    public String updateUniversityById(HttpServletRequest request,HttpServletResponse response){
    	int universityId=Integer.valueOf(request.getParameter("universityId"));
    	String universityName=request.getParameter("universityName");
		String universityGrade=request.getParameter("universityGrade");
		String universityType=request.getParameter("universityType");
		University university=new University(universityId,universityName,universityGrade,universityType);
		universityservice.updateUniversityById(university);
		return "redirect:selectAllUniversity";
    }
    
    @RequestMapping("/updateUniversity")
    public String updateUniversity(int universityId ,HttpServletRequest request) {
    	request.getSession().setAttribute("university",universityservice.selectOneUniversity(universityId));
        return "redirect:/updateUniversity";
    }
}
