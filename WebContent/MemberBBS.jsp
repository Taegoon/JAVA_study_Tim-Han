<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���</title>
</head>
<body>
	<center>
		<form action="MemberBBSAdd" method="post" >
			<table bgcolor="#B3B3FF" align="center" >
				<caption>����� ���</caption>
				<tr >
					<td>ȸ�� �г���:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>����:</td>
					<td><input type="text" name="title" size="60"></td>
				</tr>
				<tr>
					<td rowspan="2">����:</td>
					<td>
					<textarea name="content" rows="10" cols="60"></textarea>
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="�ϼ�">
						<input type="reset" value="�ٽ�"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>