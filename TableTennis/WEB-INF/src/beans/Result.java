package beans;

public class Result {

	private String result_date;
	private String player1_name;
	private String player2_name;
	private String player1_count;
	private String player2_count;
	private String tournament_name;
	private String position;

	public Result(String result_date,String player1_name,String player2_name,String player1_count,String player2_count,String tournament_name,String position) {

		this.result_date = result_date;
		this.player1_name = player1_name;
		this.player2_name = player2_name;
		this.player1_count = player1_count;
		this.player2_count = player2_count;
		this.tournament_name = tournament_name;
		this.position = position;

	}


	public Result() {
	}


	public String getResult_date() {
		return result_date;
	}

	public void setResult_date(String result_date) {
		this.result_date= result_date;
	}

	public String getPlayer1_name() {
		return player1_name;
	}

	public void setPlayer1_name(String player1_name) {
		this.player1_name = player1_name;
	}

	public String getPlayer2_name() {
		return player2_name;
	}

	public void setPlayer2_name(String player2_name) {
		this.player2_name = player2_name;
	}

	public String getPlayer1_count() {
		return player1_count;
	}

	public void setPlayer1_count(String player1_count) {
		this.player1_count = player1_count;
	}

	public String getPlayer2_count() {
		return player2_count;
	}

	public void setPlayer2_count(String player2_count) {
		this.player2_count = player2_count;
	}

	public String getTournament_name() {
		return tournament_name;
	}

	public void setTournament_name(String tournament_name) {
		this.tournament_name = tournament_name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
