<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Todo List</title>
</head>
<body>
	<div align="center">
		<h1 style="background-color: lightgreen; color: darkgreen">Todo List</h1>
	</div>
	<div align="center">
		<table align="center" width="80%" cellspacing="0" cellpadding="5">
			<tr>
				<td align="right"><a href="${pageContext.request.contextPath}/todo/addtodo"
					style="background-color: lightblue;"> Add Todo </a></td>
			</tr>
			<tr>
				<td>
					<table cellspacing="0" cellpadding="6" border="1" width="100%">
						<tr>
							<td colspan="7"
								style="background-color: lightblue; color: darkgreen; font-size: 16pt"
								align="center">Todo List</td>
						</tr>
						<tr bgcolor="grey" style="color: white">
							<th>No</th>
							<th>Title</th>
							<th>Due</th>
							<th>Detail</th>
							<th>Register</th>
							<th>Category</th>
							<th>Delete</th>
						</tr>
						<c:forEach var="todo" items="${todoList}"
							varStatus="status">
							<tr bgcolor="lightyellow">
								<td><b>${status.index + 1}</b></td>
								<td>${todo.title}</td>
								<td>${todo.due}</td>
								<td>${todo.detail}</td>
								<td>${todo.register}</td>
								<td>${todo.category}</td>
								<td><a href="${pageContext.request.contextPath}/todo/delete/${todo.no}">Delete</a></td>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>