<%@page import="com.multicampus.view.board.vo.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html; charset=EUC-KR"%>

<html>
<head>
<title>�� ���</title>
</head>

<% 
	ArrayList<BoardVO> boardList = 
		(ArrayList<BoardVO>)session.getAttribute("boardList");
%>

<body>
<center>
<h3>TEST BOARD LIST</h3>
<hr>
<table border="1" cellpadding="0" cellspacing="0" width="600">
<tr>
	<th bgcolor="orange">��ȣ</th>
	<th bgcolor="orange">����</th>
	<th bgcolor="orange">�ۼ���</th>
	<th bgcolor="orange">��ȸ��</th>
</tr>
<%for(BoardVO vo : boardList){ %>
<tr>
	<td align="center" width="50"><%= vo.getSeq() %></td>
	<td align="left" width="300">
		<a href="getBoard.sds?seq=<%= vo.getSeq()%>"><%= vo.getTitle()%></a>
	</td>
	<td align="center" width="150"><%= vo.getWriter() %></td>
	<td align="center" width="100"><%= vo.getCnt() %></td>
</tr>
<%} %>
</table>
<hr>
</center>
</body>
</html>
