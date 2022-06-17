<%--
  Created by IntelliJ IDEA.
  User: JYH
  Date: 2020/6/20
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
    <div align="center">
        <h3>用户注册</h3>
        <form action="${pageContext.request.contextPath}/UserServlet?m=add" method="post">
            <table>
                <tr>
                    <td>用户名称</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>登录密码</td>
                    <td><input type="password" name="password"></td>
                </tr>

            </table>
            <input type="submit" value="注册">&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置">
        </form>
    </div>
</body>
</html>
