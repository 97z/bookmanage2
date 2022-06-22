package com.neu.bookmanage.mapper;

import com.neu.bookmanage.entity.Restaurant;

import java.util.List;

/**
* @author admin
* @description 针对表【restaurant】的数据库操作Mapper
* @createDate 2022-06-17 18:47:18
* @Entity com.neu.bookmanage.entity.Restaurant
*/
public interface RestaurantMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Restaurant record);

    int insertSelective(Restaurant record);

    Restaurant selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Restaurant record);

    int updateByPrimaryKey(Restaurant record);

    List<Restaurant> getAll();

    List<Restaurant> getByName(String name);
}
