<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: JYH
  Date: 2020/6/21
  Time: 0:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书名模糊查询</title>
    <style>
        table,table tr th,table tr td{
            border:1px solid #000;
            text-align:center;
        }
        table{
            width:600px;
            border-collapse:collapse;
        }
       #index p{
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
        <h3>书名模糊查询</h3>

        <form action="${pageContext.request.contextPath}/BookServlet?m=blurryname" method="post">
            <input type="text" name="blurryname"><input type="submit" value="搜索"><br><br>
            <div id="index"><a href="/home.jsp">返回首页</a></div>
            <table>
                <tr>
                    <td>图书编号</td>
                    <td>图书名称</td>
                    <td>ISBN编号</td>
                    <td>图书类别</td>
                    <td>选择操作</td>
                </tr>
            <c:forEach items="${bookblurryList}" var="bookblurrylist">
                <tr>
                    <td>${bookblurrylist.book_id}</td>
                    <td>${bookblurrylist.book_name}</td>
                    <td>${bookblurrylist.isbn}</td>
                    <td>${bookblurrylist.category}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/BookServlet?m=bookInfo&book_id=${bookblurrylist.book_id}">修改</a>
                        <a href="${pageContext.request.contextPath}/BookServlet?m=delete&book_id=${bookblurrylist.book_id}" onclick="return confirm('您确定要删除吗？');">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </form>

        <br>
    </div>

</body>
</html>
