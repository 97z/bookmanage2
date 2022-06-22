package com.neu.bookmanage.mapper;

import com.neu.bookmanage.entity.Dish;

/**
* @author admin
* @description 针对表【dish】的数据库操作Mapper
* @createDate 2022-06-17 19:09:49
* @Entity com.neu.bookmanage.entity.Dish
*/
public interface DishMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Dish record);

    int insertSelective(Dish record);

    Dish selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dish record);

    int updateByPrimaryKey(Dish record);

}
