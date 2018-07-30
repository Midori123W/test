
//　自分が格納されているフォルダ名
package dao;

//  自分が格納されているフォルダの外にある必要なクラス
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import beans.Tournament;

public class TournamentDAO{

	//  属性

	//  データベースの接続先アドレスを静的変数として記述
	// studentのところがデータベース名
	private final static String DRIVER_URL =
		"jdbc:mysql://localhost:3306/tabletennis?useUnicode=true&characterEncoding=Windows-31J";

	//  データベース接続ドライバの名前を静的変数として記述
	private final static String DRIVER_NAME = "com.mysql.jdbc.Driver";

	//  データベースのユーザー名　（デフォルトではroot）
	private final static String USER_NAME = "root";

	//  データベースのユーザーのパスワード　(デフォルトでは設定なし)
	private final static String PASSWORD = "mallow";

	//  データベースとの接続を行う
	//  データベースの接続情報を持ったConnectionオブジェクトを返す
	public Connection createConnection(){
		try{
			Class.forName(DRIVER_NAME);
			Connection con = DriverManager.getConnection(DRIVER_URL, USER_NAME, PASSWORD);
			return con;
		} catch(ClassNotFoundException e){
			System.out.println("Can't Find JDBC Driver.\n");

		} catch(SQLException e){
			System.out.println("Connect Error.\n");
		}
		return null;
	}

	//  Connectionオブジェクトを使って、データベースとの接続を切断する
	//  引数Connectionオブジェクト
	public void closeConnection(Connection con){

		try{
			con.close();
		}catch(Exception ex){}
	}

	//  情報をデータベースに登録する
	//  引数はTournamentオブジェクトと、Connectionオブジェクト
	public void registTournament(Tournament tournament, Connection connection){

		try{

			//  SQLコマンド
			String sql = "insert into tournaments(tournament_name,start_date,end_date,tournament_place) values(?, ?, ?, ?)";

			//  SQLコマンドの実行
			PreparedStatement stmt = connection.prepareStatement(sql);

			//  SQLコマンドのクエッションマークに値を、1番目から代入する
			stmt.setString(1, tournament.getTournament_name());
			stmt.setString(2, tournament.getStart_date());
			stmt.setString(3, tournament.getEnd_date());
			stmt.setString(4, tournament.getTournament_place());

			stmt.executeUpdate();

		}catch(SQLException e){

//			エラーが発生した場合、エラーの原因を出力する
			e.printStackTrace();

		} finally {
		}
	}

	//  検索する
	//  引数はTournamentオブジェクトと、Connectionオブジェクト
	public Tournament searchTournament(Tournament tournament, Connection connection){

		try{

			//  SQLコマンド
			String sql = "select * from tournaments where tournament_name = '" + tournament.getTournament_name() + "'";

			//  SQLのコマンドを実行する
			//  実行結果はrsに格納される
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			rs.first();

			//  rsからそれぞれの情報を取り出し、Tournamentオブジェクトに設定する
			tournament.setStart_date(rs.getString("start_date"));
			tournament.setEnd_date(rs.getString("end_date"));
			tournament.setTournament_place(rs.getString("tournament_place"));

			//  終了処理
			stmt.close();
			rs.close();

			//  Tournamentオブジェクトを返す
			return tournament;

			}catch(SQLException e){

				//	エラーが発生した場合、エラーの原因を出力し、nullオブジェクトを返す
				e.printStackTrace();
				return null;

			}finally{
			}
	}

}