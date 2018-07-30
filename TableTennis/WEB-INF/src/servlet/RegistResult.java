//--------------------------------
//	RegistResult.java
//--------------------------------
//　自分が格納されているフォルダ名
package servlet;

//自分が格納されているフォルダの外にある必要なクラス
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Result;
import control.ResultManager;

	//HttpServletを継承することで、このクラスはServletとして、働くことができる
	public class RegistResult extends HttpServlet{

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
		String result_date = request.getParameter("result_date");
		String player1_name = request.getParameter("player1_name");
		String player2_name = request.getParameter("player2_name");
		String player1_count = request.getParameter("player1_count");
		String player2_count = request.getParameter("player2_count");
		String tournament_name = request.getParameter("tournament_name");
		String position = request.getParameter("position");

		System.out.println("取得した文字列は"+result_date+"です！");
		System.out.println("取得した文字列は"+player1_name+"です！");
		System.out.println("取得した文字列は"+player2_name+"です！");
		System.out.println("取得した文字列は"+player1_count+"です！");
		System.out.println("取得した文字列は"+player2_count+"です！");
		System.out.println("取得した文字列は"+tournament_name+"です！");
		System.out.println("取得した文字列は"+position+"です！");


		// Resultオブジェクトに情報を格納
		Result result = new Result(result_date, player1_name,player2_name,player1_count,player2_count,tournament_name,position);

		//  ResultManagerオブジェクトの生成
		ResultManager manager = new ResultManager();

		//  登録
		manager.registResult(result);

		//  成功画面を表示する
		response.sendRedirect(response.encodeRedirectURL("./registSuccess.jsp"));
		}
}