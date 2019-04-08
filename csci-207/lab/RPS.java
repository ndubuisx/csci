/****************************************************************************** 
 * Lab 5 - RPS
 * 
 * Rock, Paper, Scissors game.
 * Author: Emmanuel Ndubuisi
 * Date: April 8, 2019
 * 
 * Compilation:  javac RPS.java
 * Execution:    java RPS
 ******************************************************************************/
import java.util.Scanner;
public class RPS{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String[] options = {"Rock", "Paper", "Scissors"};
		int player_score = 0;
		int comp_score = 0;
		int rounds = 0;
		String comp = "";
		String human = "";
		
		// keep track of the number of rounds
		while(rounds < 3){
			// random option for computer
			comp = options[(int)(Math.random() * options.length)];
			// player input
			System.out.println("Enter \"Rock\", \"Paper\", or \"Scissors\"");
			human = input.nextLine();
			
			System.out.printf("%s vs %s! ", human, comp);
			
			// decide the winner
			if(human.equals(comp)){
				System.out.println("Draw!");
			}else if((human.equals("Rock") && comp.equals("Scissors")) || (human.equals("Paper") && comp.equals("Rock")) || (human.equals("Scissors") && comp.equals("Paper"))){
				System.out.println("Player Wins!");
				player_score++;
			}else if((human.equals("Scissors") && comp.equals("Rock")) || (human.equals("Rock") && comp.equals("Paper")) || (human.equals("Paper") && comp.equals("Scissors"))){
				System.out.println("Computer Wins!");
				comp_score++;
			}
			// increment rounds
			rounds++;
		}
		// if statement to determine player with the highest score																																 
		System.out.printf("Player has won %d times and the computer has won %d times \n", player_score, comp_score);
		if(player_score > comp_score){
			System.out.println("The Player wins");
		}else if(player_score < comp_score){
			System.out.println("The Computer Wins!");
		}else{
			System.out.println("It is a draw!");
		}
	}
}
