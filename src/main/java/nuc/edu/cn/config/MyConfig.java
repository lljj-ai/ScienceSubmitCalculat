package nuc.edu.cn.config;

import nuc.edu.cn.pojo.Manager;
import nuc.edu.cn.pojo.Teacher;
import nuc.edu.cn.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Configuration
public class MyConfig implements WebMvcConfigurer {

    @Autowired
    private IndexService indexService;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                Integer userId = Integer.valueOf(request.getParameter("userid"));
                String password = request.getParameter("password");
                String select = request.getParameter("select");
                if ("teacher".equals(select)) {//教师登录
                    Teacher teacher = new Teacher(userId, password);
                    if (!indexService.isTeacherSuccess(teacher)) {
                        request.getSession().setAttribute("msg", "用户名或密码错误");
                        response.sendRedirect("/index");
                        return false;
                    }
                } else {//管理员登录
                    Manager manager = new Manager(userId, password);
                    if (!indexService.isManagerSuccess(manager)) {
                        request.getSession().setAttribute("msg", "用户名或密码错误");
                        response.sendRedirect("/index");
                        return false;
                    }
                }
                return true;
            }
        }).addPathPatterns("/indexController/in");
    }
}
