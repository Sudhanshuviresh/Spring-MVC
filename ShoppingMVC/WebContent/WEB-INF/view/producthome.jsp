<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<title>Product Home</title>
</head>
<body>
<h1 align="center">Product Home</h1>

<form action="traineehome">
<table border="1" align="center">
<c:forEach items="${productlist}" var="c">
<tr>
<td>${c.pid}</td>
<td><a href="orderpage?pid=${c.pid}">${c.description}</a></td>
<td>${c.pname}</td>
<td>${c.price}</td>
</tr>
</c:forEach>
</table>
</form>

</body>
</html>