<%--
  Created by IntelliJ IDEA.
  User: JYH
  Date: 2020/9/18
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书管理系统-登录</title>
</head>
<body>
${request.error}
    <div align="center">
        <form action="/login" method="post">
            用户名：<input type="text" name="username">
            <br>
            密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password">
            <br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="登录" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="reset" value="重置" />
        </form>
    </div>
</body>
</html>
