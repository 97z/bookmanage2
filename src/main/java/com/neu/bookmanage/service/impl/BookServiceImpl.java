package com.neu.bookmanage.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.bookmanage.entity.Book;
import com.neu.bookmanage.mapper.BookMapper;
import com.neu.bookmanage.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Override
    public PageInfo getPaged(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Book> list = bookMapper.getAll();
        PageInfo<Book> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<Book> getAll() {
        return bookMapper.getAll();
    }
}
