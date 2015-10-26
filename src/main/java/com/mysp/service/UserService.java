package com.mysp.service;

import com.mysp.dao.UserDao;
import com.mysp.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zlovet on 2015/10/23.
 */
@Service
public class UserService {
    public final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private UserDao userDao;

    public List<User> getAllUsers(){
        List<User> userList = userDao.selectUser();
        logger.info("userList:{}",userList);
        return userList;
    }
}
