<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>새글등록</title>
</head>
<body>
<center>
<h3>새글 등록하기</h3>
<form:form commandName="board">
<table border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td>제목</td><td><form:input path="title"/></td>
	</tr>
	<tr>
		<td>작성자</td><td><form:input path="writer"/></td>
	</tr>
	<tr>
		<td>내용</td><td><form:textarea path="content" cols="40" rows="10"></form:textarea></td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input type="submit" value=" 새글 등록 "/></td>
	</tr>
</table>
</form:form>
</center>
</body>
</html>
