<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Food</title>
</head>
<body>

	<form action="update-food">
	ID: <input type="text" name="id" value="${id}">
	Name: <input type="text" name="name">
	Category: <input type="text" name="category">
	Description: <input type="text" name="description">
	<input type="submit" value="Add">
	</form>

</body>
</html>