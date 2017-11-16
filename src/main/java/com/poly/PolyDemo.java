package com.poly;

class Movie{
	private String name;
	
	
	
	public String getName() {
		return name;
	}

	public Movie(String name){
		this.name=name;
	}
	
	public String plot(){
		return "No plot here";
	}
}

class Jaws extends Movie{

	public Jaws() {
		super("Jaws");
		// TODO Auto-generated constructor stub
	}
	
	public String plot(){
		return "A shark eats lots of people";
	}
}

class IndependenceDay extends Movie{
	public IndependenceDay(){
		super("Independence Day");
	}
	@Override
	public String plot(){
		return "Aliens attempt to take over planet earth";
	}
}

class MazeRunner extends Movie{
	public MazeRunner(){
		super("Maze Runner");
	}
	
	@Override
	public String plot(){
		return "Kids try to escape maze";
		
	}
	
}

class StarWars extends Movie{
	public StarWars(){
		super("Star wars");
	}
	
	@Override
	public String plot(){
		return "Imperial star wars";
	}
}

class  ForgetMovie extends Movie{
	
	public ForgetMovie(){
		super("Forgetable");
	}
}




public class PolyDemo {

	public static void main(String args[]){
		
		for(int i=1; i<11; i++){
			Movie movie = randomMovie();
			System.out.println("Movie #"+ i + ":"+ movie.getName() + "\n"
			                                + "Plot:" + movie.plot() + "\n");
		}
		
	}


public static Movie randomMovie(){
	int randomNumber = (int) (Math.random() * 5) +1;
	
	System.out.println("Random number generated was :"+ randomNumber);
	
	switch(randomNumber){
	case 1: 
		return new Jaws();
	
	case 2: 
		return new IndependenceDay();
		
	case 3:
		return new StarWars();
	case 4:
		return new ForgetMovie();
	case 5:
		return new MazeRunner();
	}
	return null;
}

}