package com.works.visibility;

public class AccessControl extends Villain {
	
	private int orcNumber;
	
	public AccessControl(String name, int orcNumber){
		super(name);
		this.orcNumber = orcNumber;
		
	}
	public void change(String name, int orcNumber){
		set(name);
		this.orcNumber = orcNumber;
	}
	
	public String toString(){
		return "Orc" + orcNumber + ": " + super.toString();
	}
	
	
	
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	
	public Door left = new Door(), right = new Door();
	
//	public AccessControl(){
//		for (int i=0; i < 4; i++){
//			wheel[i] = new Wheel();
//		}
//	}
	
	public static void main(String[] args){
	AccessControl ac = new AccessControl("Limburger", 12);
	System.out.println("ac "+ ac);
	ac.change("Santosh", 20);
	System.out.println("Changed ac "+ ac);
//		ac.left.win.rollup();
//		ac.wheel[0].inflate(45);

		}

}

class Engine{
	
	public void start(){
		
	}
	public void rev(){
		
	}
	public void stop(){
		
	}
}

class Wheel {
	public void inflate(int psi){
		
	}
}

class Window{
	public void rollup(){
		
	}
	public void rolldown(){
		
	}
}

class Door{
	public Window win = new Window();
	
	public void open(){
		
	}
	public void close(){
		
	}
		
}

class Villain{
	private String name;
	
	public Villain(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	protected void set(String nm){
		name = nm;
	}
	
	public String toString(){
		return "I'm a Villain and my name is " + name;
	}
		
}



































