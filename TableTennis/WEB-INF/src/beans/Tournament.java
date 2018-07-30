package beans;

public class Tournament {

	private String tournament_name;
	private String start_date;
	private String end_date;
	private String tournament_place;

	public Tournament(String tournament_name,String start_date,String end_date,String tournament_place) {
		this.tournament_name = tournament_name;
		this.start_date = start_date;
		this.end_date = end_date;
		this.tournament_place = tournament_place;
	}

	public Tournament() {
	}


	public String getTournament_name() {
		return tournament_name;
	}

	public void setTournament_name(String tournament_name) {
		this.tournament_name = tournament_name;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getTournament_place() {
		return tournament_place;
	}

	public void setTournament_place(String tournament_place) {
		this.tournament_place = tournament_place;
	}

}