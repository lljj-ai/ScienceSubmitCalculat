package nuc.edu.cn.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import nuc.edu.cn.pojo.Manager;
import nuc.edu.cn.service.AccountService;

@RequestMapping("/account")
@Controller
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping("/insertManager")
    public String insert(Manager manager) {
        accountService.insertManager(manager);
        return "redirect:/displaymanage";
    }
 
    @RequestMapping("/toInsertManager")
    public String toInsertManager() {
        return "redirect:/insertManager";
    }

    @RequestMapping("/toindex")
    public String toindex() {
        return "index";
    }
}
