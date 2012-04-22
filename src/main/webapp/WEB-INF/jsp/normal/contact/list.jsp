<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
	<head>
		<title>All Contacts</title>
		<style type="text/css">
			body {
				background: #fff;
				color: #ooo;
				font: 0.688em Arial, Helvetica, sans-serif;
			}		
		</style>
	</head>
	<body>
		<h1>All Contacts</h1>
		
		<ul>							
			<c:set var="currentLetter" value=""/>
			<c:forEach var="contact" items="${contactList}" varStatus="status">
				<c:set var="lastNameInitial" value="${fn:toUpperCase(fn:substring(contact.lastName,0,1))}"/>
				<c:if test="${currentLetter != lastNameInitial}">
					
					<c:set var="currentLetter" value="${lastNameInitial}"/>
					<li style="list-style-type: none; margin-left: -25px;"><b><c:out value="${currentLetter}"/></b></li>
				</c:if>					
				<li><a href="detail.do?id=${status.index}"><c:out value="${contact.firstName} ${contact.lastName}"></c:out></a></li>
			</c:forEach>							
		</ul>		

		<c:if test="${currentDevice.mobile}">
			<c:choose>
				<c:when test="${currentSitePreference.mobile}">
					<a href="${currentUrl}?site_preference=normal">Switch To: Normal Site</a>
				</c:when>
				<c:otherwise>
					<a href="${currentUrl}?site_preference=mobile">Switch To: Mobile Site</a>
				</c:otherwise>
			</c:choose>
		</c:if>   
	</body>
</html>
