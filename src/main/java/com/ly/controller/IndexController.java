package com.ly.controller;

import com.ly.bean.User;
import com.ly.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private UserService userService;
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String index(Model model){
        List<User> userList = userService.getUserAll();
        model.addAttribute("userList",userList);
        logger.info(userList.toString());
        return "index";
    }
}
