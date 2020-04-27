package nuc.edu.cn.mapper;

import org.apache.ibatis.annotations.Mapper;

import nuc.edu.cn.pojo.Manager;

@Mapper
public interface AccountMapper {
    public int insertManager(Manager manager);
}

