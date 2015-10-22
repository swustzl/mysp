package com.test.dao;

import com.mysp.dao.UserDao;
import com.mysp.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zlovet on 2015/10/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:root-context.xml" })
public class UserDaoTest {
    public final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserDao userDao;
    @Test
    public void test() {
        logger.info("it works");
    }

    @Test
    public void getUser() {
        List<User> users = userDao.selectUser();
        logger.info("users:{}",users);
    }

}
