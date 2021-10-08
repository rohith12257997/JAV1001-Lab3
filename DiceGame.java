/*A00235384------Satya Rohit
  A00245382------Alekhya
This Program describes die game where different dies are rolled and gives a different value and 
die is rolled to get the maximum value and count how many chances it took
*
*/



package jav_la3;

public class DiceGame {

	public static void main(String[] args) throws InterruptedException {
		int count = 0;  //to count no of attempt taken to get max number in a die
		
		
		Die obj =new Die(); //creating an object
		obj.setCurrent_side(4); // setting the values of the die
		obj.setName("d6");
		obj.setSides(6);
		System.out.println("The current side up for d6 is before roll is "+obj.getCurrent_side());
	   	obj.roll(); // calling the roll method
	   	System.out.println("Rolling the Die.....\n");
	    Thread.sleep(3000); // this is an optional one to show some reality in console
	   System.out.println("The current side up for d6 is "+ obj.getCurrent_side());
	   System.out.println("\n"); // to differentiate the lines in console
	 
	   
	  Die obj1=new Die(10); //creating the new object
	  obj1.setCurrent_side(9);
	  obj1.setName("d20");
	  obj1.setSides(20); // creating a new die which different from given value in obj1(using setters)
	  System.out.println("The current side up for d20 is before roll is "+obj1.getCurrent_side());
	    obj1.roll();
	    System.out.println("Rolling the Die....\n");
	    Thread.sleep(3000);
	   System.out.println("The current side up for d20 is "+ obj1.getCurrent_side());
	   System.out.println("\n");
	 

	   Die obj2=new Die( 10, 5);
	   obj2.setCurrent_side(5);
	   obj2.setName("Fun_d35");
	   obj2.setSides(35);
	   System.out.println("The Current side up for d35 is before roll is " +obj2.getCurrent_side());
	   obj2.roll();
	   System.out.println("Rolling the Die....\n");
	   Thread.sleep(3000);
	   System.out.println("The current side up for d35 is "+ obj2.getCurrent_side());
	   System.out.println("\n");
	   
	 //loop for getting max value in a die
		
	 		while(obj1.getCurrent_side()!=20) {
	 			
	 			 obj1.roll();
	 			 count++;
	 			 if(obj1.getCurrent_side()!=20) {
	 				 obj1.roll();
	 				 count++;
	 			 }else
	 			 {
	 				 break;
	 			 }
	 		}System.out.print("The number of attempts taken to get max number for a 20 sided Die is "+count);
	}

}
