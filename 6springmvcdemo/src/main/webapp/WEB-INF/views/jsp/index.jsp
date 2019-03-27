<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html"%>
<html>
	<body>
		<form:form commandName="user" action="/6springmvcdemo/userData" method="POST">
			Name : <form:input path="name"></form:input>
			Desg : <form:input path="desg"></form:input>
			<input type="submit" />
		</form:form>
		
	</body>
</html>
