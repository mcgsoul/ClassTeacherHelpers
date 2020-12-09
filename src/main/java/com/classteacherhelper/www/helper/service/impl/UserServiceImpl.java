package com.classteacherhelper.www.helper.service.impl;

import com.classteacherhelper.www.helper.bean.User;
import com.classteacherhelper.www.helper.dao.UserMapper;
import com.classteacherhelper.www.helper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 用户接口实现类
 */
@Repository
public class UserServiceImpl implements UserService {

    @Resource private UserMapper userMapper;

    @Override
    public User findUser(User user) {
        return userMapper.selectOne(user);
    }
}
