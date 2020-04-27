package nuc.edu.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import nuc.edu.cn.pojo.Paper;

@Mapper
public interface PaperMapper {
	
	public List<Paper> selectAllPaper();
    public int deletePaperById(int paper);
    public Paper selectOnePaper(int paperId);
//	public int insertPaper(Paper paper);

}
