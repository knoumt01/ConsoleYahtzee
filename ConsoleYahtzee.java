import java.util.*;
import java.math.*;

class YahtzeeGame {
	int num_of_rolls_remaining = 2;
	final static int NUM_OF_DICE = 5;
	
	public int rollDice() {
		int diceRoll = (int) (Math.random() * 6) + 1; 
		num_of_rolls_remaining = num_of_rolls_remaining - 1;
		return diceRoll;
	}
	
	public void testGame() {
		System.out.println(NUM_OF_DICE);
		for (int i = 0; i < NUM_OF_DICE; i++) {
			System.out.println(rollDice());
		}
	}
}

public class ConsoleYahtzee {

	public static void main(String[] args) {
		YahtzeeGame game = new YahtzeeGame();
		game.testGame();
	}
}
