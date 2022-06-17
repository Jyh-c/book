package com.jmp.servlet;

import com.jmp.model.User;
import com.jmp.service.UserService;
import com.jmp.service.impl.UserServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author JYH
 * @version 1.0
 * @date 2020/6/20 22:10
 */
@WebServlet(name = "UserServlet", urlPatterns = "/UserServlet")
public class UserServlet extends HttpServlet {

    UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        String m = request.getParameter("m");
        if ("add".equals(m)){
            add(request, response);
        }
    }

    private void add(HttpServletRequest request, HttpServletResponse response) {
        String userName = request.getParameter("username");
        String isbn = request.getParameter("password");
        User user = new User();
        user.setUser_name(userName);
        user.setPassword(isbn);
        try {
            userService.add(user);
            request.setAttribute("result", "<script>alert('注册成功');</script>");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
