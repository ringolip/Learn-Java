<%--
  Created by IntelliJ IDEA.
  User: ringo
  Date: 2020/5/9
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>scope.jsp页面</title>
</head>
<body>

    <%  // 向jsp四个域对象中都保存了数据
        pageContext.setAttribute("key", "value");
        request.setAttribute("key", "request");
        session.setAttribute("key", "session");
        application.setAttribute("key", "application");
    %>

    pageContext域是否有值：<%=pageContext.getAttribute("key")%><br/>
    request域是否有值：<%=request.getAttribute("key")%><br/>
    session域是否有值：<%=session.getAttribute("key")%><br/>
    application域是否有值：<%=application.getAttribute("key")%><br/>

    <jsp:forward page="scope2.jsp"></jsp:forward>
</body>
</html>
