<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Todo</title>
</head>
<body>
	<div align="center">
		<h1 style="background-color: lightgreen; color: darkgreen">Add New Todo Page</h1>
	</div>
	<div align="center">
		<table cellspacing="0" cellpadding="6" border="1" widht="60%">
			<tr>
				<td colspan="8"
					style="background-color: lightblue; color: darkgreen; font-size: 16pt"
					align="center">Todo Info</td>
			</tr>
			<tr>
				<td><form:form method="POST" action="updatetodo">
						<table widht="100%">
							<tr>
								<td><form:label path="title">Title</form:label></td>
								<td align="left" width="70%"><form:input path="title" /></td>
							</tr>
							<tr>
								<td><form:label path="due">Due</form:label></td>
								<td align="left"><form:input path="due" /></td>
							</tr>
							<tr>
								<td><form:label path="detail">Detail</form:label></td>
								<td align="left"><form:input path="detail" /></td>
							</tr>
							<tr>
								<td><form:label path="register">Register</form:label></td>
								<td align="left"><form:input path="register" /></td>
							</tr>
							<tr>
								<td><form:label path="category">Category</form:label></td>
								<td align="left"><form:input path="category" /></td>
							</tr>
							<tr>
								<td colspan="2"><input type="submit" value="Submit" /></td>
							</tr>
						</table>
					</form:form></td>
			</tr>
		</table>
	</div>
</body>
</html>