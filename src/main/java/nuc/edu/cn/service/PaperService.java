package nuc.edu.cn.service;

import java.util.List;

import nuc.edu.cn.pojo.Paper;

public interface PaperService {
	
	List<Paper> selectAllPaper();
    int deletePaperById(int paperId);
    Paper selectOnePaper(int paperId);
//    int insertPaper(Paper paper);
}
