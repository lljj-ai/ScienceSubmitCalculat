package nuc.edu.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import nuc.edu.cn.pojo.Connection;
import nuc.edu.cn.pojo.Paper;
import nuc.edu.cn.pojo.Teacher;
import nuc.edu.cn.pojo.TeacherAndPaper;
import nuc.edu.cn.pojo.University;

@Mapper
public interface DisplayMapper {
       public Teacher displayTeacher(Teacher teacher);//用户模块显示登录的用户的个人基本信息
       public List<TeacherAndPaper> displayPaper();//用户模块显示提交的文献与教师的对应信息 
       public List<University> universityShow();//主页显示大学信息
       public List<Paper> paperShow();//主页显示文献完整信息
       public List<Connection> largeShow();//主页显示完整的连接信息
       public List<Paper> inquirePaper(String value);//根据输入的名称进行模糊查询
       public int countShow();//统计文献的个数
}
