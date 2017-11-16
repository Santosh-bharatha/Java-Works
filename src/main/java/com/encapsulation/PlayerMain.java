package com.encapsulation;

public class PlayerMain {

	public static void main(String[] args) {
		
		/*Player player = new Player();
		player.name = "Tim";
		player.health = 20;
		player.weapon = "Sword";
		
		int damage=10;
		player.loseHealth(damage);
		System.out.println("Remaining health = "+player.healthRemaining());
		
		damage = 11;
		player.health = 200;
		player.loseHealth(damage);
		System.out.println("Remaining health = "+player.healthRemaining());
		*/

		EnhancedPlayer player = new EnhancedPlayer("Tim", 0, "Sword");
		System.out.println("Initial Health is :"+ player.getHealth());
		
		int damage=50;
		player.loseHealth(damage);
		System.out.println("Initial Health is :"+ player.getHealth());
	}

}
