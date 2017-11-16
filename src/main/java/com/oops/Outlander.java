package com.oops;

public class Outlander extends Car{
	
	private int roadServiceMonths;
	
	public Outlander(int roadServiceMonths){
		super("Outlander", "4WD", 5,5,6, false);
		this.roadServiceMonths = roadServiceMonths;
	}
	
	public void accelerate(int rate){
		int newVelocity = getCurrentVelocity() + rate;
		
		if(newVelocity ==0){
			stop();
		}else if(newVelocity >0 && newVelocity <=10){
			changeGear(1);
		}else if(newVelocity >0 && newVelocity <=20){
			changeGear(2);
		}else if(newVelocity >20 && newVelocity <=30){
			changeGear(3);
		}else{
			changeGear(4);
		}
	}

	private void changeGear(int i) {
		// TODO Auto-generated method stub
		
	}

	private void stop() {
		// TODO Auto-generated method stub
		
	}

	private int getCurrentVelocity() {
		// TODO Auto-generated method stub
		return 0;
	}

}