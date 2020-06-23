<%--
  Created by IntelliJ IDEA.
  User: JYH
  Date: 2020/6/20
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>更新图书</title>
</head>
<body>
    <div align="center">
        <h3>修改图书</h3>
        <form action="${pageContext.request.contextPath}/BookServlet?m=update" method="post">
            <table>
                <tr>
                    <td>图书编号</td>
                    <td><input type="text" name="book_id" value="${b.book_id}" readonly="readonly"></td>
                </tr>
                <tr>
                    <td>图书名称</td>
                    <td><input type="text" name="book_name" value="${b.book_name}"></td>
                </tr>
                <tr>
                    <td>ISBN编号</td>
                    <td><input type="text" name="isbn" value="${b.isbn}"></td>
                </tr>
                <tr>
                    <td>图书类别</td>
                    <td><input type="text" name="category" value="${b.category}"></td>
                </tr>
            </table>
            <input type="submit" value="修改">&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置">
        </form>
    </div>
</body>
</html>
