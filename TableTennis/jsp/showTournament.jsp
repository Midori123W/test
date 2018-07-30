<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!-- beans.Studentをimportする -->
<%@ page import= "beans.Tournament" %>


<html>
<BODY bgcolor="wheat">
<head><title>大会検索結果</title></head>

<h1>大会検索結果</h1>
<br>

<table border="1" width="100%">
	<tr>
		<td width = "40%"> <center>大会名</center> </td>
		<td width = "60%"> <center>${Tournament.tournament_name} </center> </td>
	</tr>
	<tr>
		<td width = "40%"> <center>期間</center> </td>
		<td width = "60%"> <center>${Tournament.start_date} ～ ${Tournament.end_date} </center> </td>
	</tr>
	<tr>
		<td width = "40%"> <center>開催場所</center> </td>
		<td width = "60%"> <center>${Tournament.tournament_place} </center> </td>
	</tr>
</table>
<br>
<a href="./index.jsp">トップに戻る</a>
</body>
</html>