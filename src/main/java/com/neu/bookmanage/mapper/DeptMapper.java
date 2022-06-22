package com.neu.bookmanage.mapper;

import com.neu.bookmanage.entity.Book;
import com.neu.bookmanage.entity.Dept;

import java.util.List;

/**
* @author admin
* @description 针对表【dept】的数据库操作Mapper
* @createDate 2022-06-15 18:44:19
* @Entity com.neu.bookmanage.entity.Dept
*/
public interface DeptMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    List<Dept> getAllDept();

}
