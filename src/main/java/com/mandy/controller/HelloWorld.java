package com.mandy.controller;

import com.mandy.model.User;
import com.mandy.service.impl.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by yuanyangjie on 2017/6/19.
 */
@Controller
public class HelloWorld {
    @Resource
    private UserService userService;



    @RequestMapping(value="/hello")
    public String getAllUser(Model model){
        User user=userService.getUserById(1);
        model.addAttribute("user",user);
        return "helloworld";
    }


}
