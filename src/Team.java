
abstract class Team {
	private String name;
	private int played = 0;
	private int won = 0;
	private int lost = 0;
	private int tied = 0;
	
	public Team(String name) {
		this.name = name;
	}
	
	public void setPlayed(int played) {
		this.played = played;
	}

	public void setWon(int won) {
		this.won = won;
	}

	public void setLost(int lost) {
		this.lost = lost;
	}

	public void setTied(int tied) {
		this.tied = tied;
	}

	public String getName() {
		return name;
	}

	public int getPlayed() {
		return played;
	}

	public int getWon() {
		return won;
	}

	public int getLost() {
		return lost;
	}

	public int getTied() {
		return tied;
	}

}
