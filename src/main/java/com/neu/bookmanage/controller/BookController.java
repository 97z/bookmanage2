package com.neu.bookmanage.controller;

import com.github.pagehelper.PageInfo;
import com.neu.bookmanage.entity.Book;
import com.neu.bookmanage.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("book")
public class BookController {
    @Resource
    private BookService bookService;
    @RequestMapping("getPaged")
    public String getPaged(@RequestParam(defaultValue ="1") int pageNum, @RequestParam(defaultValue ="3")int pageSize, Model model){
        PageInfo pageInfo = bookService.getPaged(pageNum, pageSize);
        model.addAttribute("pageInfo",pageInfo);
        System.out.println(pageInfo);
        return "book";

    }
    @RequestMapping("getAll")
    @ResponseBody
    public List<Book> getAll(){
        return bookService.getAll();
    }
}
