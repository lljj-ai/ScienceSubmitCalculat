package nuc.edu.cn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import nuc.edu.cn.pojo.Paper;
import nuc.edu.cn.service.PaperService;

@RequestMapping("/paper")
@Controller
public class PaperController {
	
	@Autowired
	PaperService paperService;
	
	@RequestMapping("/selectAllPaper")
    public String selectAllPaper(HttpServletRequest request) {
		request.getSession().setAttribute("papers",paperService.selectAllPaper());
        return "redirect:/managePaper";
    }
	
	@RequestMapping("/selectOnePaper")
	public String selectOnePaper(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap){
		int paperId=Integer.valueOf(request.getParameter("paperId"));
        Paper paper=paperService.selectOnePaper(paperId);
        request.getSession().setAttribute("paper",paper);
		return "redirect:/selectOnePaper";
	}
   
    @RequestMapping("/deletePaperById")
    public String deletePaperById(int paperId){
    	paperService.deletePaperById(paperId);
        return "redirect:selectAllPaper";
    }

}
