<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!-- beans.Studentをimportする -->
<%@ page import= "beans.Player" %>


<html>
<BODY bgcolor="wheat">
<head><title>選手検索結果</title></head>

<body bgcolor="skyblue">
<h1>選手検索結果</h1>
<br>

<table border="1" width="100%">
	<tr>
		<td width = "40%"> <center>名前</center> </td>
		<td width = "60%"> <center>${Player.player_name} </center> </td>
	</tr>
	<tr>
		<td width = "40%"> <center>生年月日</center> </td>
		<td width = "60%"> <center>${Player.player_birthday} </center> </td>
	</tr>
</table>
<br>
<a href="./index.jsp">トップに戻る</a>
</body>
</html>