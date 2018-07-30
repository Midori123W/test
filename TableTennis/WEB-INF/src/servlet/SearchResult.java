//--------------------------------
//	SearchResult.java
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
	public class SearchResult extends HttpServlet{

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
		String player1_name = request.getParameter("player1_name");
		String player2_name = request.getParameter("player2_name");

		String result_date = null;
		String player1_count = null;
		String player2_count = null;
		String position = null;

		// Resultのオブジェクトに情報を格納
		Result result = new Result(result_date,player1_name,player2_name,player1_count,player2_count,tournament_name,position);

		//  ResultManagerオブジェクトの生成
		ResultManager manager = new ResultManager();

		//  学生の検索
		result = manager.searchResult(result);
		//  requestオブジェクトにオブジェクトを登録
		request.setAttribute("Result", result);
		//  情報表示画面を表示する
		//  forwardはrequestオブジェクトを引数として、次のページに渡すことができる
		getServletContext().getRequestDispatcher("/jsp/showResult.jsp").forward(request, response);
		}
}