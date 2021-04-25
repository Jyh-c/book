package com.jmp.service;

import com.jmp.dao.UserDao;
import com.jmp.dao.UserDaoImpl;
import com.jmp.model.User;

import java.sql.SQLException;

/**
 * @author JYH
 * @version 1.0
 * @date 2020/9/18 20:46
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public User login(String user_name, String password) throws SQLException {
        return userDao.login(user_name,password);
    }
}
