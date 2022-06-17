package com.jmp.dao;

import com.jmp.model.User;

import java.sql.SQLException;

/**
 * @author JYH
 * @version 1.0
 * @date 2020/6/20 0:21
 */

public interface UserDao {

    /**
     * 登录-验证用户名密码
     * @param user_name
     * @param password
     * @return
     * @throws SQLException
     */
    User login(String user_name, String password) throws SQLException;

    /**
     * 添加用户
     * @param user
     * @throws SQLException
     */
    void add(User user) throws SQLException;

}
