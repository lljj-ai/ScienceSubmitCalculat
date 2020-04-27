package nuc.edu.cn.service;
import nuc.edu.cn.pojo.Paper;
import nuc.edu.cn.pojo.TeacherAndPaper;
public interface InsertPaperMesService {
          public Paper  InsertPaperMes(Paper paper);//文献表的插入
          //连接表的插入
          public TeacherAndPaper InsertRecod(TeacherAndPaper teacherAndPaper);
}
