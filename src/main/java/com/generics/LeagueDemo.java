package com.generics;

import com.abstractclass.FootBallPlayer;
import com.abstractclass.SoccerPlayer;
import com.abstractclass.Team;

public class LeagueDemo {

	public static void main(String[] args) {
		
		League<Team<FootBallPlayer>> footballleaue = new League<>("AFL");
		Team<FootBallPlayer> adelaideCrows = new Team<>("adelaide crows");
		Team<SoccerPlayer> soccerTeam = new Team<>("soccerTeam");

		Team<SoccerPlayer> brokenTeam = new Team<>("adelaide crows");
		
		footballleaue.add(adelaideCrows);



		
	}

}
