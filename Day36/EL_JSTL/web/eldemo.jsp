<%--
  Created by IntelliJ IDEA.
  User: ringo
  Date: 2020/5/10
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setAttribute("key", "value");
    %>

    <%=request.getAttribute("key")%>
    <br/>

    ${key}

    <br/>
    <%=request.getAttribute("key1")%>
    <br/>
    ${key1}
</body>
</html>
