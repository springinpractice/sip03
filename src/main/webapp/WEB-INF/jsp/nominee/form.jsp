<%-- Source project: sip03, branch: 02 (Maven Project) --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<title>Nominate a member for the award</title>
	</head>
	<body>
		<h1>Nominate a member for the award</h1>
		<form:form modelAttribute="member">
			<div>First name: <form:input path="firstName"/></div>
			<div>Last name: <form:input path="lastName"/></div>
			<div><input type="submit" value="Submit"></input></div>
		</form:form>
	</body>
</html>
