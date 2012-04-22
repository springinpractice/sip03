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
		<section id="contactDetailPage" data-role="page">
			<header data-role="header">
				<h1>Info</h1>
				<a href="list.do" data-icon="arrow-l" class="ui-btn-left" data-transition="slide" data-direction="reverse">All Contacts</a>			
			</header>		
				<div class="content" data-role="content">	
					<font size=+2><b>${contact}</b></font><br/>
					<table>
						<tbody>
							<tr>
								<td align="right"><b>phone</b></td>
								<td>${contact.phone}</td>
							</tr>
							<tr>
								<td align="right"><b>email</b></td>
								<td>${contact.email}</td>
							</tr>						
						</tbody>
					</table>																
				</div>								
			<footer data-role="footer">&nbsp;</footer>
		</section>			
	</body>
</html>