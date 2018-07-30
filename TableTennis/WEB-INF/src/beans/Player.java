package beans;

public class Player {

	private String player_name;
	private String player_birthday;

	public Player(String player_name,String player_birthday) {

		this.player_name = player_name;
		this.player_birthday = player_birthday;

	}


	public Player() {
	}




	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name= player_name;
	}

	public String getPlayer_birthday() {
		return player_birthday;
	}

	public void setPlayer_birthday(String player_birthday) {
		this.player_birthday = player_birthday;
	}

}
