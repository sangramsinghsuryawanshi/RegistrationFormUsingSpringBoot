<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
<form action="/update" method="post">
	<h1>Update Registration Form</h1>
		<input type="hidden" name="id" value="${Sendata.id}">
		<label>Name:</label><br><br>
		<input type="text" value="${Sendata.name}"><br><br>
		<label>Email:</label><br><br>
		<input type="email" value="${Sendata.email}"><br><br>
		<label>Phone:</label><br><br>
		<input type="text" value="${Sendata.phone}"><br><br>
		<label>Phone:</label><br><br>
		<input type="password" value="${Sendata.password}"><br><br>
		<button type="submit">Update</button><br><br><br>
	</form>
</body>
</html>