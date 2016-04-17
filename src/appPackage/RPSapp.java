package appPackage;

import java.util.Scanner;

import rPS.PCrandom;
import rPS.PCrock;
import rPS.Player;
import rPS.Validation;

public class RPSapp {
	// Global variable
	static String pcPick;

	public static void main(String[] args) {
		// open scanner
		Scanner input = new Scanner(System.in);

		// variables
		String pcPick = "";
		
		//open validation
		Validation v1 = new Validation ();
		
		// title
		System.out.println("Welcome to Rock Paper Scissors!");

		// prompt user for name
		System.out.print("Please enter your name: ");
		String playerName = input.nextLine();
		
		// pick player to play against
		System.out.print("Would you like to play against Beginner or Master?: " + "\n");
		String pcPlayerchoice = v1.checkPCplayer();

		//check for keepGoing while
		String keepGoing = "y";
		while (keepGoing.equalsIgnoreCase("y")){
		// get PC pick
		pcPick = getPCpick(pcPlayerchoice);

		// prompt user for selection
		System.out.print("Please select rock , paper or scissors: ");
		String userPick = v1.checkUserInput();

		//blank line
		System.out.println();
		
		// print user and pc picks
		System.out.println("You picked: " + userPick + ".");
		System.out.println("PC player picked: " + pcPick + "." + "\n");

		// pick winner & print to console
		pickPrintWinner(pcPick, playerName, pcPlayerchoice, userPick);
		
		//empty line
		System.out.println();
				
		//prompt user for keepGoing choice
		System.out.print("Continue game (y/n)?: ");
		keepGoing = v1.checkYesOrNo();
		
		}//end keepGoingwhile
		
		//bye message
		System.out.println("Goodbye!!");
	}

	public static String getPCpick(String pcPlayerchoice) {
		String pcPick;
		if (pcPlayerchoice.equalsIgnoreCase("beginner")) {
			Player pcPickRock = new PCrock();
			pcPick = pcPickRock.generateRoshambo();
		} else {
			Player PCrandom = new PCrandom();
			pcPick = PCrandom.generateRoshambo();
		}
		return pcPick;
	}

	public static void pickPrintWinner(String pcPick, String playerName, String pcPlayerchoice, String userPick) {
		if (userPick.equalsIgnoreCase("rock")) {
			if (pcPick.equalsIgnoreCase("paper")) {
				System.out.println(pcPlayerchoice + " wins!");
				return;// to end while of condition meet
			}
			if (pcPick.equalsIgnoreCase("scissors")) {
				System.out.println(playerName + " wins!");
			}
			if (pcPick.equalsIgnoreCase("rock")) {
				System.out.println("Tie Game!");
			}
		} // end rock if

		if (userPick.equalsIgnoreCase("paper")) {
			if (pcPick.equalsIgnoreCase("scissors")) {
				System.out.println(pcPlayerchoice + " wins!");
				return;// to end while of condition meet
			}
			if (pcPick.equalsIgnoreCase("rock")) {
				System.out.println(playerName + " wins!");
			}
			if (pcPick.equalsIgnoreCase("paper")) {
				System.out.println("Tie Game!");
			}
		} // end paper if

		if (userPick.equalsIgnoreCase("scissors")) {
			if (pcPick.equalsIgnoreCase("rock")) {
				System.out.println(pcPlayerchoice + " wins!");
				return;// to end while of condition meet
			}
			if (pcPick.equalsIgnoreCase("paper")) {
				System.out.println(playerName + " wins!");
			}
			if (pcPick.equalsIgnoreCase("scissors")) {
				System.out.println("Tie Game!");
			}
		} // end scissors if
	}

}
