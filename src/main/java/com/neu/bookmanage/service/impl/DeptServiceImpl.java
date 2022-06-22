package com.neu.bookmanage.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.bookmanage.entity.Book;
import com.neu.bookmanage.entity.Dept;
import com.neu.bookmanage.mapper.BookMapper;
import com.neu.bookmanage.mapper.DeptMapper;
import com.neu.bookmanage.service.BookService;
import com.neu.bookmanage.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{
    @Resource
    private DeptMapper deptMapper;
//    @Override
//    public PageInfo getPaged(int pageNum,int pageSize) {
//        PageHelper.startPage(pageNum,pageSize);
//        List<Dept> list = deptMapper.getAll();
//        PageInfo<Book> pageInfo = new PageInfo<>(list);
//        return pageInfo;
//    }

    @Override
    public List<Dept> getAllDept() {
        return deptMapper.getAllDept();
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        System.out.println("hello");
        System.out.println("hello,hot-fix");
        System.out.println("hello,master");
        System.out.println("hello,hot-fix333");
        System.out.println("push3");
        System.out.println("pull1 test");
        return deptMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Dept record) {
        return deptMapper.insert(record);
    }

    @Override
    public int insertSelective(Dept record) {
        return deptMapper.insertSelective(record);
    }

    @Override
    public Dept selectByPrimaryKey(Long id) {
        return deptMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Dept record) {
        return deptMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Dept record) {
        return deptMapper.updateByPrimaryKey(record);
    }
}
