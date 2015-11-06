<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>AllHairShop</title>
</head>
<body>
	<table border="1">
		<caption align="left">헤어샵</caption>
		<tr>
			<c:forEach var="hairShop" items="${hairShops}">
				<td><img src="upload/${hairShop.img}.JPG" height="200px">
					<br>${hairShop.name} 
					<br>${hairShop.addr} 
					<br>${hairShop.phone}
					<br>${hairShop.web}</td>
			</c:forEach>
		</tr>
		<tr>
			<td colspan="5" align="center">
			${paging.pageLink}
			</td>
		</tr>
		<tr>
			
		</tr>
	</table>
</body>
</html>