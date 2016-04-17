package rPS;

import java.util.Scanner;

public class UserPlayer extends Player {
	//open Scanner
	Scanner input = new Scanner (System.in);
	
	@Override
	public String generateRoshambo() {
		String userInput= input.nextLine();
		return userInput;
	}

}
