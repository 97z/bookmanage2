package com.neu.bookmanage.service;


import com.github.pagehelper.PageInfo;
import com.neu.bookmanage.entity.Book;

import java.util.List;

public interface BookService {
    PageInfo getPaged(int pageNum, int pageSize);
    List<Book> getAll();
}
