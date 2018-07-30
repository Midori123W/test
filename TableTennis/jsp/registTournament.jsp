<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--------------------------------
	registTournament.jsp
---------------------------------->
<HTML>
<BODY bgcolor="plum">
<BODY>
<BR>
<h2>大会登録</h2>
<FORM action="./RegistTournament" method="post">
大会名
<INPUT maxlength='30' type="text" name="tournament_name" required>
<BR>
開始日
<INPUT type="date" name="start_date" required>
<BR>
終了日
<INPUT type="date" name="end_date" required>
<BR>
開催場所
<INPUT maxlength='20' type="text" name="tournament_place" required>
<BR>
<INPUT type="submit" name="OK">
</FORM>
<a href="./index.jsp">トップに戻る</a>
</BODY>
</HTML>