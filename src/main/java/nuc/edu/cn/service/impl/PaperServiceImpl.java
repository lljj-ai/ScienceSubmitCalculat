package nuc.edu.cn.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nuc.edu.cn.mapper.PaperMapper;
import nuc.edu.cn.pojo.Paper;
import nuc.edu.cn.service.PaperService;

@Service
public class PaperServiceImpl implements PaperService {

	@Autowired
	PaperMapper paperMapper;
	
	@Override
	public List<Paper> selectAllPaper() {
		// TODO Auto-generated method stub
		return paperMapper.selectAllPaper();
	}

	@Override
	public int deletePaperById(int paperId) {
		// TODO Auto-generated method stub
		return paperMapper.deletePaperById(paperId);
	}
    
	
	@Override
	public Paper selectOnePaper(int paperId) {
		// TODO Auto-generated method stub
		return paperMapper.selectOnePaper(paperId);
	}

//	@Override
//	public int insertPaper(Paper paper) {
//		// TODO Auto-generated method stub
//		return paperMapper.insertPaper(paper);
//	}

}
