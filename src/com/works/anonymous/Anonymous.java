package com.works.anonymous;

import javax.swing.JOptionPane;

public class Anonymous {

	public static void main(String[] args) {
		
		   Ball b = new Ball(){
			public void hit(){
				System.out.println("You hit it !");
			}
		};
		b.hit();
			
		TalkingClock clock = new TalkingClock();
		clock.start(1000,true);
		
		JOptionPane.showMessageDialog(null, "Quit Program?");
		System.exit(0);
		
	}
	
	interface Ball {
		void hit();
	}

}


