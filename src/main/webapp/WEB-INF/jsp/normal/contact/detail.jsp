<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Info</title>
		<style type="text/css">
			body {
				background: #fff;
				color: #ooo;
				font: 0.688em Arial, Helvetica, sans-serif;
			}		
		</style>		
	</head>
	<body>
		<h1>Info:</h1>
		<font size=+2><b>${contact}</b></font><br/>
		<table cellspacing="5">
			<tr>
				<td align="right"><b>phone</b></td>
				<td>${contact.phone}</td>
			</tr>
			<tr>
				<td align="right"><b>email</b></td>
				<td>${contact.email}</td>
			</tr>
		</table>
		 
		<p><a href="list.do">All Contacts</a></p>			
	</body>
</html>
