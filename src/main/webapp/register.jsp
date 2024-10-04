<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Register</title>
</head>
<body>
	
	<form action="/register">
	<h1>Student Registration Form</h1>
		<label>Name:</label><br><br>
		<input type="text" name="name" placeholder="Enter your name" required="required"><br><br>
		<label>Email:</label><br><br>
		<input type="email" name="email" placeholder="Enter your eamil" required="required"><br><br>
		<label>Phone:</label><br><br>
		<input type="text" name="phone" placeholder="Enter your Phone" required="required"><br><br>
		<label>Phone:</label><br><br>
		<input type="password" name="password" placeholder="Enter your password" required="required"><br><br>
		<button type="submit">Register</button><br><br><br>
	</form>
	<form action="/fetch">
			<button type="submit">Fetch</button>
		</form>
</body>
</html>