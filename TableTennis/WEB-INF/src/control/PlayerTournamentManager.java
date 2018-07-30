
//　自分が格納されているフォルダ名
package control;

//  自分が格納されているフォルダの外にある必要なクラス
import java.sql.Connection;

import beans.PlayerTournament;
import dao.PlayerTournamentDAO;

public class PlayerTournamentManager {

	//  属性
	private Connection connection = null;

	//  引数を持たないコンストラクタ
	public PlayerTournamentManager(){
	}

	//  追加する
	//  引数はPlayerTournamentオブジェクト
	public void registPlayerTournament(PlayerTournament playertournament){

		//  PlayerTournamentDAOオブジェクト生成
		PlayerTournamentDAO playertournamentDAO = new PlayerTournamentDAO();

		//  DataBaseへ接続し、コネクションオブジェクトを生成する
		this.connection = playertournamentDAO.createConnection();

		//  PlayerTournamentオブジェクトをDataBaseに登録する
		playertournamentDAO.registPlayerTournament(playertournament, this.connection);

		//  DataBaseとの接続を切断する
		playertournamentDAO.closeConnection(this.connection);

		//  コネクションオブジェクトを破棄する
		this.connection = null;

	}

	//  検索
	public PlayerTournament searchPlayerTournament(PlayerTournament playertournament){

		//  PlayerTournamentDAOオブジェクト生成
		PlayerTournamentDAO playertournamentDAO = new PlayerTournamentDAO();

		//  DataBaseへ接続し、コネクションオブジェクトを生成する
		this.connection = playertournamentDAO.createConnection();

		//  検索する
		playertournament = playertournamentDAO.searchPlayerTournament(playertournament, this.connection);

		//  DataBaseとの接続を切断する
		playertournamentDAO.closeConnection(this.connection);

		//  コネクションオブジェクトを破棄する
		this.connection = null;

		return playertournament;
	}

}
