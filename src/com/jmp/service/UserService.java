package com.jmp.service;

import com.jmp.pojo.User;

/**
 * @author JYH
 * @version 1.0
 * @date 2020/9/18 20:44
 */
public interface UserService {
    /**
     * 登录
     * @param user_name
     * @param password
     * @return
     */
    User login(String user_name,String password);
}
