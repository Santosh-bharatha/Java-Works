package com.methods;

public class Methods {

	public static void main(String[] args) {

		
		int highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("Tim", highScorePosition);
		
		calculateHighScorePosition(75);
		calculateHighScorePosition("Santosh", 1550);
		calculateHighScorePosition();
		
	}
	
	
	
	public static void displayHighScorePosition(String playerName, int highScorePosition){
		System.out.println(playerName + "  Managed to get into Position :"+highScorePosition);
		
		
		
	}
	
	public static int calculateHighScorePosition(String playerName, int score){
		
		System.out.println("Player "+playerName + "Score"+score+ "Points");
		return score * 1000;
		
	}
	
public static int calculateHighScorePosition(int score){
		System.out.println("Unnamed player scored "+ score + "points");
		return score * 1000;
		
	}

public static void calculateHighScorePosition(){
	System.out.println("calculate score is already defined");
}

}
