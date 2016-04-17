package rPS;

public class PCrandom extends Player {

	@Override
	public String generateRoshambo() {
		// use number from random to return rock paper scissors 
		int x = getRandom();
		if (x == 1){
			return "rock";
		}else if(x == 2){
			return "paper";
		}else{
		return "scissors";
		}
	}

	public int getRandom(){
		double a =  Math.random() * (3 - 1) + 1;
		int random = (int) a;
		return random;
	}
}
