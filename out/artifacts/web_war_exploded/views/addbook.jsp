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
    <title>添加图书</title>
</head>
<body>
    <div align="center">
        <h3>添加图书</h3>
        <form action="${pageContext.request.contextPath}/BookServlet?m=add" method="post">
            <table>
                <tr>
                    <td>图书名称</td>
                    <td><input type="text" name="book_name"></td>
                </tr>
                <tr>
                    <td>ISBN编号</td>
                    <td><input type="text" name="isbn"></td>
                </tr>
                <tr>
                    <td>图书类型</td>
                    <td><input type="text" name="category"></td>
                </tr>
            </table>
            <input type="submit" value="添加">&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置">
        </form>
    </div>
</body>
</html>
