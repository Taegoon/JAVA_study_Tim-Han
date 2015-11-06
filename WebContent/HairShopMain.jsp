<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>HairShop</title>
</head>
<body>
	<div style="width: 660px">
		<table border="0" style="font-size: 12">
			<tr>

				<td rowspan="8"><img src="upload/${hairShop.img}.JPG"
					height="200px"></td>
				<td>이름: ${hairshop.name}</td>
			</tr>
			<tr>
				<td>주소:${hairshop.addr}</td>
			</tr>
			<tr>
				<td>OPEN TIME:${hairshop.open}</td>
			</tr>
			<tr>
				<td>CLOSE TIME:${hairshop.close}</td>
			</tr>
			<tr>
				<td>지역 아이디:${hairshop.area_id.area_id}</td>
			</tr>
			<tr>
				<td>소개:${hairshop.des}</td>
			</tr>
			<tr>
				<td>전화:${hairshop.phone}</td>
			</tr>
			<tr>
				<td>이메일:${hairshop.email}</td>
			</tr>
		</table>
		<br><hr><br>
		<table>
			<tr>
				<c:forEach var="designer" items="${designers}">
					<td><img src="upload/${designer.img}.JPG" height="200px">
						<br>${designer.name} <br>${designer.jikwi} <br>${designer.hairshop.name}
						<br>${designer.career}</td>
				</c:forEach>
			</tr>
		</table>
		<br><hr><br>
		<table align="center">
			<tr>
				<td valign="top" align="center"><c:if
						test="${!empty param.bbs }">
						<c:import url="${param.bbs}" />
					</c:if> <c:if test="${!empty bbs }">
						<c:import url="${bbs}" />
					</c:if>
				</td>
			</tr>
		</table>
		<br><hr><br>
	</div>
</body>
</html>