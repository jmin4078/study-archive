<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
  <title>User Account</title>
</head>
<body>
<h1>User Account</h1>
<%-- Sort --%>
<section>
  <form method="get" action="/users/sorted">
    <select name="sort">
      <option value="name">이름</option>
      <option value="city">도시</option>
    </select>
    <button>제출</button>
  </form>
</section>
<%-- delete ids --%>
<section>
  <form method="post" action="/users/delete">
    <input name="ids">
    <%--    ,로 구분해서 넣기    --%>
    <button>제출</button>
  </form>
</section>

<section>
  <c:url var="searchUrl" value="/users/search"/>
  <form method="get" action="${searchUrl}">
    <input name="name" placeholder="이름 키워드 검색">
    <input name="city" placeholder="도시 키워드 검색">
    <input name="minAge" placeholder="최소 연령 이상 검색" type="number">
    <button>검색</button>
  </form>
</section>
<section>
  <form method="post">
    <input name="name"><br>
    <input name="email"><br>
    <input name="age" type="number"><br>
    <input name="city"><br>
    <button>생성</button>
  </form>
</section>
<section>
  <c:forEach items="${users}" var="user">
    <p>
        ${user.name} ${user.email} ${user.age} ${user.city}<br>
      <a href="<c:url value="/users/${user.id}" />">자세히보기</a>
    </p>
  </c:forEach>
</section>
</body>
</html>