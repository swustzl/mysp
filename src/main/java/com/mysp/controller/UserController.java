package com.mysp.controller;

import com.mysp.model.User;
import com.mysp.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zlovet on 2015/10/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value="/findAllUser",method= RequestMethod.GET)
    public @ResponseBody String findAllUser()
    {
        List<User> users = userService.getAllUsers();
        return users.get(0).toString();

    }
}
