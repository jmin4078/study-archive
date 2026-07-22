<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
  <title>Order</title>
</head>
<body>
<h1>Order</h1>
<section>
  <form method="post" action="/orders/members">
    <input name="name" placeholder="이름"><br>
    <input name="email" placeholder="이메일"><br>
    <button>생성</button>
  </form>
</section>
<section>
  <c:forEach items="${members}" var="member">
    <p>${member}</p>
  </c:forEach>
</section>
<section>
  <form method="post" action="/orders">
    <input name="productName" placeholder="상품이름"><br>
    <input name="memberId" type="number" placeholder="유저ID"><br>
    <button>생성</button>
  </form>
</section>
<section>
  <c:forEach items="${orders}" var="order">
    <p>${order}</p>
  </c:forEach>
</section>
<section>
  <c:forEach items="${membersWithOrders}" var="member">
    <p>${member}</p>
  </c:forEach>
</section>
</body>
</html>