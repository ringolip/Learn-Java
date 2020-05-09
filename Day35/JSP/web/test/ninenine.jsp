<%--
  Created by IntelliJ IDEA.
  User: ringo
  Date: 2020/5/9
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table align="center">
    <% for (int i = 1; i <= 9; i++) { %>
    <tr>
        <% for (int j = 1; j <= i ; j++) { %>
        <td><%=j + "x" + i + "=" + (i*j)%></td>
        <% } %>
    </tr>
    <% } %>
</table>

</body>
</html>
