<%@page contentType="text/html; charset=EUC-KR"%>

<html>
<head><title>�� ��</title></head>
<body>
<center>
<h3>�� ��</h3>
<hr>
<table border='1' cellpadding='0' cellspacing='0'>
	<tr>
		<td>����</td><td>${board.title}</td>
	</tr>
	<tr>
		<td>�ۼ���</td><td>${board.writer}</td>
	</tr>
	<tr>
		<td>����</td><td><textarea name='content' cols='40' rows='10' disabled='disabled'>${board.content}</textarea></td>
	</tr>
	<tr>
		<td>�����</td><td>${board.regDate}</td>
	</tr>
	<tr>
		<td>��ȸ��</td><td>${board.cnt}</td>
	</tr>
</table>
<hr>
</center>
</body>
</html>
