package nuc.edu.cn.service;

import java.util.List;
import nuc.edu.cn.pojo.Connection;
import nuc.edu.cn.pojo.Paper;
import nuc.edu.cn.pojo.Teacher;
import nuc.edu.cn.pojo.TeacherAndPaper;
import nuc.edu.cn.pojo.University;

public interface DisplayService {
	public Teacher displayTeacher(Teacher teacher);//用户模块显示登录的用户的个人基本信息
	public List<TeacherAndPaper> displayPaper();//用户模块显示提交的文献与教师的对应信息
    public List<University> universityShow();//主页显示大学信息
    public List<Paper> paperShow();//主页显示文献完整信息
    public List<Connection> largeShow();//主页显示完整的连接信息
    public List<Paper> inquirePaper(String papername);//根据输入的名称进行模糊查询
    public int countShow();//统计文献的个数
}
