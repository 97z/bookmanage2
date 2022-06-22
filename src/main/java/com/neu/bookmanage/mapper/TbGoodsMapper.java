package com.neu.bookmanage.mapper;

import com.neu.bookmanage.entity.TbGoods;

/**
* @author admin
* @description 针对表【tb_goods】的数据库操作Mapper
* @createDate 2022-06-03 15:53:22
* @Entity com.neu.bookmanage.entity.TbGoods
*/
public interface TbGoodsMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TbGoods record);

    int insertSelective(TbGoods record);

    TbGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbGoods record);

    int updateByPrimaryKey(TbGoods record);

}
