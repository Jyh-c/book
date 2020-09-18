package com.jmp.service;

import com.jmp.pojo.User;
import com.jmp.util.DBUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @author JYH
 * @version 1.0
 * @date 2020/9/18 20:46
 */
public class UserServiceImpl implements UserService {

    //查询运行器
    static QueryRunner qr = null;

    public UserServiceImpl(){
        //创建BookDaoImpl对象时加载QueryRunner
        qr = new QueryRunner();
    }

    @Override
    public User login(String user_name, String password) {
        User user = null;
        String sql = "select * from user where user_name = ? and password = ?";
        try {
            user = qr.query(DBUtil.getConnection(),sql,new BeanHandler<>(User.class),user_name,password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }
}
