package com.neu.bookmanage.mapper;

import com.neu.bookmanage.entity.Bookuser;
import org.apache.ibatis.annotations.Param;

/**
* @author admin
* @description 针对表【bookuser】的数据库操作Mapper
* @createDate 2022-06-03 10:51:17
* @Entity com.neu.bookmanage.entity.Bookuser
*/
public interface BookuserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Bookuser record);

    int insertSelective(Bookuser record);

    Bookuser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bookuser record);

    int updateByPrimaryKey(Bookuser record);

    Bookuser login(@Param("username") String username , @Param("password") String password);

}
