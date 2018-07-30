<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--------------------------------
	registResult.jsp
---------------------------------->
<HTML>
<BODY bgcolor="plum">
<BODY>
<BR>
<h2>戦績登録</h2>
<h4>選手は名簿順で登録してください。</h4>

<FORM action="./RegistResult" method="post">
対戦日
<INPUT type="date" name="result_date" required>
<BR>
選手1の名前
<INPUT maxlength='20' type="text" name="player1_name" required>
<BR>
選手2の名前
<INPUT maxlength='20' type="text" name="player2_name" required>
<BR>
選手1のゲームカウント
<INPUT maxlength='10' type="text" name="player1_count" required>
<BR>
選手2のゲームカウント
<INPUT maxlength='10' type="text" name="player2_count" required>
<BR>
大会名
<INPUT maxlength='30' type="text" name="tournament_name" required>
<BR>
対戦位置
<INPUT maxlength='10' type="text" name="position" required>
<BR>
<INPUT type="submit" name="OK">
</FORM>
<a href="./index.jsp">トップに戻る</a>
</BODY>
</HTML>