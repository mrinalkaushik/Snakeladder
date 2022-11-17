package com.bridgelabz.snakeladder;

public class Snakeladdergame {
	/* uc1 & uc2 :start game at 0 and rolling dice to get number from 1 to 6 */
	public static void rolldice() {
		double player = 0;
		System.out.println(" start postion of player is = 0 ");
		System.out.println(" roll the dice ");
		double dicevalue = Math.floor((Math.random() * 6) + 1);
		System.out.println(" dice number is: " + dicevalue);
	}

	public static void main(String[] arg) {
		System.out.println("Welcome to snake lader game");
		Snakeladdergame.rolldice();
	}
}
