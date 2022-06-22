package com.neu.bookmanage.controller;

import com.neu.bookmanage.entity.Bookuser;
import com.neu.bookmanage.service.BookUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Controller
@RequestMapping("user")
public class BookUserController {
    @Resource
    private BookUserService bookUserService;
    @RequestMapping("login")
    public String login(String username, String password, Model model){
        Bookuser bookuser = bookUserService.login(username,password);
        if(bookuser == null){
            model.addAttribute("msg","用户名或密码错误！");
            return "login";
        }else{
            return "forward:/book/getPaged";
        }
    }

    @RequestMapping("getCode")
    public ResponseEntity<byte[]> getCode(HttpSession session) throws IOException {
        char[] arr = {'0','1','2','3','4','5','6','7','8','9'};
        StringBuilder stb = new StringBuilder();
        int n;
        for(int i = 0;i < 4;i++) {
            n = (int)(Math.random()*arr.length);
            stb.append(arr[n]);
        }

        session.setAttribute("code", stb.toString());

        //把字符串放入到图片中，写入到输出流中
        BufferedImage buffImg = new BufferedImage(90, 20, BufferedImage.TYPE_INT_RGB);
        //得到画布
        Graphics g = buffImg.getGraphics();
        //向画布中写入字符串
        g.drawString(stb.toString(), 20, 15);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write(buffImg, "jpeg", bos);

        return new ResponseEntity<byte[]>(bos.toByteArray(), HttpStatus.CREATED);
    }

    @RequestMapping("checkCode")
    @ResponseBody
    public boolean checkCode(String checkCode,HttpSession session) {
        String code = (String)session.getAttribute("code");
        System.out.println("code:"+ code);
        System.out.println("checkcode:"+ checkCode);
        if(code != null && code.equals(checkCode)) {
            System.out.println("一样");
            return true;
        }else {
            System.out.println("不一样");
            return false;
        }

    }
}
