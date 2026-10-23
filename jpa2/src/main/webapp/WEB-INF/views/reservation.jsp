<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 26. 7. 24.
  Time: 오후 2:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
  <title>Hello JPA</title>
</head>
<body>
<h1>Hello JPA</h1>
<section>
  <form method="post" action="/reservation/doctor">
    <input name="name" placeholder="의사 이름"><br>
    <button>추가</button>
  </form>
</section>
<section>
  <form method="post">
    <select name="doctorId">
      <c:forEach items="${doctors}" var="doctor">
        <option value="${doctor.id}">${doctor}</option>
      </c:forEach>
    </select>
    <select name="petId">
      <c:forEach items="${pets}" var="pet">
        <option value="${pet.id}">${pet}</option>
      </c:forEach>
    </select>
    <button>예약</button>
  </form>
</section>
</body>
</html>