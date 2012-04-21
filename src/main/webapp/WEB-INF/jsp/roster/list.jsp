<%-- Source project: sip03, branch: 01 (Maven Project) --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<title>Roster</title>
	</head>
	<body>
		<h1>Roster</h1>
		<ul>
			<c:forEach var="member" items="${memberList}" 
			     varStatus="status">
				<li>
				    <a href="member.do?id=${status.index}">
				        <c:out value="${member}"></c:out>
				    </a>
                </li>
			</c:forEach>
		</ul>
	</body>
</html>
