<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello MyBatis!</title>
</head>
<body>
<h1>Hello MyBatis!</h1>
<section>
    <c:url var="boardDetailUrl" value="/board/${board.id}" />
    <form action="${boardDetailUrl}" method="post">
        <input name="id" readonly value="${board.id}"><br>
        <input name="title" value="${board.title}" placeholder="제목"><br>
        <input name="content" value="${board.content}" placeholder="내용"><br>
        <input name="writer" value="${board.writer}" placeholder="작성자"><br>
        <input name="createdAt" readonly value="${board.createdAt}">
        <button>수정</button>
        <a href="${boardDetailUrl}/delete">삭제</a>
    </form>
</section>

</body>
</html>