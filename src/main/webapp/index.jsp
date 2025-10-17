<%@ page import="com.study.connection.ConnectionTest" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>

<form action="/list" method="get">
    <input type="hidden"  id="command" name="command" value="list">
    <button type="submit">Go</button>
</form>



<%

    ConnectionTest t = new ConnectionTest();
    out.println(t.getConnection());

%>

</body>
</html>
