package com.mysp.dao;

import com.mysp.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by zlovet on 2015/10/22.
 */
@Repository
public class UserDao {
    @Resource
    private SqlSession sqlSession;

    //public void addOne(User user) {
   //     sqlSession.insert("RoleConfigMapper.addRoleConfig", roleConfig);
   // }

    public List<User> selectUser(int id) {
        return sqlSession.selectList("UserMapper.getUser", id);
    }
}
