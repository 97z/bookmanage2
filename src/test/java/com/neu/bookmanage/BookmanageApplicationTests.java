package com.neu.bookmanage;

import com.neu.bookmanage.entity.Book;
import com.neu.bookmanage.entity.Dept;
import com.neu.bookmanage.entity.TbGoods;
import com.neu.bookmanage.mapper.BookMapper;
import com.neu.bookmanage.mapper.DeptMapper;
import com.neu.bookmanage.mapper.TbGoodsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class BookmanageApplicationTests {
    @Resource
    private BookMapper bookMapper;
    @Test
    void testBookGetById() {
       Book book = bookMapper.selectByPrimaryKey(2L);
        System.out.println(book);
    }
    @Test
    void getAllBook(){
        List<Book> list = bookMapper.getAll();
        System.out.println(list);
    }
    @Resource
    private TbGoodsMapper tbGoodsMapper;
    @Test
    void testGoodsGetById() {
        TbGoods tbGoods = tbGoodsMapper.selectByPrimaryKey(2L);
        System.out.println(tbGoods);
    }
    @Resource
    private DeptMapper deptMapper;
    @Test
    void getAllDept(){
        List<Dept> list = deptMapper.getAllDept();
        System.out.println(list);
    }
}
