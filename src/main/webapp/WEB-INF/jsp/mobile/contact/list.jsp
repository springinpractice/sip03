<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html> 
<html> 
	<head>
		<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1"> 
		<link rel="stylesheet" href="http://code.jquery.com/mobile/1.0b3/jquery.mobile-1.0b3.min.css" />
		<script src="http://code.jquery.com/jquery-1.6.3.min.js"></script>
		<script src="http://code.jquery.com/mobile/1.0b3/jquery.mobile-1.0b3.min.js"></script>
	</head> 
	<body> 
		<section id="listContactsPage" data-role="page">
			<header data-role="header"><h1>All Contacts</h1></header>		
				<div class="content" data-role="content">	
					<ul data-role="listview" data-inset="true" data-theme="d" data-divider-theme="d">							
						<c:set var="currentLetter" value=""/>
						<c:forEach var="contact" items="${contactList}" varStatus="status">
							<c:set var="lastNameInitial" value="${fn:toUpperCase(fn:substring(contact.lastName,0,1))}"/>
							<c:if test="${currentLetter != lastNameInitial}">							
								<c:set var="currentLetter" value="${lastNameInitial}"/>
								<li data-role="list-divider"><c:out value="${currentLetter}"/></li>
							</c:if>					
							<li><a href="detail.do?id=${status.index}" data-transition="slide"><c:out value="${contact.firstName} ${contact.lastName}"></c:out></a></li>
						</c:forEach>							
					</ul>
				</div>								
			<footer data-role="footer">
				<a href="#sitePreferenceSelectionPage" data-rel="dialog" data-role="button" data-icon="gear">Edit Site Preference</a>
			</footer>
		</section>
		<section id="sitePreferenceSelectionPage" data-role="page">
			<header data-role="header"><h1>Site Preference</h1></header>		
				<div class="content" data-role="content">
					<h3>Switch to Normal Site?</h3>	
					<div data-role="controlgroup">
					<a href="${currentUrl}?site_preference=normal" data-role="button" rel="external">Yes</a>					
					<a href="#" data-rel="back" data-role="button">Cancel</a>
					</div>					
				</div>								
			<footer data-role="footer"></footer>
		</section>		
	</body>
</html>