<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--------------------------------
	SearchPlayer.jsp
---------------------------------->
<HTML>
<BODY bgcolor="lemonchiffon">
<BODY>
<BR>
<h2>選手検索</h2>
<h3>選手名による検索</h3>
<FORM action="./SearchPlayer" method="post">
選手名
<INPUT type="text" name="player_name">
<BR>
<INPUT type="submit" name="OK">
<BR><BR>
</FORM>
<a href="./index.jsp">トップに戻る</a>
</BODY>
</HTML>