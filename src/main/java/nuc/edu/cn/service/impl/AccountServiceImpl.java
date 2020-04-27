package nuc.edu.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nuc.edu.cn.mapper.AccountMapper;
import nuc.edu.cn.pojo.Manager;
import nuc.edu.cn.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
    AccountMapper accountMapper;
	
	@Override
	public int insertManager(Manager manager) {
		// TODO Auto-generated method stub
		return accountMapper.insertManager(manager);
	}

}
