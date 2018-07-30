<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--------------------------------
	SearchTournament.jsp
---------------------------------->
<HTML>
<BODY bgcolor="lemonchiffon">
<BODY>
<BR>
<h2>大会検索</h2>
<h3>大会名による検索</h3>
<FORM action="./SearchTournament" method="post">
大会名
<INPUT type="text" name="tournament_name">
<BR>
<INPUT type="submit" name="OK">
<BR>
<BR>
</FORM>
<a href="./index.jsp">トップに戻る</a>
</BODY>
</HTML>