package com.jmp.servlet;

import com.jmp.model.User;
import com.jmp.service.UserService;
import com.jmp.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author JYH
 * @version 1.0
 * @date 2020/9/18 20:52
 */
@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user_name = request.getParameter("username");
        String password = request.getParameter("password");
        try{
            User user = userService.login(user_name,password);
            if(user == null){
                request.setAttribute("login", "<script>alert('请检查账号密码！！！');</script>");
                request.getRequestDispatcher("/index.jsp").forward(request,response);
            }else{
                request.getSession().setAttribute("user", user);
                request.getRequestDispatcher("/home.jsp").forward(request,response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
