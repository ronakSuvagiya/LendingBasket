<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<c:forEach items="${lists}" var="item">
				<c:out value="${item.get(0)}"></c:out>
				<c:out value="${item.get(1)}"></c:out>
		</c:forEach>
</body>
</html>