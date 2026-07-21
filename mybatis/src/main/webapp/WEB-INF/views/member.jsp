<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello MyBatis!</title>
</head>
<body>
<h1>Hello MyBatis!</h1>
<section>
    <c:url var="memUrl" value="/mem" />
    <form action="${memUrl}" method="post">
        <input name="name" placeholder="이름"><br>
        <input name="email" placeholder="이메일"><br>
        <button>등록</button>
    </form>
</section>
<section>
    <c:forEach items="${members}" var="member">
        <p>${member.id}</p>
        <p>${member.name}</p>
        <p>${member.email}</p>
    </c:forEach>
</section>

</body>
</html>