<%@page import="java.util.List"%>
<%@page import="Entity.BinhLuan"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entity.BaiViet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="assets/js/jquery.min.js"></script>
</head>
<body>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#btnPost').click(function(e) {
				$.ajax({
					type : 'GET',
					url : 'TopicController',
					data : {
						txtAction : 'getallpost'
					},
					success : function(data, status) {
						alert(data);
					},
				});
			});
			
			$('#btnComment').click(function(e) {
				$.ajax({
					type : 'GET',
					url : 'CommentController',
					data : {
						txtAction : 'comment',
						txtComment : $('#txtComment').val(),
						mabaiviet : $('#mabaiviet').val(),
						mabinhluan : $('#mabinhluan').val()
					},
					success : function(data, status) {
						alert(data);
					},
				});
			});
			
			$('#frmpostandcomment').submit(function(e) {
				e.preventDefault();
			});
		});
	</script>
	<%
		ArrayList<BaiViet> lsPost = (ArrayList<BaiViet>) session.getAttribute("post");
		if (lsPost == null) {
			out.print(lsPost);
	%>
	<h1>khong co gi</h1>
	<%
		} else {
	%>
	<form id="frmpostandcomment">
		<table>
			<%
				for (BaiViet bv : lsPost) {
			%>
			<tr>
				<td><p id="mabaiviet"><%=bv.getMaBaiViet()%></p></td>
				<td><%=bv.getChuDe().getTenChude()%></td>
			</tr>
			<tr>
				<td><%=bv.getTieuDe()%></td>
				<td><%=bv.getNoidung()%></td>
				<td><%=bv.getVote()%></td>
			</tr>
			<%
				for (BinhLuan bl : bv.getBinhluan()) {
			%>
			<tr>
				<td><p id="mabinhluan"><%=bl.getMaBinhluan()%></p></td>
				<td><%=bl.getNoidung()%></td>
				<td><%=bl.getVote()%></td>
			</tr>

			<%} %>
			<%
				}
				}
			%>
			<tr>
				<td><input type="submit" id="btnPost" value="Post" /></td>
			</tr>
			<tr>
				<td><input type="text" id="txtComment" /></td>
				<td><input type="submit" id="btnComment" value="Send" /></td>
			</tr>
		</table>
	</form>
</body>
</html>