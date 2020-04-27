package nuc.edu.cn.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PageController {
    /**
     * 页面跳转
     */
    @GetMapping("/{page}")
    public String showpage(@PathVariable String page){
        return page;

    }
}
