package com.neu.bookmanage.mapper;

import com.neu.bookmanage.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author admin
* @description 针对表【book】的数据库操作Mapper
* @createDate 2022-06-03 10:50:48
* @Entity com.neu.bookmanage.entity.Book
*/
public interface BookMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> getAll();

}
