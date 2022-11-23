package com.bridgelabz.snakeladder;

public class Player {
	/* uc1 rolling dice*/
	public static void rolldice() {
		double player = 0;
		
		System.out.println(" roll the dice ");
		double dicevalue = Math.floor((Math.random() * 6) + 1);
		System.out.println(" dice number is: " + dicevalue);
		/*uc3 player position*/
		
	    player= player + dicevalue;
	    if(player>0) {
	    	System.out.println("start the game by moving dice by dice value ");
	    	
	    }
	    
	    

	}
	
		
		
}
	
