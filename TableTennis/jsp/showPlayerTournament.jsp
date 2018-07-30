<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!-- beans.Studentをimportする -->
<%@ page import= "beans.PlayerTournament" %>


<html>
<BODY bgcolor="wheat">
<head><title>出場大会検索結果</title></head>

<body bgcolor="skyblue">
<h1>出場大会検索結果</h1>
<br>

<table border="1" width="100%">

	<tr>
		<td width = "40%"> <center>選手名</center> </td>
		<td width = "60%"> <center>${PlayerTournament.player_name} </center> </td>
	</tr>
	<tr>
		<td width = "40%"> <center>大会名</center> </td>
		<td width = "60%"> <center>${PlayerTournament.tournament_name} </center> </td>
	</tr>
</table>
<br>
<a href="./index.jsp">トップに戻る</a>
</body>
</html>