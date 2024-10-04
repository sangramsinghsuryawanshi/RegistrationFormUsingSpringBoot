<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<tr>
			<th>name</th>
			<th>email</th>
			<th>phone</th>
			<th>password</th>
			<th>Actions</th>
		<tr/>
		<c:forEach var="data" items="${data}">
			<tr>
			<td>${data.name}</td>
			<td>${data.email}</td>
			<td>${data.phone}</td>
			<td>${data.password}</td>
			<td class="button">
            <a  href="data/${data.id}"style="margin-right: 10px;">
             Update</a>
             <form action="/deleteProperty/${data.id}" method="post" style="display: inline;" onsubmit="return confirm('Are you sure you want to delete this property?');">
             <button type="submit"> Delete</button>
             </form>
             </td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>