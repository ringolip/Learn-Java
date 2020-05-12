<%--
  Created by IntelliJ IDEA.
  User: ringo
  Date: 2020/5/11
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${cookie.username}
    <form action="http://localhost:8080/filter/loginservlet" method="get">
        用户名：<input type="text" name="username" value="${cookie.username.value}"><br/>
        密码：<input type="password" name="pwd"><br/>
        <input type="submit" name="提交">
    </form>
</body>
</html>
