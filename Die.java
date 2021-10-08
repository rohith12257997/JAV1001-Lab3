/*A00235384------Satya Rohit
  A00245382------Alekhya
This Program describes die game where different dies are rolled and gives a different value and 
die is rolled to get the maximum value and count how many chances it took
*
*/



package jav_la3;

public class Die {
	private String name;    //variable for name or type used to represent a die
	private static int sides; //variable for no of sides a die has
	private static int current_side; //variable for to represent the current side of the die
	
	//Setters and getters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	public int getCurrent_side() {
		return current_side;
	}
	public void setCurrent_side(int current_side) {
		this.current_side = current_side;
	}
	
	
	
	//Default Constructor
	public Die() {
		System.out.println("Creating a default d6....\n");
		
	}
	
	// 1 argument Constructor
	public Die(int sides) {
		
		this.sides = sides;
		System.out.println("Creating a default d20....\n");
	}
	
	// 3 argument Constructor
		public Die(String name, int sides, int current_side) {
			
			this.name = name;
			this.sides = sides;
			this.current_side = current_side;
			System.out.println("Creating a default d35....\n");
		}
	
	//Roll method
	public static void roll() {
		
	
		current_side=(int)(Math.random() * sides) + 1;
		
		
		
	}
	

}
