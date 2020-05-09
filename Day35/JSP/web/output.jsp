<%--
  Created by IntelliJ IDEA.
  User: ringo
  Date: 2020/5/9
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        out.write("out输出1<br/>");
        out.flush();

        out.write("out输出2<br/>");

        out.write(12);
        out.print(12);
        response.getWriter().write("response输出1<br/>");
        response.getWriter().write("response输出2<br/>");
    %>
</body>
</html>
