<%@page contentType="text/html; charset=EUC-KR"%>

<html>
<head><title>글 상세</title></head>
<body>
<center>
<h3>글 상세</h3>
<hr>
<table border='1' cellpadding='0' cellspacing='0'>
	<tr>
		<td>제목</td><td>${board.title}</td>
	</tr>
	<tr>
		<td>작성자</td><td>${board.writer}</td>
	</tr>
	<tr>
		<td>내용</td><td><textarea name='content' cols='40' rows='10' disabled='disabled'>${board.content}</textarea></td>
	</tr>
	<tr>
		<td>등록일</td><td>${board.regDate}</td>
	</tr>
	<tr>
		<td>조회수</td><td>${board.cnt}</td>
	</tr>
</table>
<hr>
</center>
</body>
</html>
