<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello MyBatis!</title>
</head>
<body>
<h1>Hello MyBatis!</h1>
<section>
    <c:url var="boardUrl" value="/board" />
    <form action="${boardUrl}" method="post">
        <input name="title" placeholder="제목"><br>
        <input name="content" placeholder="내용"><br>
        <input name="writer" placeholder="작성자"><br>
        <button>등록</button>
    </form>
</section>
<section>
    <c:forEach items="${boards}" var="board">
        <p>${board.id}</p>
        <p>${board.title}</p>
        <p>${board.content}</p>
        <p>${board.writer}</p>
        <p>${board.createdAt}</p>
        <c:url var="boardDetailUrl" value="/board/${board.id}" />
        <a href="${boardDetailUrl}">자세히보기</a>
    </c:forEach>
</section>

</body>
</html>