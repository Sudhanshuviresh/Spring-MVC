<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="summary">
name<input type="text" name="name" value="${product.pname}"><br>
price<input type="text" name="price" value="${product.price}"><br>
quantity<input type="text" name="quantity"><br>
<input  type="radio" name="buy" value="buy">Buy<br>
<input type="submit">
</form>
</body>
</html>