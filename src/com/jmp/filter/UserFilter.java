package com.jmp.filter;

import com.jmp.pojo.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author JYH
 * @version 1.0
 * @date 2020/9/18 20:52
 */
@WebFilter(filterName = "UserFilter",urlPatterns = "/*")
public class UserFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        User user = (User) request.getSession().getAttribute("user");
        String uri = request.getRequestURI();
        if(uri.endsWith("/login")){
            chain.doFilter(req, resp);
        }else if(user != null){
            chain.doFilter(req, resp);
        }else{
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }

    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
