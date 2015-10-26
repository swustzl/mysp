package com.test.service;

import com.mysp.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by zlovet on 2015/10/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:root-context.xml" })
public class UserServiceTest {
    public final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private UserService userService;

    @Test
    public void getAllUsers(){
        userService.getAllUsers();
    }
}
