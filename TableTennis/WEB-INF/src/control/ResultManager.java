
//　自分が格納されているフォルダ名
package control;

//  自分が格納されているフォルダの外にある必要なクラス
import java.sql.Connection;

import beans.Result;
import dao.ResultDAO;

public class ResultManager {

	//  属性
	private Connection connection = null;

	//  引数を持たないコンストラクタ
	public ResultManager(){
	}

	//  追加する
	//  引数はResultオブジェクト
	public void registResult(Result result){

		//  ResultDAOオブジェクト生成
		ResultDAO resultDAO = new ResultDAO();

		//  DataBaseへ接続し、コネクションオブジェクトを生成する
		this.connection = resultDAO.createConnection();

		//  ResultオブジェクトをDataBaseに登録する
		resultDAO.registResult(result, this.connection);

		//  DataBaseとの接続を切断する
		resultDAO.closeConnection(this.connection);

		//  コネクションオブジェクトを破棄する
		this.connection = null;

	}

	//  検索
	public Result searchResult(Result result){

		//  ResultDAOオブジェクト生成
		ResultDAO resultDAO = new ResultDAO();

		//  DataBaseへ接続し、コネクションオブジェクトを生成する
		this.connection = resultDAO.createConnection();

		//  検索する
		result = resultDAO.searchResult(result, this.connection);

		//  DataBaseとの接続を切断する
		resultDAO.closeConnection(this.connection);

		//  コネクションオブジェクトを破棄する
		this.connection = null;

		return result;
	}

}
