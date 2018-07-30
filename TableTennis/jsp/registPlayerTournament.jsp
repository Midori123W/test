<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--------------------------------
	registPlayerTournament.jsp
---------------------------------->
<HTML>
<BODY bgcolor="plum">
<BODY>
<BR>
<h2>出場大会登録</h2>
<FORM action="./RegistPlayerTournament" method="post">
選手名
<INPUT maxlength='20' type="text" name="player_name" required>
<BR>
大会名
<INPUT maxlength='30' type="text" name="tournament_name" required>
<BR>
<INPUT type="submit" name="OK">
</FORM>
<a href="./index.jsp">トップに戻る</a>
</BODY>
</HTML>