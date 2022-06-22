package com.neu.bookmanage.service.impl;

import com.neu.bookmanage.entity.Bookuser;
import com.neu.bookmanage.mapper.BookuserMapper;
import com.neu.bookmanage.service.BookUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookUserServiceImpl implements BookUserService {
    @Resource
    private BookuserMapper bookuserMapper;
    @Override
    public Bookuser login(String username, String password) {
        return bookuserMapper.login(username,password);
    }
}
