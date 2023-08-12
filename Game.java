package Project;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	int numDice,trials;
	Random rand;
	Scanner scan; //for enter key
	public Game(int numDice, int trials) {
		this.numDice = numDice;
		this.trials = trials;
		rand = new Random();
		scan = new Scanner(System.in);
	}
	public int play(String who, int target){ //who: name of player
		int[] dice = new int[numDice];
		int points =0;
		for(int i=0;i<trials;i++) { //5 trials
			for(int j=0;j<numDice;j++) { //no of dice :3
				dice[j] = rand.nextInt(9)+1; //generate 3 dice comming from random obj
			}
			System.out.println("Press Enter:");
			scan.nextLine();
			for(int j : dice) {
				System.out.print(j + " ");//for each loop to print dice content array
			}
			System.out.println();
			for(int j=0;j<numDice;j++) {
				if(dice[j]==target) points++;
			}
		}
		System.out.println(who + " got " + points + " points");
		return points;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
