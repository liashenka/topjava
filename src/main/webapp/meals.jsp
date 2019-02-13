<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mitry
  Date: 10.02.19
  Time: 09:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Meals</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<h2>Meals</h2>
<br/>
<table border="1px">
    <tr>
        <th>Description</th>
        <th>Date</th>
        <th>Calories</th>
    </tr>
    <c:forEach items="${mealTos}" var="meal">
        <tr style="color:${(meal.excess == true ? 'red' : 'green')}">
            <td><c:out value="${meal.description}"/></td>
            <td><c:out value="${meal.dateTime.toLocalDate()}"/></td>
            <td><c:out value="${meal.calories}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
