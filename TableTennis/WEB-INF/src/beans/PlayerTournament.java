package beans;

public class PlayerTournament {


	private String player_name;
	private String tournament_name;

	public PlayerTournament(String player_name,String tournament_name) {

		this.player_name = player_name;
		this.tournament_name = tournament_name;
	}

	public PlayerTournament() {
	}




	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public String getTournament_name() {
		return tournament_name;
	}

	public void setTournament_name(String tournament_name) {
		this.tournament_name = tournament_name;
	}

}