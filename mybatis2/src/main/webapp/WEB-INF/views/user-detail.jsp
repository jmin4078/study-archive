<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
  <title>User Account</title>
</head>
<body>
<h1>User Account</h1>
<section>
  <form method="post">
    <input type="hidden" name="id" value="${user.id}" readonly>
    <input name="name" value="${user.name}"><br>
    <input name="email" value="${user.email}"><br>
    <input name="age" type="number" value="${user.age}"><br>
    <input name="city" value="${user.city}"><br>
    <button>수정</button>
  </form>
</section>
</body>
</html>