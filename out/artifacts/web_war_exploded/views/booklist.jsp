<%--
  Created by IntelliJ IDEA.
  User: JYH
  Date: 2020/6/20
  Time: 21:48
  To change this tbooklate use File | Settings | File Tbooklates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>图书列表</title>
    <style>
        table,table tr th,table tr td{
            border:1px solid #000;
            text-align:center;
        }
        table{
            width:600px;
            border-collapse:collapse;
        }
        #addbook{
            width:600px;
            height:50px;
        }
        #addbook p{
            padding-top:5px;
            padding-left:480px;
        }
        a{
            text-decoration:none;
        }
    </style>
</head>
<body>
    <div align="center">
        <h3>所有图书列表</h3>
        <div id="addbook">
            <p><a href="${pageContext.request.contextPath}/views/addbook.jsp">添加图书</a></p>
            <p><a href="${pageContext.request.contextPath}/views/blurrynamebook.jsp">书名关键字查询</a></p>
        </div>
        <br><br>
        <table>
            <tr>
                <td>图书编号</td>
                <td>图书名称</td>
                <td>ISBN编号</td>
                <td>图书类别</td>
                <td>选择操作</td>
            </tr>
            <c:forEach items="${bookList}" var="booklist">
                <tr>
                    <td>${booklist.book_id}</td>
                    <td>${booklist.book_name}</td>
                    <td>${booklist.isbn}</td>
                    <td>${booklist.category}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/BookServlet?m=bookInfo&book_id=${booklist.book_id}">修改</a>
                        <a href="${pageContext.request.contextPath}/BookServlet?m=delete&book_id=${booklist.book_id}" onclick="return confirm('您确定要删除吗？');">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        ${null_err}
        <div>
            <a href="${pageContext.request.contextPath}/BookServlet?m=selectAll&pageUp=pageUp">上一页</a>
            <a href="${pageContext.request.contextPath}/BookServlet?m=selectAll&pageDown=pageDown">下一页</a>
        </div>
    </div>
</body>
</html>
