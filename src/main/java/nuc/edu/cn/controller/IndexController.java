package nuc.edu.cn.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import nuc.edu.cn.pojo.Manager;
import nuc.edu.cn.pojo.Teacher;
import nuc.edu.cn.service.IndexService;
@Controller
@RequestMapping("/indexController")
public class IndexController { 
	@Autowired 
     IndexService indexService;
	@GetMapping("/in")
	public String checkIndex(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    	String user=request.getParameter("userid");
    	System.out.print("获取的id"+user);
    	int userid=Integer.parseInt(user);
    	request.getSession().setAttribute("userid",userid);
    	String password=request.getParameter("password");
    	String select=request.getParameter("select");
    	if("teacher".equals(select)) {//教师登录
    		Teacher teacher=new Teacher(userid,password);
    		if(indexService.isTeacherSuccess(teacher))
    		{
    			return "redirect:/update";
    		}
    	}else{//管理员登录
    		Manager manager=new Manager(userid,password);
    		if(indexService.isManagerSuccess(manager)) {
    		    return "redirect:/displaymanage";
    		}
    	}
    	return "redirect:/index";
     }

}
