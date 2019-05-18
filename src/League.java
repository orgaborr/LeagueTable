import java.util.ArrayList;

public class League<T extends Team> {
	ArrayList<T> league = new ArrayList<>();

	public League() {
		super();
	}

	public boolean addTeam(T team) {
		if(league.contains(team)) {
			System.out.println(team.getName() + " is already in the league.");
			return false;
		}
		league.add(team);
		System.out.println(team.getName() + " has entered the league.");
		return true;
	}
	
	public boolean playMatch(T team1, T team2, int score1, int score2) {
		if(league.contains(team1) && league.contains(team2)) {
			if(score1 > score2) {
				team1.setWon(team1.getWon()+1);
				team2.setLost(team2.getLost()+1);
				System.out.println(team1.getName() + " has won for " + score1 + " : " + score2 +
						" vs " + team2.getName());
					
			} else if(score1 < score2) {
				team2.setWon(team2.getWon()+1);
				team1.setLost(team1.getLost()+1);
				System.out.println(team2.getName() + " has won for " + score2 + " : " + score1 +
						" vs " + team1.getName());
				
			} else if(score1 == score2) {
				team1.setTied(team1.getTied()+1);
				team2.setTied(team2.getTied()+1);
				System.out.println(team1.getName() + " and " + team2.getName() + " played tied for " +
						score1 + " : " + score2);
				
			}
			team1.setPlayed(team1.getPlayed()+1);
			team2.setPlayed(team2.getPlayed()+1);
			return true;
		}
		System.out.println("Teams are not in the league");
		return false;
		
	}
	
}
