<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!-- beans.Studentをimportする -->
<%@ page import= "beans.Result" %>


<html>
<BODY bgcolor="wheat">
<head><title>戦績検索結果</title></head>

<h1>戦績検索結果</h1>
<br>

<table border="1" width="100%">

	<tr>
		<td width = "40%"> <center>対戦日</center> </td>
		<td width = "60%"> <center>${Result.result_date} </center> </td>
	</tr>
	<tr>
		<td width = "40%"> <center>選手1の名前</center> </td>
		<td width = "60%"> <center>${Result.player1_name} </center> </td>
	</tr>
	<tr>
		<td width = "40%"> <center>選手2の名前</center> </td>
		<td width = "60%"> <center>${Result.player2_name} </center> </td>
	</tr>
	<tr>
		<td width = "40%"> <center>選手1のゲームカウント</center> </td>
		<td width = "60%"> <center>${Result.player1_count} </center> </td>
	</tr>
	<tr>
		<td width = "40%"> <center>選手2のゲームカウント</center> </td>
		<td width = "60%"> <center>${Result.player2_count} </center> </td>
	</tr>
	<tr>
		<td width = "40%"> <center>大会名</center> </td>
		<td width = "60%"> <center>${Result.tournament_name} </center> </td>
	</tr>
	<tr>
		<td width = "40%"> <center>位置</center> </td>
		<td width = "60%"> <center>${Result.position} </center> </td>
	</tr>
</table>
<br>
<a href="./index.jsp">トップに戻る</a>
</body>
</html>