package nuc.edu.cn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import nuc.edu.cn.pojo.Teacher;
import nuc.edu.cn.service.UpdateService;

@Controller
@RequestMapping("/updateCon")
public class UpdateController {
    @Autowired
    UpdateService updateService;
	@GetMapping("/aup")//用户自己修改自己的基本信息
	public String updateMessage(HttpServletRequest request,HttpServletResponse response){
    	String phonenum=request.getParameter("phonenum"); 
    	String email=request.getParameter("email");
    	Teacher teacher=new Teacher((int)request.getSession().getAttribute("userid"),phonenum,email);
    	updateService.updateMes(teacher);
    	return "redirect:/update";
    }
    @GetMapping("/bup")//用户自己修改自己的密码
    public String updatePassword(HttpServletRequest request,HttpServletResponse response){
    	String password=request.getParameter("password");
    	Teacher teacher=new Teacher((int)request.getSession().getAttribute("userid"),password);
    	updateService.updatePas(teacher);
    	return "redirect:/index";
    }
}
