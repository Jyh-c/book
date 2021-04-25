package com.jmp.dao;

import com.jmp.model.User;
import com.jmp.util.DBUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * @author JYH
 * @version 1.0
 * @date 2020/6/20 0:41
 */
public class UserDaoImpl implements UserDao{

    /**
     * 查询运行器
     */
    static QueryRunner qr = null;

    /**
     * 加载sql文件
     */
    static ResourceBundle rb = ResourceBundle.getBundle("com.jmp.dao.book-sql");

    public UserDaoImpl(){
        //创建BookDaoImpl对象时加载QueryRunner
        qr = new QueryRunner();
    }

    @Override
    public User login(String user_name, String password) throws SQLException{
        String sql = rb.getString("user.sql.login");
        User user = qr.query(DBUtil.getConnection(),sql,new BeanHandler<>(User.class),user_name,password);
        return user;
    }
}
