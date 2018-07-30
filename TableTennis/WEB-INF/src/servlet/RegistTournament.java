//--------------------------------
//	RegistTournament.java
//--------------------------------
//　自分が格納されているフォルダ名
package servlet;

//自分が格納されているフォルダの外にある必要なクラス
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Tournament;
import control.TournamentManager;

	//HttpServletを継承することで、このクラスはServletとして、働くことができる
	public class RegistTournament extends HttpServlet{

	/**
	*
	*/
		private static final long serialVersionUID = 1L;

	//  doGetメソッドは使わないので、doPostメソッドへ転送
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doPost(request, response);
	}

	//  requestオブジェクトには、フォームで入力された文字列などが格納されている。
	//  responseオブジェクトを使って、次のページを表示する
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{

		// requestオブジェクトの文字エンコーディングの設定
		request.setCharacterEncoding("UTF-8");

		// requestオブジェクトから登録情報の取り出し
		String tournament_name = request.getParameter("tournament_name");
		String start_date = request.getParameter("start_date");
		String end_date = request.getParameter("end_date");
		String tournament_place= request.getParameter("tournament_place");

		System.out.println("取得した文字列は"+tournament_name+"です！");
		System.out.println("取得した文字列は"+start_date+"です！");
		System.out.println("取得した文字列は"+end_date+"です！");
		System.out.println("取得した文字列は"+tournament_place+"です！");


		// Tournamentオブジェクトに情報を格納
		Tournament tournament = new Tournament(tournament_name, start_date,end_date,tournament_place);

		//  TournamentManagerオブジェクトの生成
		TournamentManager manager = new TournamentManager();

		//  登録
		manager.registTournament(tournament);

		//  成功画面を表示する
		response.sendRedirect(response.encodeRedirectURL("./registSuccess.jsp"));
		}
}