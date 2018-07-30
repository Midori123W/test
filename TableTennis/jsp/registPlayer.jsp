<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--------------------------------
	registPlayer.jsp
---------------------------------->
<HTML>
<BODY bgcolor="plum">
<BODY>
<BR>
<h2>選手登録</h2>
<FORM action="./RegistPlayer" method="post">
選手の名前
<INPUT maxlength='20' type="text" name="player_name" required>
<BR>
生年月日
<INPUT type="date" name="player_birthday">
<BR>
<INPUT type="submit" name="OK">
</FORM>
<a href="./index.jsp">トップに戻る</a>
</BODY>
</HTML>