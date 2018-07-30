<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--------------------------------
	SearchResult.jsp
---------------------------------->
<HTML>
<BODY bgcolor="lemonchiffon">
<BODY>
<BR>
<h2>戦績検索</h2>
<h3>大会名と選手名による検索</h3>
<h4>選手名は名簿順で入力してください。</h4>
<FORM action="./SearchResult" method="post">
大会名
<INPUT type="text" name="tournament_name">
<BR>
選手1
<INPUT type="text" name="player1_name">
<BR>
選手2
<INPUT type="text" name="player2_name">
<BR>
<INPUT type="submit" name="OK">
<BR>
<BR>
</FORM>
<a href="./index.jsp">トップに戻る</a>
</BODY>
</HTML>