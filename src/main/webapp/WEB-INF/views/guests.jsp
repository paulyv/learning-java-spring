<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/mvc/addGuest" method="POST">
	<input type="text" name="name" value="Anna nimi"/>
	<input type="text" name="age" value="Ikä"/>
	<input type="submit"/>
	    <ol>
        <c:forEach var="vieras" items="${vieraat}">
            <li>${vieras.name}</li>
        </c:forEach>
    </ol>
</form>
</body>
</html>