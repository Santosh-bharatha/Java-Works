package com.abstractclass;

public class PlayerDemo {

	public static void main(String[] args) {

		
		FootBallPlayer joe = new FootBallPlayer("Joe");
		SoccerPlayer becham = new SoccerPlayer("Beckham");
		
		Team<FootBallPlayer> adelaidCrows = new Team<>("Adelaide Crows");
		adelaidCrows.addPlayer(joe);
	//	adelaidCrows.addPlayer(becham);
		
		
		
		Team<SoccerPlayer> soccerTeam = new Team<>("Chicago Bulls");
		soccerTeam.addPlayer(becham);
		
		
		
		Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
		brokenTeam.addPlayer(becham);
		
		System.out.println(adelaidCrows.numPlayers());
		
		System.out.println(soccerTeam.compareTo(brokenTeam));
	}

}
