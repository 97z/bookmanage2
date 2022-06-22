package com.neu.bookmanage.controller;


import com.neu.bookmanage.entity.Dept;
import com.neu.bookmanage.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptController {
    @Resource
    private DeptService deptService;

    @GetMapping("getAllDept")
    public List<Dept> getAllDept(){
        return deptService.getAllDept();
    }

    @GetMapping("{deptno}")
    public Dept getById(@PathVariable("deptno") long deptno){
        return deptService.selectByPrimaryKey(deptno);
    }
    @PostMapping
    public int insert(@RequestBody Dept dept){
        return deptService.insert(dept);
    }

    @PutMapping
    public int update(@RequestBody Dept dept){
        return deptService.updateByPrimaryKey(dept);
    }

    @PatchMapping
    public int updateByPrimaryKeySelective(@RequestBody Dept dept){
        return deptService.updateByPrimaryKeySelective(dept);
    }

    @DeleteMapping("{deptno}")
    public int delete(@PathVariable("deptno") long deptno){
        return deptService.deleteByPrimaryKey(deptno);
    }

}
