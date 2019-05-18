
public class Main {

	public static void main(String[] args) {
//		FootballTeam liverpool = new FootballTeam("Liverpool");
//		FootballTeam barcelona = new FootballTeam("Barcelona");
//		FootballTeam realMadrid = new FootballTeam("Real Madrid");
//		
//		League<FootballTeam> footballLeague = new League<>("Football League");
//		
//		footballLeague.addTeam(liverpool);
//		footballLeague.addTeam(barcelona);
//		footballLeague.addTeam(realMadrid);
//		
//		footballLeague.playMatch(liverpool, barcelona, 1, 0);
//		footballLeague.playMatch(liverpool, realMadrid, 0, 2);
//		footballLeague.playMatch(barcelona, realMadrid, 1, 1);
//		
//		footballLeague.printRankTable();
		
		
		BasketballTeam chicagoBulls = new BasketballTeam("Chicago Bulls");
		BasketballTeam lakers = new BasketballTeam("Lakers");
		BasketballTeam bostonCeltics = new BasketballTeam("Boston Celtics");
		
		League<BasketballTeam> basketballLeague = new League<>("Basketball League");
		
		basketballLeague.addTeam(chicagoBulls);
		basketballLeague.addTeam(lakers);
		basketballLeague.addTeam(bostonCeltics);

		basketballLeague.playMatch(chicagoBulls, lakers, 1, 1);
		basketballLeague.playMatch(chicagoBulls, bostonCeltics, 1, 2);
		basketballLeague.playMatch(bostonCeltics, lakers, 0, 3);
		
		basketballLeague.printRankTable();


	}

}
