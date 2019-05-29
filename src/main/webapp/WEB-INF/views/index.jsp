<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>

	Hello World!
	
	
	<table border="1">
	<thead>
		<tr>
		 <td>Name</td>
		 <td>Category</td>
		 <td>Description</td>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${test }" var="item">
	<tr> 
		<td>${item.name }</td>
		 <td>${item.category }</td>
		 <td>${item.description }</td>
	
	</tr>
	</c:forEach>
	</tbody>
	</table>
	
	<a href="add">Add Food</a>
	
</body>
</html>