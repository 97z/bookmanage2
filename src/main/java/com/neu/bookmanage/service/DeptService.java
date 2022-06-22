package com.neu.bookmanage.service;

import com.neu.bookmanage.entity.Dept;

import java.util.List;

public interface DeptService {
//    PageInfo getPaged(int pageNum, int pageSize);
    List<Dept> getAllDept();
    int deleteByPrimaryKey(Long id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}
