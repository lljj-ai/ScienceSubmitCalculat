package nuc.edu.cn.mapper;

import org.apache.ibatis.annotations.Mapper;

import nuc.edu.cn.pojo.Paper;
import nuc.edu.cn.pojo.TeacherAndPaper;

@Mapper
public interface InsertPaperMesMapper{
     public int InsertPaperMe(Paper paper);
     public int InsetRecord(TeacherAndPaper teacherAndPaper);
}
