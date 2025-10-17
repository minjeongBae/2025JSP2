<%--
  Created by IntelliJ IDEA.
  User: ssii6
  Date: 2025-10-12
  Time: 오후 7:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>목록</title>
</head>
<body>
    <h1>게시판 - 목록</h1>

    <table border="1">
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
        </tr>

        <c:forEach var="board" items="${boardList}">
            <tr>
                <td>${board.boardId}</td>
                <td>${board.title}</td>
                <td>${board.writer}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
