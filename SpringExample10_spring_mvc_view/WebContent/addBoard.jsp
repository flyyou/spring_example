<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>���۵��</title>
</head>
<body>
<center>
<h3>���� ����ϱ�</h3>
<form:form commandName="board">
<table border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td>����</td><td><form:input path="title"/></td>
	</tr>
	<tr>
		<td>�ۼ���</td><td><form:input path="writer"/></td>
	</tr>
	<tr>
		<td>����</td><td><form:textarea path="content" cols="40" rows="10"></form:textarea></td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input type="submit" value=" ���� ��� "/></td>
	</tr>
</table>
</form:form>
</center>
</body>
</html>
