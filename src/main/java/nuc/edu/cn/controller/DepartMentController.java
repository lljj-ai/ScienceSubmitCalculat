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
import nuc.edu.cn.pojo.Department;
import nuc.edu.cn.service.DepartmentService;

@RequestMapping("/department")
@Controller
public class DepartMentController {
	@Autowired
	DepartmentService departmentservice;
	
	@RequestMapping("/selectAllDepartment")
    public String selectAllDepartment(HttpServletRequest request) {
        request.getSession().setAttribute("departments",departmentservice.selectAllDepartment());
        return "redirect:/manageDepartment";
    }
	
	@RequestMapping("/selectOneDepartment")
	public String selectOneDepartment(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap){
		int departmentId=Integer.valueOf(request.getParameter("departmentId"));
		Department dep=departmentservice.selectOneDepartment(departmentId);
		request.getSession().setAttribute("dep",dep);
		return "redirect:/selectOneDepartment";
	}
	
	
	@RequestMapping("/insertDepartment")
	public String insertDepartment(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException{
		String departmentName=request.getParameter("departmentName");
		int universityId=Integer.parseInt(request.getParameter("universityId"));
		String departmentType=request.getParameter("departmentType");
		Department department=new Department(departmentName,departmentType,universityId);
		departmentservice.insertDepartment(department);
		return "redirect:selectAllDepartment";
	}
	
	@RequestMapping("/InsertDepartment")
    public String insertDepartment() { 
        return "redirect:/insertDepartment";
    }

    @RequestMapping("/deleteDepartmentById")
    public String deleteDepartmentById(int departmentId){
    	departmentservice.deleteDepartmentById(departmentId);
        return "redirect:selectAllDepartment";
    }


    @GetMapping("/updateDepartmentById")
    public String updateDepartmentById(HttpServletRequest request,HttpServletResponse response){
    	int departmentId=Integer.parseInt(request.getParameter("departmentId"));
    	String departmentName=request.getParameter("departmentName");
		int universityId=Integer.parseInt(request.getParameter("universityId"));
		String departmentType=request.getParameter("departmentType");
		Department department=new Department(departmentName,departmentType,universityId,departmentId);
		departmentservice.updateDepartmentById(department);
		return "redirect:selectAllDepartment";
    }
    
    @RequestMapping("/updateDepartment")
    public String updateDepartmentById(int departmentId ,HttpServletRequest request) {
    	request.getSession().setAttribute("department",departmentservice.selectOneDepartment(departmentId));
        return "redirect:/updateDepartment";
    }
}
