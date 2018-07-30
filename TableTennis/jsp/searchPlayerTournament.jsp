<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--------------------------------
	SearchPlayerTournament.jsp
---------------------------------->
<HTML>
<BODY bgcolor="lemonchiffon">
<BODY>
<BR>
<h2>出場大会検索</h2>
<h3>選手名による検索</h3>
<FORM action="./SearchPlayerTournament" method="post">
選手名
<INPUT type="text" name="player_name">
<BR>
<INPUT type="submit" name="OK">
<BR><BR>
</FORM>
<a href="./index.jsp">トップに戻る</a>
</BODY>
</HTML>