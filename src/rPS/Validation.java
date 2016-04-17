package rPS;

import java.util.Scanner;

public class Validation {

	// open scanner
	Scanner input = new Scanner(System.in);

	// check that yes/no question validated
	public String checkYesOrNo() {
		String x = input.nextLine();
		while (!x.equalsIgnoreCase("y") && !x.equalsIgnoreCase("n")) {
			System.out.println("You must enter \"y\" for yes or \"n\" for no.");
			System.out.println("Would you like the list in alphabetical order (y/n)?: ");
			x = input.nextLine();
		} // end while
		return x;
	}

	// while loop for userInput for categories not valid prompt user
	public String checkUserInput() {
		String userInput = input.nextLine();
		while (!userInput.equalsIgnoreCase("rock") && !userInput.equalsIgnoreCase("paper")
				&& !userInput.equalsIgnoreCase("scissors")) {
			System.out.println("You can only enter either rock, paper or scissors.");
			System.out.print("Please enter you choice: ");
			System.out.print("Please enter movie category: ");
			userInput = input.nextLine();
		}
		return userInput;
	}

	// check that yes/no question validated
	public String checkPCplayer() {
		String pcPlayer = input.nextLine();
		while (!pcPlayer.equalsIgnoreCase("beginner") && !pcPlayer.equalsIgnoreCase("master")) {
			System.out.println("You must enter either Beginner or Master.");
			System.out.println("Would you like to play against Beginner or Master?: " + "\n");
			pcPlayer = input.nextLine();
		} // end while
		return pcPlayer;
	}
}
